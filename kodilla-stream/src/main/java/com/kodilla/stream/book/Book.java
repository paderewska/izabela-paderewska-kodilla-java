package com.kodilla.stream.book;

public final class Book {
    private final String title;
    private final String author;
    private final int year;
    private final String signature;

    public Book(final String author, final String title,
                final int yearOfPublication, final String signature) {
        this.author = author;
        this.title = title;
        this.year = yearOfPublication;
        this.signature = signature;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", signature='" + signature + '\''+
                '}';
    }
}
