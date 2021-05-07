package com.datastructures;
import com.datastructures.HashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashMapTest {
    // Test to check frequency of word
    @Test
    public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency(){
        String sentence = "To be or not to be";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] words = sentence.toLowerCase().split("");
        for (String word : words){
            Integer value = hashMap.get(word);
            if(value == null){
                value = 1;
            }
            else value = value +1;
            hashMap.add(word, value);
        }
        System.out.println(hashMap);
        int frequency = hashMap.get("to");
        System.out.println(hashMap);
        Assertions.assertEquals(2,frequency);
    }
    // Test to check paranoid frequency
    @Test
    public void givenSentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency()
    {

        String sentance = "Paranoids are not" + " paranoid because they are paranoid but"
                + " because they keep putting themselves" + " deliberately into paranoid avoidable" + " situations";
        HashMap<String, Integer> myHashMap = new HashMap();
        String[] words = sentance.toLowerCase().split(" ");

        for (String word : words)
        {
            Integer value = myHashMap.get(word);

            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(word, value);
        }

        int frequency = myHashMap.get("paranoid");
        System.out.println(myHashMap);
        Assertions.assertEquals(3, frequency);
    }
}

