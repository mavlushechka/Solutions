package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JumpSearchSearchInADecreasingArray {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/resources/hyperskill-dataset-59933785.txt"));

        String[] numbers = scanner.nextLine().split(" ");
        String[] targetNumbers = scanner.nextLine().split(" ");
        int[] indexOfTargetNumbers = new int[targetNumbers.length];
        int jumpLength = (int) Math.floor(Math.sqrt(numbers.length));
        int blocksNumber = (int) Math.ceil(Math.sqrt(numbers.length));

        for (int targetNumberIndex = 0; targetNumberIndex < targetNumbers.length; targetNumberIndex++) {
            boolean isTargetElementFound = false;

            for (int blockIndex = 0; blockIndex <= blocksNumber; blockIndex++) {
                int indexOfElementAtBlockIndex = Math.min(blockIndex * jumpLength, numbers.length - 1);
                int elementAtBlockIndex = Integer.parseInt(numbers[indexOfElementAtBlockIndex]);
                int targetElement = Integer.parseInt(targetNumbers[targetNumberIndex]);

                for (int elementIndex = indexOfElementAtBlockIndex; elementAtBlockIndex <= targetElement && elementIndex > indexOfElementAtBlockIndex - jumpLength; elementIndex--) {
                    if (Integer.parseInt(numbers[elementIndex]) == targetElement) {
                        isTargetElementFound = true;
                        indexOfTargetNumbers[targetNumberIndex] = elementIndex;
                        break;
                    }
                }
            }
            if (!isTargetElementFound) {
                indexOfTargetNumbers[targetNumberIndex] = -1;
            }
        }

        for (int indexOfTargetNumber : indexOfTargetNumbers) {
            System.out.print(indexOfTargetNumber + " ");
        }
    }
}
