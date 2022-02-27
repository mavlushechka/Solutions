package com.mavlushechka.solutions.university._4._1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        HashMap<Integer, String> hashMap = new HashMap<>();
        Pattern pattern = Pattern.compile("13", Pattern.MULTILINE);
        int maxGroupCount = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            String number = String.valueOf(scanner.nextInt());
            Matcher matcher = pattern.matcher(number);
            int groupCount = 0;

            while (matcher.find()) {
                groupCount++;
            }
            if (groupCount > maxGroupCount) {
                maxGroupCount = groupCount;
            }
            hashMap.put(groupCount, number);
        }

        System.out.println(hashMap.get(maxGroupCount));
    }
}
