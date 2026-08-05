package com.prince;

import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {

        /*1. Welcome the user
         *2. Provide valid commands ["add", "search", "help", "quit"] 
         *3. While true keep promping them for their command*/

        System.out.println("Hello And Welcome\n\n" + "Valid Commands Are [\"add\", \"search\", \"help\", \"quit\"]");

        scanner = new Scanner(System.in);

        
    }
}