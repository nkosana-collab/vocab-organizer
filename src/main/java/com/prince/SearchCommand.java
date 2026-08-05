package com.prince;

public class SearchCommand extends Command{

    public SearchCommand(String word){
        super("search", word);
    }

    @Override
    public String execute(){
        return "";
    }
}
