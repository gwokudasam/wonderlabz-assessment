package com.wonderlabz.conversions.endpoint;

import com.wonderlabz.conversions.dto.CelsiusRequestDTO;
import com.wonderlabz.conversions.dto.KelvinTempRequestDTO;
import com.wonderlabz.conversions.dto.KilometreRequestDTO;
import com.wonderlabz.conversions.dto.MileRequestDTO;
import com.wonderlabz.conversions.dto.OutputDTO;
import com.wonderlabz.conversions.service.api.ConversionService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <p>
 * Interface <code>ConversionEndPoint</code> is a higher level Interface to define <strong>ConversionService</strong>
 * endpoint APIs that follow <code>ConversionService</code> interface. And to be
 * implemented by service controllers.
 * </p>
 *
 * @author Samuel Gwokuda <gwokudasam@gmail.com>
 * @version v1.0
 * @see ConversionService
 * @since v1.0
 */
@RequestMapping(value = "/conversions", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public interface ConversionEndPoint extends ConversionService {

    /**
     * <p>
     * Convert a temperature in celsius(°C) to kelvin(K)
     * </p>
     *
     * Formula: C + 273.15 = K
     *
     * <p><code>curl $HOST:$PORT/api/conversions/ctok \
     *    -H "Content-Type: application/json" --data \
     *    '{"c":"207.90"}'
     * </code></p>
     *
     * @param celsiusRequestDTO  The temperature in celsius to convert
     * @return The converted temperature in kelvins
     * @since v1.0
     */
    @PostMapping(value = "/ctok")
    @Override
    OutputDTO celsiusToKelvin(@RequestBody @Valid final CelsiusRequestDTO celsiusRequestDTO);

    /**
     * <p>
     * Convert a temperature in Kelvin(K) to celsius(°C)
     * </p>
     *
     * Formula: C = K - 273.15
     *
     * <p><code>curl $HOST:$PORT/api/conversions/ktoc \
     *    -H "Content-Type: application/json" --data \
     *    '{"k":"207.90"}'
     * </code></p>
     *
     * @param kelvinTempRequestDTO  The temperature in kelvin to convert
     * @return The converted temperature in celsius
     * @since v1.0
     */
    @PostMapping(value = "/ktoc")
    @Override
    OutputDTO kelvinToCelsius(@RequestBody @Valid final KelvinTempRequestDTO kelvinTempRequestDTO);

    /**
     * <p>
     * Convert miles(mi) to kilometres(km)
     * </p>
     *
     * Formula: 1mi = 1.60943km
     *
     * <p><code>curl $HOST:$PORT/api/conversions/mtok \
     *    -H "Content-Type: application/json" --data \
     *    '{"m":"27.20"}'
     * </code></p>
     *
     * @param mileRequestDTO  The distances in miles to convert
     * @return The converted distance in kilometres
     * @since v1.0
     */
    @PostMapping(value = "/mtok")
    @Override
    OutputDTO milesToKilometres(@RequestBody @Valid final MileRequestDTO mileRequestDTO);

    /**
     * <p>
     * Convert kilometres(km) to miles(mi)
     * </p>
     *
     * Formula: 1km = 0.621371mi
     *
     * <p><code>curl $HOST:$PORT/api/conversions/ktom \
     *    -H "Content-Type: application/json" --data \
     *    '{"k":"34.70"}'
     * </code></p>
     *
     * @param kilometreRequestDTO  The distances in kilometres to convert
     * @return The converted distance in kilometres
     * @since v1.0
     */
    @PostMapping(value = "/ktom")
    @Override
    OutputDTO kilometresToMiles(@RequestBody @Valid final KilometreRequestDTO kilometreRequestDTO);
}
