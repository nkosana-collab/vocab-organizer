package com.prince.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.prince.model.Word;

public class Dixionary {

     private List<Word> words;
     static Scanner scanner;

     public Dixionary(){

        words = new ArrayList<>(); // This should be the referance to mySQL lite database.
     }
     
     public void addNewWord(Word word){
      this.words.add(word);
     }

     public void addWord(String wordString){
        
        if(wordString.isEmpty())throw new IllegalArgumentException("A word cannot be empty!");

        // This should add to mySQL lite database.
        scanner = new Scanner(System.in);

        System.out.println("DEFINATION: ");
        String defination = scanner.nextLine();
        System.out.println("USECASE: ");
        String usecase = scanner.nextLine();

        Word word = new Word(wordString, defination, usecase);
        addNewWord(word);
     }

     public void printWord(Word word){
        System.out.println(word.getSummary());
     }
     
     public Word searchWord(String searchedWord){

        for(Word word : words){
            if(word.getWord().equalsIgnoreCase(searchedWord)){
               word.getSummary();
               return word;
            }
        }
        throw new IllegalArgumentException("There is no match");
     }
}
