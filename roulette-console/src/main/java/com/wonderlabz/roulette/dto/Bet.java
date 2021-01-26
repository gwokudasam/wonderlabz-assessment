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
