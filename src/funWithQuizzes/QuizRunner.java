package funWithQuizzes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class QuizRunner {

    public static void main(String[] args) {
	// write your code here
        HashMap<Character, String> multChoice1 = new HashMap<>();
        multChoice1.put('a', " 8 bit");
        multChoice1.put('b', " 16 bit");
         multChoice1.put('c', " 32 bit");
        multChoice1.put('d', " 64 bit");
        MultipleChoice q1 = new MultipleChoice("What is the size of int variable?", multChoice1,"c", 5,"Multiple Choice");

        HashMap<Character, String> multChoice2 = new HashMap<>();
        multChoice2.put('a', " Int");
        multChoice2.put('b', " Object");
        multChoice2.put('c', " String");
        multChoice2.put('d', " class");
        MultipleChoice q2 = new MultipleChoice("Which of the following primitive datatypes?", multChoice2, "a", 5, "Multiple Choice");

        //True or False
        TrueFalse q3 = new TrueFalse("Int is a primitive Datatype?(Answer t or f)", "t", 2, "True/False");
        TrueFalse q4 = new TrueFalse("Object is a primitive Datatype?(Answer t or f)", "f", 2, "True/False");

        //Checkbox
        HashMap<Character, String> checkbox1 = new HashMap<>();
        checkbox1.put('a', " .nextFloat() ");
        checkbox1.put('b', " .hasNext() ");
        checkbox1.put('c', " .nextLine() ");
        checkbox1.put('d', " .next()");
        String [] answer = new String[] {"c","d"};
        CheckBox q5 = new CheckBox("Which of the following Scanner methods should you use to return an expected String input? Check ALL that apply.", checkbox1, answer, 10, "Checkbox");

        HashMap<Character, String> checkbox2 = new HashMap<>();
        checkbox2.put('a', "name");
        checkbox2.put('b', "age");
        checkbox2.put('c', "mass");
        checkbox2.put('d', "species");
        String [] answer2 = new String[] {"a", "d"};
        CheckBox q6 = new CheckBox("Assume that we define a Pet class that uses the fields name, age, mass, and species.\n" +
                "\n" +
                "Assuming you do not give your pet away, which of these fields should be declared final?", checkbox2, answer2, 10, "Checkbox");


        Quiz quiz = new Quiz();
        quiz.addQuestion(q5);
        quiz.addQuestion(q6);
        quiz.addQuestion(q3);
        quiz.addQuestion(q4);
        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.runQuiz();
    }
}
