package com.mavlushechka.solutions.learning;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class SampleResourceBundles {
    public static void main(String[] args) {
        ResourceBundle resourceBundle;

        resourceBundle = ResourceBundle.getBundle("com.mavlushechka.solutions.learning.SampleResourceBundle");
        System.out.println("English version:");
        System.out.println("Title: " + resourceBundle.getString("Title"));
        System.out.println("StopText: " + resourceBundle.getString("StopText"));
        System.out.println("StartText: " + resourceBundle.getString("StartText"));

        System.out.println();

        resourceBundle = ResourceBundle.getBundle("com.mavlushechka.solutions.learning.SampleResourceBundle", Locale.GERMAN);
        System.out.println("German version:");
        System.out.println("Title: " + resourceBundle.getString("Title"));
        System.out.println("StopText: " + resourceBundle.getString("StopText"));
        System.out.println("StartText: " + resourceBundle.getString("StartText"));
    }
}

class SampleResourceBundle extends ListResourceBundle {
    private static final Object[][] contents = {
            {"Title", "My Program"},
            {"StopText", "Stop"},
            {"StartText", "Start"}
    };

    public SampleResourceBundle() {
    }

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}

class SampleResourceBundle_de extends ListResourceBundle {
    private static final Object[][] contents = {
            {"Title", "Mein Programm"},
            {"StopText", "Stoppen"},
            {"StartText", "Start"}
    };

    public SampleResourceBundle_de() {
    }

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}