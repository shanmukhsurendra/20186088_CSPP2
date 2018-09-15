import java.util.Scanner;
import java.util.Arrays;
/**
 * Solution class for code-eval.
 */
class Quiz{
	Quiz(){

	}
	/*class Quiz {*/
	String[] questions = new String[10];
	String[] choices = new String[10];;
	String[] correctAns = new String[10];;
	String[] marks = new String[10];;
	String[] penality = new String[10];;
	String[] responses = new String[10];
	int i = 0;

}
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
         int  i = 0;
        while(i < questionCount) {
            String inp = s.nextLine();
            String[] inp1 = inp.split(":");
            quiz.questions[i] = inp1[0];
            quiz.choices[i] = inp1[1];
            quiz.correctAns[i] = inp1[2];
            quiz.marks[i] = inp1[3];
            quiz.penality[i] = inp1[4];
            i ++;
            quiz.i ++;
        }
        System.out.println(questionCount + " are added to the quiz");
    }


    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        /*String[] arr2 = new String[answerCount];
        String[] arr1 =  loadQuestions();
        int j =0;
        for(j=0;j<answerCount;j++){
        System.out.println(Arrays.toString(arr1));
    }*/
     /*for(int i=0; i<4; i++)
    {
        System.out.println(arr[i]);
    }*/
    int i1 = 0;
    Scanner sc1 = s;
    while(i1 < answerCount) {
        System.out.println("question text " + (i1+1) + " (" + quiz.marks[i1] + ")");
        String[] options = quiz.choices[i1].split(",");
        int c = 1;
        for(String option : options) {
            if(c == 4) {
                System.out.println(option);
            }
            else {
                System.out.print(option + "\t");
            }
            c++;
        }
        System.out.println();
        String answer = sc1.nextLine();
        String[] res = answer.split(" ");
        quiz.responses[i1] = res[1];
        i1 += 1;
    }
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
         int total = 0;
        for(int i = 0; i < quiz.i; i++) {
            int correctAns = 0;
            int penality = 0;
            if(quiz.correctAns[i].equals(quiz.responses[i])) {
                correctAns = Integer.parseInt(quiz.marks[i]);
                System.out.println(quiz.questions[i]);
                System.out.println(" Correct Answer! - Marks Awarded: " + quiz.marks[i]);
            }
            else {
                penality = Integer.parseInt(quiz.penality[i]);
                System.out.println(quiz.questions[i]);
                System.out.println(" Wrong Answer! - Penalty: " + quiz.penality[i]);
            }
            total = total + correctAns + penality;
        }
        System.out.println("Total Score: " + total);
    }
}
