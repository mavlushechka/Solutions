package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

public class IntroductionToGenericProgrammingPastryPackingOptimization {

}

class Box<T> {
    private T pie;

    public void put(T pie) {
        this.pie = pie;
    }

    public T get() {
        return this.pie;
    }
}

class Cake { }

class Pie { }

class Tart { }