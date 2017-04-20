package com.example.model.converter;

import java.math.BigDecimal;

public class MonetaryAmount {

    private String currency;
    private BigDecimal value;

    public MonetaryAmount(String currency, BigDecimal value) {
        this.currency = currency;
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    public String toString() {
        return getCurrency() + " " + getValue();
    }

    public static MonetaryAmount fromString(String s) {
        
    	String[] split = s.split(" ");
        String currency = split[0];
        BigDecimal value = new BigDecimal(split[1]);
        
        return new MonetaryAmount(currency, value);
    }
}

