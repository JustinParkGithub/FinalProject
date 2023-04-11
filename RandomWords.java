package finalproject;

import java.util.ArrayList;

public class RandomWords {

    //Values for making random words - Written by Hajin, modified by Justin
    private String[] words = {"hello", "hi", "something", "yes", "no", "computer", "science"}; // word bank
    private ArrayList<String> wordsArr = new ArrayList<>();
    private String word;

    //Puts words in String[] to an ArrayList for ease of access, used in GenerateLabel - Written by Justin
    public void makeArrayList() {
        for (int i = 0; i < words.length; i++) {
            wordsArr.add(words[i]);
        }
    }

    //Generates random number that will be the index of the words ArrayList - Written by Hajin, modified by Justin
    public int generateRandomNumber() {
        int max = wordsArr.size() - 1;
        int min = 0;
        int random = (int) (Math.random() * (max - min + 1) + min);
        return random;
    }

    /**
     * Gets the random words from the words ArrayList based on random number
     * generated, then removes that words from the ArrayList, used in GameFrame
     * and GenerateLabel - Written by Hajin, modified by Justin
     */
    public String getRandomWords() {
        if (wordsArr.size() != 0) {
            int randomNumber = generateRandomNumber();
            word = wordsArr.get(randomNumber);
            wordsArr.remove(randomNumber);
            System.out.println(wordsArr);
            return word;
        } else {
            return "";
        }
    }
}
