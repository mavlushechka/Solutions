package com.mavlushechka.solutions.university._4._5;

import java.util.Scanner;
import java.util.HashMap;

public class _6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int numberOfBars;
       int[] lengthOfBars;
       HashMap<Integer, Integer> numberOfBarsByLength = new HashMap<>();
       int maxNumberOfBarsByLength = 0;

       do {
           numberOfBars = scanner.nextInt();
       } while (numberOfBars < 1 || numberOfBars > 100000);
       lengthOfBars = new int[numberOfBars];
       for (int i = 0; i < lengthOfBars.length; i++) {
           int numberOfBarByLength;

           do {
               lengthOfBars[i] = scanner.nextInt();
           } while (lengthOfBars[i] < 1 || lengthOfBars[i] > 1000);
           numberOfBarByLength = numberOfBarsByLength.get(lengthOfBars[i]) == null ? 0 : numberOfBarsByLength.get(lengthOfBars[i]);
           numberOfBarsByLength.put(lengthOfBars[i], numberOfBarByLength + 1);
           maxNumberOfBarsByLength = Math.max(maxNumberOfBarsByLength, numberOfBarByLength + 1);
       }

       System.out.println(maxNumberOfBarsByLength + " " + numberOfBarsByLength.size());
    }
}
