package com.prince.model;

public class Word {

    private String word;
    private String defination;
    private String usecase;

    public Word(String word, String defination, String usecase){
        
        this.word = word;
        this.usecase = usecase;
        this.defination = defination;

    }

    public String getWord(){
        return word;
    }
    public String getDefination() {
        return defination;
    }
    public String getUsecase() {
        return usecase;
    }

    public String getSummary(){
        
        return "WORD:\n" + getWord() + "\nDEFINATION:\n" + getDefination() + "\nUSECASE:\n" + getUsecase();
    }
}
