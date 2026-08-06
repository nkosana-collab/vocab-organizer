package unitTesting;

import com.prince.model.Word;
import com.prince.services.Dixionary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

public class TestDixionary {

    private String testWord = "money";
    private String testDefination = "a medium of exchange";
    private String testUsecase = "I bought a book with money";

    private static Dixionary dixionary = new Dixionary();

    @Test
    public void searchingEmptyDixionary(){

        // Given that the dictionary is empty, When I try to search any word it should raise and IlligalArgumentException
        assertThrows( IllegalArgumentException.class, () -> {
            dixionary.searchWord(testWord);
        });
    } 

    @Test 
    public void searchingExistingWord(){

        // Given that I have A valid dixionary and I add a word successfully.
        Word word = new Word(testWord, testDefination, testUsecase);
        dixionary.addNewWord(word);

        // When I search for that word then I must get a summury of the word
        assertEquals(dixionary.searchWord(testWord).getSummary(), word.getSummary());
    }
}
