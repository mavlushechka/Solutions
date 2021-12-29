package com.mavlushechka.solutions.jetbrainsacademy.Learn.Step;

public class ComparableImplementComparingByAdditionalFields {

}

class Article implements Comparable<Article> {
    private final String title;
    private final int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article otherArticle) {
        if (this.size != otherArticle.size) {
            return Integer.compare(this.size, otherArticle.size);
        } else {
            return Character.compare(this.title.charAt(0), otherArticle.title.charAt(0));
        }
    }
}