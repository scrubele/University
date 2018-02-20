package com.scrubele;

import java.util.Date;

public class Movie {
    private String name;
    private String genre;
    private String director;
    private Date dateOfRelease;
    private int budget;
    private static long summaryBudget = 0;

    public Movie() {
    }

    public Movie(String name, String genre, String director, Date dateOfRelease) {
        this.name = name;
        this.director = director;
        this.dateOfRelease = dateOfRelease;
        this.genre = genre;
    }

    public Movie(String name, String genre, String director, Date dateOfRelease, int budget) {
        setName(name);
        setDirector(director);
        setDateOfRelease(dateOfRelease);
        setGenre(genre);
        setBudget(budget);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDateOfRelease(Date dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }
    public void setBudget(int budget) {
        summaryBudget += budget;
        this.budget = budget;
    }

    public void resetValues(String name, String genre, String director, Date dateOfRelease, int budget) {
        setName(name);
        setDirector(director);
        setDateOfRelease(dateOfRelease);
        setGenre(genre);
        setBudget(budget);
    }

    @Override
    public String toString() {

        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", dateOfRelease=" + dateOfRelease +
                ", genre='" + genre + '\'' +
                ", budget=" + budget +
                '}';
    }
    public void printSum() {
        System.out.println("Summary budget of all movies = " + summaryBudget);
    }

    public static void printStaticSum() {
        System.out.println("Summary budget of all movies = " + summaryBudget);
    }

}
