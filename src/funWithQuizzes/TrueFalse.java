package funWithQuizzes;

public class TrueFalse extends Question{

    public TrueFalse(String query, String correctAnswer, int scoreValue, String type) {
        super(query, correctAnswer, scoreValue, type);
    }
    @Override
    public void askQuestion(){
        System.out.println(this.getQuery() + this.getScoreValue());
    }
}
