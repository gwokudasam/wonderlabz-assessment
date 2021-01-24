package com.wonderlabz.conversions.service.impl;

import com.wonderlabz.conversions.dto.CelsiusRequestDTO;
import com.wonderlabz.conversions.dto.KelvinTempRequestDTO;
import com.wonderlabz.conversions.dto.KilometreRequestDTO;
import com.wonderlabz.conversions.dto.MileRequestDTO;
import com.wonderlabz.conversions.service.api.ConversionService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

/**
 * <p>
 * Service implementation of the {@link ConversionService}
 * </p>
 * Implements the {@link ConversionService} service contract
 *
 * @author Samuel Gwokuda <gwokudasam@gmail.com>
 * @version v1.0
 * @see ConversionService
 * @since v1.0
 */
@Service
@Log4j2
public class ConversionServiceImpl implements ConversionService {

    @Override
    public double celsiusToKelvin(@Valid CelsiusRequestDTO celsiusRequestDTO) {
        return 0;
    }

    @Override
    public double kelvinToCelsius(@Valid KelvinTempRequestDTO kelvinTempRequestDTO) {
        return 0;
    }

    @Override
    public double milesToKilometres(@Valid MileRequestDTO mileRequestDTO) {
        return 0;
    }

    @Override
    public double kilometresToMiles(@Valid KilometreRequestDTO kilometreRequestDTO) {
        return 0;
    }
}
