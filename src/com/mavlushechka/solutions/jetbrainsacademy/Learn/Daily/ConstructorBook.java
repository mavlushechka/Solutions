package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

public class ConstructorBook {

}

class Book {
    public String title;
    public int yearOfPublishing;
    public String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors.clone();
    }
}
