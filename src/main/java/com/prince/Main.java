package com.prince;

import java.util.Scanner;

import com.prince.commands.Command;
import com.prince.services.Dixionary;

public class Main {

    static Scanner scanner;
    private static Dixionary dixionary = new Dixionary();

    public static void main(String[] args) {

        /*1. Welcome the user
         *2. Provide valid commands ["add", "search", "help", "quit"] 
         *3. While true keep promping them for their command
         */

        System.out.println("Hello And Welcome\n\n" + "Valid Commands Are [\"add\", \"search\", \"help\", \"quit\"]");

        scanner = new Scanner(System.in);
        Command command;

        while(true){

            System.out.println("Enter Command: ");
            String userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("quit")) break;

            try{
                command = Command.create(userInput, dixionary);
                command.execute();

            }catch (IllegalArgumentException e){

                System.out.println("Invalid Input!");
            }
        }
        System.out.println("GOOD-VOCAB-HUNTING!!!");
    }
}