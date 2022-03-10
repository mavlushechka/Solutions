package com.mavlushechka.solutions.learning;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface SomeAnnotation {
    String description();
}

public class Reflection {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Class<SomeClass> someClass = SomeClass.class;
        Field field = someClass.getField("name");
        Constructor<SomeClass> constructorWithNoParameters = someClass.getConstructor();
        Constructor<SomeClass> constructorWithParameters = someClass.getConstructor(String.class);
        Method methodWithNoParameters = someClass.getMethod("getName");
        Method methodWithParameters = someClass.getMethod("setName", String.class);

        System.out.println(someClass.getAnnotation(SomeAnnotation.class));
        System.out.println(field.getAnnotation(SomeAnnotation.class));
        System.out.println(constructorWithNoParameters.getAnnotation(SomeAnnotation.class));
        System.out.println(constructorWithParameters.getAnnotation(SomeAnnotation.class));
        System.out.println(methodWithNoParameters.getAnnotation(SomeAnnotation.class));
        System.out.println(methodWithParameters.getAnnotation(SomeAnnotation.class));
    }
}

@SomeAnnotation(description = "Class")
class SomeClass {
    @SomeAnnotation(description = "Field")
    public String name;

    @SomeAnnotation(description = "Constructor with no parameters")
    public SomeClass() {
    }

    @SomeAnnotation(description = "Constructor with parameters")
    public SomeClass(String name) {
        this.name = name;
    }

    @SomeAnnotation(description = "Method with no parameters")
    public String getName() {
        return name;
    }

    @SomeAnnotation(description = "Method with parameters")
    public void setName(String name) {
        this.name = name;
    }
}
