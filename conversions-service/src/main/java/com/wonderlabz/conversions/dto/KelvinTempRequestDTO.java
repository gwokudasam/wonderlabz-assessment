package com.wonderlabz.conversions.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;


/**
 * A DTO for the Kelvin input request.
 *
 * @author Samuel Gwokuda <gwokudasam@gmail.com>
 * @version v1.0
 * @since v1.0
 * @see java.lang.Record
 */
public record KelvinTempRequestDTO(@NotNull(message = "Kelvin temperature is required") @JsonProperty("k") Double kelvin) {
}
