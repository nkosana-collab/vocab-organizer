package com.prince;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dixionary {

     private List<Word> words;
     static Scanner scanner;

     public Dixionary(){

        words = new ArrayList<>(); // This should be the referance to mySQL lite database.
     }

     public void addWord(String wordString){
        // This should add to mySQL lite database.
        scanner = new Scanner(System.in);

        System.out.println("DEFINATION: ");
        String defination = scanner.nextLine();
        System.out.println("USECASE: ");
        String usecase = scanner.nextLine();

        Word word = new Word(wordString, defination, usecase);
        words.add(word);
     }

     public void printWord(Word word){
        System.out.println(word.getWord());
     }
     
     public void searchWord(String searchedWord){

        for(Word word : words){
            if(word.getWord().equalsIgnoreCase(searchedWord)){
               word.printWord();
               return;
            }
        }
        System.out.println("No match");
     }
}
