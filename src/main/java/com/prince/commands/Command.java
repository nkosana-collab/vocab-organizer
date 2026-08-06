package com.prince.commands;

import com.prince.services.Dixionary;

public abstract class Command {

    private String command;
    private String word;
    private Dixionary dixionary;

    public Command(String command){
        this.command = command;
        this.word = "";
    }
    
    public Command(String command, String word, Dixionary dixionary){
        this.command = command;
        this.word = word;
        this.dixionary = dixionary;
    }

    public abstract void execute();

    public static Command create(String instruction, Dixionary dixionary){

        String[] args = instruction.toLowerCase().trim().split(" ");
        return switch (args[0]) {
            case "add" -> new AddCommand(args[1], dixionary);
            case "search" ->  new SearchCommand(args[1], dixionary);
            case "help" -> new HelpCommand();
            default -> throw new IllegalArgumentException("Unsupported command: " + instruction);
        };

    }
    
}
