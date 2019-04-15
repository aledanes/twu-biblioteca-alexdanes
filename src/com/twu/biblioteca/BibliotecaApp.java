package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Welcome to biblioteca! Your one-stop-shop for great book titles in Bangalore");


        /*ListOfBooks books1= new ListOfBooks();
        books1.populateListOfBooks();
        books1.displayListOfBooks();*/

        ListOfBooks book1 = new ListOfBooks ("HEAD FIRST JAVA", "Bert Bate", 2003);
        book1.displayBook();

        ListOfBooks book2 = new ListOfBooks ("TDD BY EXAMPLE", "Kent Beck", 2000);
        book2.displayBook();

        ListOfBooks book3 = new ListOfBooks ("CLEAN CODE", "Robert Cecil Martin", 2008);
        book3.displayBook();

    }
}
