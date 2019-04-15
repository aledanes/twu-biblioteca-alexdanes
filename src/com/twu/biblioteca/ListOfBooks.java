package com.twu.biblioteca;

public class ListOfBooks {

    String bookTitle;
    String bookAuthor;
    int bookYear;

    public ListOfBooks(String title, String author, int year) {
        bookTitle = title;
        bookAuthor = author;
        bookYear = year;
    }

    public void displayBook()
    {
        System.out.println (bookTitle + " by " + bookAuthor + " from " + bookYear );
    }
}
