package com.mavlushechka.solutions.university._5;

import java.util.HashSet;
import java.util.Stack;

public class _9 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        hashSet.add(12);
        hashSet.add(16);
        stack.push(18);
        stack.push(20);
        System.out.println(hashSet);
        System.out.println(stack);
    }
}
