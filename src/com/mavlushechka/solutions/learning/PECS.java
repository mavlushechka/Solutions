package com.mavlushechka.solutions.learning;

import java.util.List;

public class PECS {
    public static class A {}

    public static class B extends A {}

    public static class C extends B {}

    public void testCoVariance(List<? extends B> myListOfBObjects) {
        B b = new B();
        C c = new C();
        // myListOfBObjects.add(b); // does not compile
        // myListOfBObjects.add(c); // does not compile
        A a = myListOfBObjects.get(0);
    }

    public void testContraVariance(List<? super B> myListOfBObjects) {
        B b = new B();
        C c = new C();
        myListOfBObjects.add(b);
        myListOfBObjects.add(c);
        // A a = myListOfBObjects.get(0); // does not compile
    }
}
