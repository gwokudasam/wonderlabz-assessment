package com.wonderlabz.conversions.service.impl;

import com.wonderlabz.conversions.dto.CelsiusRequestDTO;
import com.wonderlabz.conversions.dto.KelvinTempRequestDTO;
import com.wonderlabz.conversions.dto.KilometreRequestDTO;
import com.wonderlabz.conversions.dto.MileRequestDTO;
import com.wonderlabz.conversions.dto.OutputDTO;
import com.wonderlabz.conversions.service.api.ConversionService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

import static com.wonderlabz.conversions.util.Constants.KELVIN_CONSTANT;
import static com.wonderlabz.conversions.util.Constants.KM_TO_MILE_CONST;
import static com.wonderlabz.conversions.util.Constants.MILE_TO_KM_CONST;

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

    /**
     * {@inheritDoc}
     */
    @Override
    public OutputDTO celsiusToKelvin(@Valid final CelsiusRequestDTO celsiusRequestDTO) {
        log.debug("Request to convert {} centigrade to kelvin", celsiusRequestDTO.celsius());
        return new OutputDTO(celsiusRequestDTO.celsius() + KELVIN_CONSTANT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OutputDTO kelvinToCelsius(@Valid final KelvinTempRequestDTO kelvinTempRequestDTO) {
        log.debug("Request to convert {} kelvin to centigrade", kelvinTempRequestDTO.kelvin());
        return new OutputDTO(kelvinTempRequestDTO.kelvin() - KELVIN_CONSTANT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OutputDTO milesToKilometres(@Valid final MileRequestDTO mileRequestDTO) {
        log.debug("Request to convert {} mi to km", mileRequestDTO.miles());
        return new OutputDTO(mileRequestDTO.miles() * MILE_TO_KM_CONST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OutputDTO kilometresToMiles(@Valid final KilometreRequestDTO kilometreRequestDTO) {
        log.debug("Request to convert {} km to mi", kilometreRequestDTO.kilometres());
        return new OutputDTO(kilometreRequestDTO.kilometres() * KM_TO_MILE_CONST);
    }
}
