package pl.matshead.word.generator;

public class WordGenerator {
    public static  String defineWordsLength(String category, int amount){
        String[] wordsArray = Words.valueOf(category).getWords().toString().split(" ");
        StringBuilder result = new StringBuilder();
        if(amount <= wordsArray.length){
            for (int i = 0; i < amount; i++) {
                if (i == amount -1){
                    result.append(wordsArray[i]);
                } else {
                    result.append(wordsArray[i]+ " ");
                }
            }
        }
        return result.toString();
    }

}
