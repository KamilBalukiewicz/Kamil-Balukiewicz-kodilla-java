package com.kodilla.patterns.builder.bigmac;

public class Bun {
    public static final String SESAME = "SESAME";
    public static final String PLAIN = "PLAIN";
    final private String bunType;

    public Bun(String bunType) {
        if(bunType.equals(SESAME) || bunType.equals(PLAIN)) {
            this.bunType = bunType;
        } else {
            throw new IllegalStateException("Bun may be SESAME or PLAIN");
        }
    }

    public String getBunType() {
        return bunType;
    }
}
