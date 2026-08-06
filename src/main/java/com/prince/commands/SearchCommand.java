package com.prince.commands;

import com.prince.services.Dixionary;

public class SearchCommand extends Command{

    private Dixionary dixionary;
    private String word;

    public SearchCommand(String word, Dixionary dixionary){
        super("search", word, dixionary);
        this.word = word;
        this.dixionary = dixionary;
    }

    @Override
    public void execute(){
        System.out.println(dixionary.searchWord(word));;
    }
}
