package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<Country> countries = new HashSet<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return continentName.hashCode();
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countries=" + countries +
                '}';
    }
}
