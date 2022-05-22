package com.mavlushechka.solutions.learning;

import java.io.IOException;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) {
        try (Socket socket = new Socket("whois.internic.net", 43)) {
            String website = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
            int response;

            socket.getOutputStream().write(website.getBytes());
            while ((response = socket.getInputStream().read()) != -1) {
                System.out.print((char) response);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
