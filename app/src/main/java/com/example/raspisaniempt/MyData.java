package com.example.raspisaniempt;

public class MyData {

    private String movieName;
    private String movieDate;

    public MyData(String movieName, String movieDate) {
        this.movieName = movieName;
        this.movieDate = movieDate;

    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

}
