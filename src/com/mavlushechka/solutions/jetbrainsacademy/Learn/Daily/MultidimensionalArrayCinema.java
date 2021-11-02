package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

import java.util.Scanner;

class Cinema {

    private final byte[][] places;

    public Cinema(byte[][] places) {
        this.places = places;
    }

    public int getRowWithFreeSpaces(int spaces) {
        for (int i = 0; i < places.length; i++) {
            int foundSpaces = 0;
            for (int j = 0; j < places[i].length; j++) {
                if (places[i][j] == 0) {
                    foundSpaces++;
                } else {
                    foundSpaces = 0;
                }

                if (foundSpaces == spaces) {
                    return i + 1;
                }
            }
        }
        return 0;
    }
}

public class MultidimensionalArrayCinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seatsInEachRows = scanner.nextInt();
        byte[][] places = new byte[rows][seatsInEachRows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsInEachRows; j++) {
                places[i][j] = scanner.nextByte();
            }
        }
        Cinema cinema = new Cinema(places);
        System.out.println(cinema.getRowWithFreeSpaces(scanner.nextInt()));
    }
}
