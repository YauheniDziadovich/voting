package org.dedok.model.budget;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Amount
{
    private String currency;
    private BigDecimal amount;
}
