package com.mavlushechka.solutions;

import java.io.IOException;

public class SwitchCaseExample {
    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println("Справка по оператору:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for\n");
            System.out.println("Выберите нужный пункт:");
            choice = (char) System.in.read();
        } while ( choice < '1' || choice > '5' );

        System.out.print("\n");

        switch (choice) {
            case '1' -> {
                System.out.println("if:");
                System.out.println("if (условие) оператор;");
                System.out.println("else оператор;");
            }
            case '2' -> {
                System.out.println("switch:");
                System.out.println("switch (выражение) {");
                System.out.println("    case константа:");
                System.out.println("        Последовательность операторов");
                System.out.println("        break;");
                System.out.println("    // ...");
                System.out.println("}");
            }
            case '3' -> {
                System.out.println("while:");
                System.out.println("while (условие) оператор;");
            }
            case '4' -> {
                System.out.println("do-while:");
                System.out.println("do {");
                System.out.println("    оператор");
                System.out.println("} while (условие);");
            }
            case '5' -> {
                System.out.println("for:");
                System.out.println("for (инициализация; условие; итерация)");
                System.out.println("    оператор;");
            }
        }
    }
}
