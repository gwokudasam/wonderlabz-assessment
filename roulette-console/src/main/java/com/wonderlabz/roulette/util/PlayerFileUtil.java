package com.wonderlabz.roulette.util;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * Utility file to load player names from the filesystem
 * </p>
 *
 * @author Samuel Gwokuda <gwokudasam@gmail.com>
 * @version v1.0
 * @since v1.0
 */
@Component
@Log4j2
public final class PlayerFileUtil {

    private final ResourceLoader resourceLoader;

    private final Environment environment;

    @Autowired
    public PlayerFileUtil(final ResourceLoader resourceLoader,
                          final Environment environment) {
        this.resourceLoader = resourceLoader;
        this.environment = environment;
    }

    private String getPlayerDataFileLocation() {
        return environment.getRequiredProperty("application.player-data-location");
    }


    private Resource getPlayersResource() {
        final String playerDataFileLocation = getPlayerDataFileLocation();
        return resourceLoader.getResource(
                "classpath:" + playerDataFileLocation);
    }

    /**
     * Load player names from the filesystem and return them as a {@link Set}
     * @throws IOException if the file is not found
     */
    public Set<String> getPlayerNames() {
        final String playerDataFileLocation = getPlayerDataFileLocation();
        try {
            final File playerFile = new ClassPathResource(playerDataFileLocation).getFile();
            final String playersString = new String(Files.readAllBytes(playerFile.toPath()));
            final String[] players = playersString.split(",");
            return new HashSet<>(Arrays.asList(players));
        } catch (final IOException e) {
            log.error("Error reading player file ", e);
        }
        return Collections.emptySet();
    }
}
