package com.wonderlabz.conversions.service.impl;


import com.wonderlabz.conversions.dto.KelvinTempRequestDTO;
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

    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    void testKelvinToCelsius() {
        final double celsiusTemp = conversionService.kelvinToCelsius(KELVIN_TEMP_REQUEST_DTO);
        assertEquals(100D, celsiusTemp, "100 degrees centigrade should be equal to 373.15K");
    }

}