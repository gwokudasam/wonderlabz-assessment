package com.wonderlabz.conversions.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

/**
 * A DTO for the miles input request.
 *
 * @author Samuel Gwokuda <gwokudasam@gmail.com>
 * @version v1.0
 * @since v1.0
 * @see java.lang.Record
 */
public record MileRequestDTO(
        @NotNull(message = "Input in miles is required") @PositiveOrZero(message = "Please enter a positive value") @JsonProperty("m") Double miles) {
}
