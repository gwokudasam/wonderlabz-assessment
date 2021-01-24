package com.wonderlabz.conversions.service.impl;


import com.wonderlabz.conversions.dto.CelsiusRequestDTO;
import com.wonderlabz.conversions.dto.KelvinTempRequestDTO;
import com.wonderlabz.conversions.dto.KilometreRequestDTO;
import com.wonderlabz.conversions.dto.MileRequestDTO;
import com.wonderlabz.conversions.service.api.ConversionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * <p>
 * Conversion Service Unit Tests
 * </p>
 *
 * @author Samuel Gwokuda <gwokudasam@gmail.com>
 * @version v1.0
 * @since v1.0
 */
@SpringBootTest
class ConversionServiceTest {

    /**
     * Creates an instance of {@link ConversionService}
     * dependency-injected by the spring container
     */
    @Qualifier("conversionServiceImpl")
    @Autowired
    private ConversionService conversionService;

    private static final KelvinTempRequestDTO KELVIN_TEMP_REQUEST_DTO = new KelvinTempRequestDTO(373.15D);

    private static final CelsiusRequestDTO CELSIUS_REQUEST_DTO = new CelsiusRequestDTO(100D);

    private static final MileRequestDTO MILE_REQUEST_DTO = new MileRequestDTO(100D);

    private static final KilometreRequestDTO KILOMETRE_REQUEST_DTO = new KilometreRequestDTO(100D);

    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    void testKelvinToCelsius() {
        final double celsiusTemp = conversionService.kelvinToCelsius(KELVIN_TEMP_REQUEST_DTO);
        assertEquals(100D, celsiusTemp, "100 degrees centigrade should be equal to 373.15K");
    }

    @Test
    void testCelsiusToKelvin() {
        final double kelvinTemp = conversionService.celsiusToKelvin(CELSIUS_REQUEST_DTO);
        assertEquals(373.15D, kelvinTemp, "373.15K should be equal to 100 degrees centigrade");
    }

    @Test
    void testMilesToKilometres() {
        final double kilometres = conversionService.milesToKilometres(MILE_REQUEST_DTO);
        assertEquals(160.9344D, kilometres, "100 miles should be equal to 160.934km");
    }

    @Test
    void testKilometresToMilesConversion() {
        final double miles = conversionService.kilometresToMiles(KILOMETRE_REQUEST_DTO);
        assertEquals(62.13712D, miles, "100 km should be equal to 6213712 mi");
    }
}