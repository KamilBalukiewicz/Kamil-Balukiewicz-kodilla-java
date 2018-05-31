package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class ShowMovieStore {
    public static void main(String [] args) {
        MovieStore movieStore = new MovieStore();
        String printedMovies = movieStore.getMovies().entrySet().stream()
                .flatMap(booksTitlesWithTranslations -> booksTitlesWithTranslations.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(printedMovies);

    }
}
