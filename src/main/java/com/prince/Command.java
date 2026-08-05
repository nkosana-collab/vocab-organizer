package com.prince;

public abstract class Command {

    private String command;
    private String word;

    public Command(String command){
        this.command = command;
        this.word = "";
    }
    
    public Command(String command, String word){
        this.command = command;
        this.word = word;
    }

    public abstract String execute();

    public static Command create(String instruction){

        String[] args = instruction.toLowerCase().trim().split(" ");
        return switch (args[0]) {
            case "add" -> new AddCommand(args[1]);
            case "search" ->  new SearchCommand(args[1]);
            case "help" -> new HelpCommand();
            default -> throw new IllegalArgumentException("Unsupported command: " + instruction);
        };

    }
    
}
