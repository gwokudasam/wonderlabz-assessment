package com.wonderlabz.conversions.endpoint;

import com.wonderlabz.conversions.service.ConversionService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

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
public interface ConversionEndPoint extends ConversionService{
}
