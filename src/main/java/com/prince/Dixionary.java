package com.prince;

import java.util.ArrayList;
import java.util.List;

public class Dixionary {

     private static List<Word> words;

     public Dixionary(){

        words = new ArrayList<>(); // This should be the referance to mySQL lite database.
     }

     public void addWord(Word word){
        words.add(word); // This should add to mySQL lite database.
     }

     public void printWord(Word word){
        System.out.println(word.getWord());
     }
     
     public void searchWord(String searchedWord){

        for(Word word : words){
            if(word.getWord().equalsIgnoreCase(searchedWord)){
                printWord(word);
            }
        }
     }
}
