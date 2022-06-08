package com.mavlushechka.solutions.learning;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.internic.net");
        URLConnection urlConnection = url.openConnection();

        System.out.print("Date: ");
        long date = urlConnection.getDate();
        System.out.println(date != 0 ? new Date(date) : "no date information.");

        System.out.println("Content-Type: " + urlConnection.getContentType());

        System.out.print("Expiration: ");
        date = urlConnection.getExpiration();
        System.out.println(date != 0 ? new Date(date) : "no expiration information.");

        System.out.print("Last-modified: ");
        date = urlConnection.getLastModified();
        System.out.println(date != 0 ? new Date(date) : "no last-modified information.");

        System.out.print("Content length: ");
        long contentLengthLong = urlConnection.getContentLengthLong();
        System.out.println(contentLengthLong != -1 ? contentLengthLong : "content length unavailable.");

        if (contentLengthLong != 0) {
            System.out.println("=== Content ===");
            try (InputStream input = urlConnection.getInputStream()) {
                int data;

                while ((data = input.read()) != -1) {
                    System.out.print((char) data);
                }
            }
        } else {
            System.out.println("No content available.");
        }
    }
}
