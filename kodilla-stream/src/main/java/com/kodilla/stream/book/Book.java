package com.kodilla.stream.book;

public final class Book {

    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final String signature;


    public Book(String author, String title, int yearOfPublication, String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return String.format("Book: %s, %s, %d, signature: %s.", title, author, yearOfPublication, signature);
    }
}
