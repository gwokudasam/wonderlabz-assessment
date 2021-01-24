package com.wonderlabz.conversions.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

/**
 * A DTO for the kilometre input request.
 *
 * @author Samuel Gwokuda <gwokudasam@gmail.com>
 * @version v1.0
 * @since v1.0
 * @see java.lang.Record
 */
public record KilometreRequestDTO(
        @NotNull(message = "Input in kilometres is required") @PositiveOrZero(message = "Please enter a positive value") @JsonProperty("k") Double kilometres) {
}
