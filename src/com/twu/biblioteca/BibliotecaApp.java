package com.twu.biblioteca;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("\n Welcome to biblioteca! Your one-stop-shop for great book titles in Bangalore \n" );
        System.out.println("Menu:\n");
        System.out.println("[1] List of books");
        System.out.println("[2] Display something else \n");

        ListOfBooks book1 = new ListOfBooks ("HEAD FIRST JAVA", "Bert Bate", 2003);
        ListOfBooks book2 = new ListOfBooks ("TDD BY EXAMPLE", "Kent Beck", 2000);
        ListOfBooks book3 = new ListOfBooks ("CLEAN CODE", "Robert Martin", 2008);


        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int i = in.nextInt();
        switch (i) {
            case 1:
                book1.displayBook();
                book2.displayBook();
                book3.displayBook();
                break;
            case 2:
                System.out.println("something else");
                break;

        }

    }
}
