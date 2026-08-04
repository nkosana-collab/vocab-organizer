package com.prince;

public class Word {

    private String word;
    private String meaning;
    private String usecase;

    public Word(String word, String meaning, String usecase){
        
        this.word = word;
        this.usecase = usecase;
        this.meaning = meaning;

    }

    public String getWord(){
        return word;
    }
    public String getMeaning() {
        return meaning;
    }
    public String getUsecase() {
        return usecase;
    }
}
