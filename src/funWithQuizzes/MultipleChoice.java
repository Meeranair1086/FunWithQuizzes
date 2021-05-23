package funWithQuizzes;

import java.util.HashMap;
import java.util.Map;

public class MultipleChoice extends Question{

    private HashMap<Character,String> choices;

    public MultipleChoice(String query, HashMap<Character, String> choices, String answer, int scoreValue, String type) {
        super(query, answer, scoreValue, type);
        this.choices = choices;
    }


    @Override
    public void askQuestion() {
        System.out.println(this.getQuery() + " " + this.getScoreValue() + "points");
        for(Map.Entry<Character,String> entry : this.choices.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}
