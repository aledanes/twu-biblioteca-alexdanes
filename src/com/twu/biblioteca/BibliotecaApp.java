package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Welcome to biblioteca! Your one-stop-shop for great book titles in Bangalore");


        ListOfBooks books1= new ListOfBooks();
        books1.populateListOfBooks();
        books1.displayListOfBooks();

    }
}
