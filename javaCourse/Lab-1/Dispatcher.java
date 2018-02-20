package com.scrubele;

import java.util.Date;

public class Dispatcher {
    public static void main(String[] args) {
        Movie empty = new Movie();
        Movie harryPotter = new Movie("Harry potter and the philosopher's stone", "Fantasy",
                "Chris Columbus", new Date(97, 6, 26));
        Movie inception = new Movie("Inception", "Science fiction",
                "Christopher Nolan", new Date(2010, 7, 8), 100000005);

        System.out.println(empty.toString());
        System.out.println(harryPotter.toString());
        System.out.println(inception.toString());

        inception.printSum();
        Movie.printStaticSum();

        empty.resetValues("The Intouchables ", "Drama", "Olivier Nakache",
                new Date(2011,11,2), 44800000);

        System.out.println(empty.toString());

        empty.printSum();
        Movie.printStaticSum();
    }
}
