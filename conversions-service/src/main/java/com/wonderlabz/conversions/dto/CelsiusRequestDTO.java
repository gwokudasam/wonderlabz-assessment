package com.wonderlabz.conversions.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

/**
 * A DTO for the celsius input request.
 *
 * @author Samuel Gwokuda <gwokudasam@gmail.com>
 * @version v1.0
 * @since v1.0
 * @see java.lang.Record
 */
public record CelsiusRequestDTO(
        @NotNull(message = "Centigrade temperature is required") @JsonProperty("c") Double celsius) {
}
