package funWithQuizzes;
import java.util.ArrayList;
import java.util.Scanner;


public class Quiz {
   private ArrayList<Question> questions = new ArrayList<>();
    private int total;
    private double score;
    private double numberCorrect;

    public Quiz(){
    }
    public void addQuestion(Question q){
        this.questions.add(q);
        this.total += q.getScoreValue();
    }

    public void checkScore(double numberCorrect){
        this.numberCorrect = numberCorrect;
        this.score = this.numberCorrect / this.total;
        this.score *= 100;
    }

    public void runQuiz(){
        Scanner test = new Scanner(System.in);
        for(Question q : questions) {
            q.askQuestion();

            //Checkbox
            if (q.type.equals("Checkbox")) {
                System.out.println("Enter your answers separated by a comma, no spaces. \n");
                String input = test.nextLine().toLowerCase();
                String[] array = input.split(",");
                String[] answers = (String[]) q.getAnswers();
                int subtotal = 0;
                for (int i = 0; i < array.length; i++) {
                    String a = array[i];
                    for (int j = 0; i < answers.length; i++) {
                        String b = answers[j];
                        if (a.equalsIgnoreCase(b)) {
                            subtotal++;
                        }
                    }
                }
                if (subtotal == answers.length) {
                    this.numberCorrect += q.getScoreValue();
                }
            }else if (q.type.equals("Multiple Choice") || q.type.equals("True/False")) {
                System.out.println("Enter a single letter for your answer: ");
                String userInput = test.next().toLowerCase();
                String answer = (String) q.getAnswers();
                if (answer.toLowerCase().equals(userInput)) {
                    this.numberCorrect += q.getScoreValue();
                }
            }
        }
        this.checkScore(numberCorrect);
        System.out.println("Total correct: " + this.numberCorrect + "\n Out of: " +
                this.total + "\n Comes to: " + this.score + " %");
    }


    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getTotal() {
        return total;
    }

    public double getScore() {
        return score;
    }

    public double getNumberCorrect() {
        return numberCorrect;
    }

}
