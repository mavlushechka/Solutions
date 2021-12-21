package com.mavlushechka.solutions.university._6._0;

class Safe {
    public final String encryptedText;
    public final String decryptedText;
    public final int step;

    public Safe(String decryptedText, int step) {
        this.decryptedText = decryptedText;
        this.step = step;

        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < decryptedText.length(); i++) {
            encryptedText.append((char) (decryptedText.charAt(i) + step));
        }
        this.encryptedText = encryptedText.toString();
    }
}

public class _8 {
    public static void main(String[] args) {
        Safe safe = new Safe("Java", 3);
        System.out.println(safe.encryptedText);
        System.out.println(safe.decryptedText);
    }
}
