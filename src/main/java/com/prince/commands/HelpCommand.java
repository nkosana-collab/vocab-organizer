package com.prince.commands;

public class HelpCommand extends Command{
    


    public HelpCommand(){
        super("help");
    }

    @Override
    public void execute(){

        String instructions = "USAGE GUIDE: \n" + "\"add\" -> add [word]\n" + "\"search\" -> search [word]\n" + "\"help\" -> help\n" + "\"quit\"";
        System.out.println(instructions);
    }
}
