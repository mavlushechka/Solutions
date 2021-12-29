package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

import java.util.Scanner;

public class ProcessingStringsParseUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.next();

        String[] parameters = url.substring(url.indexOf('?') + 1).split("&");

        boolean containsPass = false;
        String password = "";

        for (String parameter : parameters) {
            if (parameter.split("=").length >= 2) {
                System.out.println(parameter.split("=")[0] + " : " + parameter.split("=")[1]);
                if ("pass".equals(parameter.split("=")[0])) {
                    containsPass = true;
                    password = parameter.split("=")[1];
                }
            } else {
                System.out.println(parameter.split("=")[0] + " : not found");
            }
        }
        if (containsPass) {
            System.out.println("password : " + password);
        }
    }
}
