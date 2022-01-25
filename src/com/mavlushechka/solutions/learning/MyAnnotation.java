package com.mavlushechka.solutions.learning;

public @interface MyAnnotation {
    String name();
    int priority();
}

@MyAnnotation(name = "Simple class", priority = 10)
class ClassWithAnnotation {
    @MyAnnotation(name = "Simple method", priority = 5)
    public void methodWithAnnotation() {
        // some actions...
    }

    @Deprecated
    public void deprecatedMethod() {
        // some actions...
    }
}