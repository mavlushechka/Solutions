package com.mavlushechka.solutions.learning;

import java.util.ArrayList;
import java.util.Scanner;

public class CricketPlayers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<CricketPlayer> cricketPlayers = new ArrayList<>();
        ArrayList<CricketPlayer> bt = new ArrayList<>();
        ArrayList<CricketPlayer> bw = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            System.out.println("Player " + i);
            cricketPlayers.add(createPlayer(i));
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            CricketPlayer cricketPlayer = cricketPlayers.get(i);

            if (cricketPlayer.averageRunsPerMatch() > 25) {
                bt.add(cricketPlayer);
            }
            if (cricketPlayer.averageWicketsPerMatch() > 1) {
                bw.add(cricketPlayer);
            }
        }

        displayPlayers(bw, bt);
    }

    public static CricketPlayer createPlayer(int number) {
        System.out.print("Enter average runs per match: ");
        int averageRunsPerMatch = scanner.nextInt();
        System.out.print("Enter average wickets per match: ");
        int averageWicketsPerMatch = scanner.nextInt();

        return new CricketPlayer(number, averageRunsPerMatch, averageWicketsPerMatch);
    }

    public static void displayPlayers(ArrayList<CricketPlayer> bw, ArrayList<CricketPlayer> bt) {
        System.out.println("Bowlers:");
        for (CricketPlayer bowler : bw) {
            System.out.println("Player " + bowler.number());
            System.out.println("Average runs per match: " + bowler.averageRunsPerMatch());
            System.out.println("Average wickets per match: " + bowler.averageWicketsPerMatch());
        }

        System.out.println("\nBatsmen:");
        for (CricketPlayer batsman : bt) {
            System.out.println("Player " + batsman.number());
            System.out.println("Average runs per match: " + batsman.averageRunsPerMatch());
            System.out.println("Average wickets per match: " + batsman.averageWicketsPerMatch());
        }
    }
}

record CricketPlayer(int number, int averageRunsPerMatch, int averageWicketsPerMatch) {
}