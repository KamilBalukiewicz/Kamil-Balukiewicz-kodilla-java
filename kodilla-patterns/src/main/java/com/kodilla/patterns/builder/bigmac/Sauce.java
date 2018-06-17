package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public static final String STANDARD = "STANDARD";
    public static final String ONEKISLANDS = "ONEKISLANDS";
    public static final String BARBECUE = "BARBECUE";
    final private String sauceType;

    public Sauce(String sauceType) {
        if(sauceType.equals(STANDARD) || sauceType.equals(ONEKISLANDS) || sauceType.equals(BARBECUE)) {
            this.sauceType = sauceType;
        } else {
            throw new IllegalStateException("Sauce can be STANDARD or ONEKISLANDS or BARBECUE");
        }
    }

    public String getSauceType() {
        return sauceType;
    }
}
