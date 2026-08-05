package com.prince;

public class SearchCommand extends Command{

    private Dixionary dixionary;
    private String word;

    public SearchCommand(String word){
        super("search", word);
        this.word = word;
    }

    @Override
    public void execute(){
        dixionary.searchWord(word);
    }
}
