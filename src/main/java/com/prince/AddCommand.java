package com.prince;

public class AddCommand extends Command{

    public AddCommand(String word){
        super("add", word);
    }

    @Override
    public String execute(){
        return "";
    }

}
