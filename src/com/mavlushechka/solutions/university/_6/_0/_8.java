package com.mavlushechka.solutions.university._6._0;

class Safe {

    private String encryptedText;

    private final String decryptedText;

    private final int step;

    public Safe(String decryptedText, int step) {
        this.decryptedText = decryptedText;
        this.step = step;
        Encrypt();
    }

    private void Encrypt() {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < this.decryptedText.length(); i ++) {
            encryptedText.append((char) (this.decryptedText.charAt(i) + step));
        }
        this.encryptedText = encryptedText.toString();
    }

    @Override
    public String toString() {
        return encryptedText;
    }
}

public class _8 {

    public static void main(String[] args) {
        Safe safe = new Safe("Java", 3);
        System.out.println(safe);
    }
}
