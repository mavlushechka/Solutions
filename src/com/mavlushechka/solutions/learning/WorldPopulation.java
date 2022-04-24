package com.mavlushechka.solutions.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/mavlushechka/solutions/learning/dataset_91069.txt");
        Scanner scanner = new Scanner(file);
        int yearOfLargestIncreaseInPopulation = -1;
        long largestIncreaseInPopulation = Integer.MIN_VALUE;
        long previousYearPopulation = Integer.MIN_VALUE;

        while (scanner.hasNext()) {
            try {
                String[] data = scanner.nextLine().split("\t");
                int year = Integer.parseInt(data[0]);
                long population = Long.parseLong(data[1].replace(",", ""));

                if (previousYearPopulation != Integer.MIN_VALUE && population - previousYearPopulation > largestIncreaseInPopulation) {
                    largestIncreaseInPopulation = population - previousYearPopulation;
                    yearOfLargestIncreaseInPopulation = year;
                }
                previousYearPopulation = population;
            } catch (NumberFormatException numberFormatException) {
                // nothing...
            }
        }
        System.out.println(yearOfLargestIncreaseInPopulation);
    }
}
