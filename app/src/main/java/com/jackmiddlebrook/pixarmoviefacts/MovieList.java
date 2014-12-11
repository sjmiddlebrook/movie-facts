package com.jackmiddlebrook.pixarmoviefacts;

/**
 * Gets the next movie name from the list of movies.
 * Created by jackmiddlebrook on 10/5/14.
 */
public class MovieList {

    private int mIndex = 0;

    private String[] mMovies = {
            "Toy Story",
            "A Bug's Life",
            "Toy Story 2",
            "Monsters, Inc.",
            "Finding Nemo",
            "The Incredibles",
            "Cars",
            "Ratatouille",
            "WALL-E",
            "Up",
            "Toy Story 3",
            "Cars 2",
            "Brave",
            "Monsters University"
    };

    public String getMovie() {


        mIndex++;

        String movie;

        movie = mMovies[mIndex % mMovies.length];

        return movie;
    }

}
