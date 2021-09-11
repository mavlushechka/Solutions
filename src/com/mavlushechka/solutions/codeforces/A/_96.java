package com.mavlushechka.solutions.codeforces.A;

import java.util.Scanner;

public class _96 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String players = input.next();
        boolean firstTeam = players.contains("0000000");
        boolean secondTeam = players.contains("1111111");
        System.out.print((firstTeam || secondTeam) ? "YES" : "NO");
    }
}
