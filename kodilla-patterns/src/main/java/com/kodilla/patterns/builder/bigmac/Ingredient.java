package com.kodilla.patterns.builder.bigmac;

public class Ingredient {
    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String PICKLE = "PICKLE";
    public static final String CHILLIES = "CHILLIES";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String PRAWNS = "PRAWNS";
    public static final String CHEESE = "CHEESE";
    final private String extraIngredient;

    public Ingredient(String extraIngredient) {
        if(extraIngredient.equals(LETTUCE) || extraIngredient.equals(ONION) ||
                extraIngredient.equals(BACON) || extraIngredient.equals(PICKLE) ||
                extraIngredient.equals(CHILLIES) || extraIngredient.equals(MUSHROOMS) ||
                extraIngredient.equals(PRAWNS) || extraIngredient.equals(CHEESE)) {
            this.extraIngredient = extraIngredient;
        } else {
            throw new IllegalStateException("Additional ingredient may be LETTUCE or " +
                    "ONION or BACON or PICKLE or CHILLIES or MUSHROOMS or PRAWNS or CHEESE");
        }
    }

    public String getExtraIngredient() {
        return extraIngredient;
    }
}