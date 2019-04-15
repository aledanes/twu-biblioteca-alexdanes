package com.twu.biblioteca;

public class ListOfBooks {

    public String[] books;

    public void populateListOfBooks()
    {

        books = new String[3];

        books[0] = "--Head First Java--";
        books[1] = "--TDD by example--";
        books[2] = "--Clean Code--";

    }

    public void displayListOfBooks()
    {
        for (String s: books)
        {
            System.out.println(s);
        }
    }
}
