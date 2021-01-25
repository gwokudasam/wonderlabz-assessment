package com.wonderlabz.conversions.service.api;


import com.wonderlabz.conversions.dto.CelsiusRequestDTO;
import com.wonderlabz.conversions.dto.KelvinTempRequestDTO;
import com.wonderlabz.conversions.dto.KilometreRequestDTO;
import com.wonderlabz.conversions.dto.MileRequestDTO;
import com.wonderlabz.conversions.dto.OutputDTO;

import javax.validation.Valid;

/**
 * Interface that define the general service contract (methods) for the ConversionService
 *
 * <ol>
 *   <li>Service and,
 *   <li>Controller interfaces.
 * </ol>
 *
 * @author Samuel Gwokuda <gwokudasam@gmail.com>
 * @version v1.0
 * @since v1.0
 */
public interface ConversionService {

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
     * @return The converted temperature in kelvin
     * @since v1.0
     */
    OutputDTO celsiusToKelvin(@Valid final CelsiusRequestDTO celsiusRequestDTO);

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
    OutputDTO kelvinToCelsius(@Valid final KelvinTempRequestDTO kelvinTempRequestDTO);

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
    OutputDTO milesToKilometres(@Valid final MileRequestDTO mileRequestDTO);

    /**
     * <p>
     * Convert kilometres(km) to miles(mi)
     * </p>
     *
     * Formula: 1mi = 1.60943km
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
    OutputDTO kilometresToMiles(@Valid final KilometreRequestDTO kilometreRequestDTO);
}
