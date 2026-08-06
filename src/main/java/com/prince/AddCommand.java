package com.prince;

public class AddCommand extends Command{

    private Dixionary dixionary;
    private String word;

    public AddCommand(String word, Dixionary dixionary){
        super("add", word, dixionary);
        this.word = word;
        this.dixionary = dixionary;
    }

    @Override
    public void execute(){
        dixionary.addWord(word);
    }

}
