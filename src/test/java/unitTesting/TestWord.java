package unitTesting;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.prince.model.Word;

public class TestWord {

    private String testWord = "money";
    private String testDefination = "a medium of exchange";
    private String testUsecase = "I bought a book with money";

    @Test
    public void wordReturnsSummary(){
        
        // Given that I have added a word correctly to the dictionary.
        Word word = new Word(testWord, testDefination, testUsecase);
        String summary = "WORD:\n" + testWord + "\nDEFINATION:\n" + testDefination + "\nUSECASE:\n" + testUsecase;

        // When I search for the same word I should get a summary of the word.
        assertEquals(word.getSummary(), summary);
        
    }

}
