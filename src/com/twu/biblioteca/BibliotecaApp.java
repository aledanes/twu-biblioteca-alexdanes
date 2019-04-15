package com.twu.biblioteca;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("\n Welcome to biblioteca! Your one-stop-shop for great book titles in Bangalore \n" );
        System.out.println("Menu:\n");
        System.out.println("[1] List of books");
        System.out.println("[2] Other option");
        System.out.println("[3] Display something else \n");

        ListOfBooks book1 = new ListOfBooks ("HEAD FIRST JAVA", "Bert Bate", 2003);
        ListOfBooks book2 = new ListOfBooks ("TDD BY EXAMPLE", "Kent Beck", 2000);
        ListOfBooks book3 = new ListOfBooks ("CLEAN CODE", "Robert Martin", 2008);


        Scanner in = new Scanner(System.in);
        boolean done = false;
        int i = 0;
        while (!done) {
            System.out.print("Enter your choice:");
            try {
                i = in.nextInt();
                if (i > 0 && i < 4) {
                    done = true;
                }
                else{
                        System.out.println("Choose one of the options displayed  [1], [2] or [3]");
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("Invalid input type! It must be an integer");
                    in.nextLine();
                }
            }
        in.close();



        switch (i) {
            case 1:
                book1.displayBook();
                book2.displayBook();
                book3.displayBook();
                break;
            case 2:
                System.out.println("Something else");
                break;
            case 3:
                System.out.println("Display something else");
                break;
        }

    }
}
