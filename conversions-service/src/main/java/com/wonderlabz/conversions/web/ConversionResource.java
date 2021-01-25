package com.wonderlabz.conversions.web;

import com.wonderlabz.conversions.dto.CelsiusRequestDTO;
import com.wonderlabz.conversions.dto.KelvinTempRequestDTO;
import com.wonderlabz.conversions.dto.KilometreRequestDTO;
import com.wonderlabz.conversions.dto.MileRequestDTO;
import com.wonderlabz.conversions.dto.OutputDTO;
import com.wonderlabz.conversions.endpoint.ConversionEndPoint;
import com.wonderlabz.conversions.service.api.ConversionService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Class <code>ConversionResource</code> is the implementation of the main Conversion
 * Endpoint API definition.
 *
 * @author Samuel Gwokuda <gwokudasam@gmail.com>
 * @version v1.0
 * @see ConversionEndPoint
 * @since v1.0
 */
@RestController
@Log4j2
public class ConversionResource implements ConversionEndPoint {

    /**
     * Conversion service business logic interface.
     */
    private final ConversionService conversionService;

    /**
     * Creates an instance of {@link ConversionResource}
     *
     * @param conversionService The business logic service interface,
     *                          dependency-injected by the spring container
     */
    @Autowired
    public ConversionResource(@Qualifier("conversionServiceImpl") final ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OutputDTO celsiusToKelvin(@Valid final CelsiusRequestDTO celsiusRequestDTO) {
        log.debug("REST request to convert {} centigrade to kelvin", celsiusRequestDTO);
        return conversionService.celsiusToKelvin(celsiusRequestDTO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OutputDTO kelvinToCelsius(@Valid final KelvinTempRequestDTO kelvinTempRequestDTO) {
        log.debug("REST request to convert {} kelvins to centigrade", kelvinTempRequestDTO);
        return conversionService.kelvinToCelsius(kelvinTempRequestDTO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OutputDTO milesToKilometres(@Valid final MileRequestDTO mileRequestDTO) {
        log.debug("REST request to convert {} miles to km", mileRequestDTO);
        return conversionService.milesToKilometres(mileRequestDTO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OutputDTO kilometresToMiles(@Valid final KilometreRequestDTO kilometreRequestDTO) {
        log.debug("REST request to convert {} km to miles", kilometreRequestDTO);
        return conversionService.kilometresToMiles(kilometreRequestDTO);
    }
}
