package com.prince;

public class AddCommand extends Command{

    private Dixionary dixionary;
    private String word;

    public AddCommand(String word){
        super("add", word);
        this.word = word;
    }

    @Override
    public void execute(){
        dixionary.addWord(word);
    }

}
