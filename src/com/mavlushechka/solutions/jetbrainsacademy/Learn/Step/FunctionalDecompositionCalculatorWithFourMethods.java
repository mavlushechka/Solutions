package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

public class FunctionalDecompositionCalculatorWithFourMethods {

    public static void subtractTwoNumbers(long firstNumber, long secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }


    public static void sumTwoNumbers(long firstNumber, long secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }


    public static void divideTwoNumbers(long firstNumber, long secondNumber) {
        System.out.println(secondNumber == 0 ? "Division by 0!" : firstNumber / secondNumber);
    }


    public static void multiplyTwoNumbers(long firstNumber, long secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }
}
