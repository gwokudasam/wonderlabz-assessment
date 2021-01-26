package com.wonderlabz.roulette.dto;

import com.wonderlabz.roulette.enumeration.BetOutcome;
import com.wonderlabz.roulette.enumeration.BetType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * An dto for a Bet, containing all data pertaining to a bet
 *
 * @author Samuel Gwokuda <gwokudasam@gmail.com>
 * @version v1.0
 * @since v1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bet implements Serializable {

    @Serial
    private static final long serialVersionUID = 2017694590901194195L;

    private String playerName;
    private BetType betType;
    private BigDecimal betAmount;
    private byte betNumber;
    private BetOutcome outcome;
    private BigDecimal winnings;
}
