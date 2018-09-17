import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
/**
 * Solution class for code-eval.
 */
class Quiz {
    Quiz() {

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
    public static void loadQuestions(final Scanner s,
     final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        int  i = 0;
        /*String[] inp1;*/
        String inp;
        while (i < questionCount) {
            inp = s.nextLine();
            String[] inp1 = inp.split(":");
            if (inp1.length == 5 && inp1[0].length() > 0) {
                quiz.questions[i] = inp1[0];
                quiz.choices[i] = inp1[1];
                quiz.correctAns[i] = inp1[2];
                quiz.marks[i] = inp1[3];
                quiz.penality[i] = inp1[4];
                String[] inp2 = quiz.choices[i].split(",");
                if (inp2.length < 2) {
                    System.out.println(
                        "trick question  does not have enough answer choices");
                    break;
                }
                if (Integer.parseInt(quiz.correctAns[i]) > 4) {
                    System.out.println(
                    "Error! Correct answer choice number is out of range for "
                     + inp1[0]);

                    break;
                }
                if (Integer.parseInt(quiz.marks[i]) < 0) {
                    System.out.println(
                        "Invalid max marks for question about sony");
                    break;
                }
                if (Integer.parseInt(quiz.penality[i]) > 0) {
                    System.out.println(
                        "Invalid penalty for question about sony");
                    break;
                }
                i ++;
                quiz.i ++;
            }

            else {
                System.out.println("Error! Malformed question");
                break;
            }
        }


        if (quiz.i == questionCount) {
            if (questionCount == 0) {
                System.out.println("Quiz does not have questions");
            } else {
                //System.out.println(Arrays.toString(quiz.choices));
                System.out.println(questionCount + " are added to the quiz");
            }
        }
    }


    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s,
     final Quiz quiz, final int answerCount) {
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
        if (quiz.i > 0) {
            int i1 = 0;
            Scanner sc1 = s;
            while (i1 < answerCount) {
                System.out.println(quiz.questions[i1]
                    + "(" + quiz.marks[i1] + ")");
                String[] options = quiz.choices[i1].split(",");
                int c = 1;
                for (String option : options) {
                    if (c == options.length) {
                        System.out.println(option);
                    } else {
                        System.out.print(option + "\t");
                    }
                    c++;
                }
                // System.out.println();
                String answer = sc1.nextLine();
                String[] res = answer.split(" ");
                quiz.responses[i1] = res[1];
                i1 += 1;
                System.out.println();
            }
        }
    }

    /**
     * Displays the score report.
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
        //System.out.println("i am not entering");
        if (quiz.i > 0) {
            int total = 0;
            // ArrayList al = new ArrayList(Arrays.asList(quiz.choices));
            //System.out.println("i am here");
            /*List<String> al =
              new ArrayList<String>(Arrays.asList(quiz.choices));*/
            /*
            System.out.println(al); */
            for (int i = 0; i < quiz.i; i++) {
                int correctAns = 0;
                int penality = 0;
                switch (quiz.responses[i]) {
                case "a":
                    quiz.responses[i] = "1";
                    break;
                case "b":
                    quiz.responses[i] = "2";
                    break;
                case "c":
                    quiz.responses[i] = "3";
                    break;
                case "d":
                    quiz.responses[i] = "4";
                    break;
                default:
                    break;
                }
                //System.out.println(quiz.choices[i]);
                String[] inp3 = quiz.choices[i].split(" ");
                /*String[] realInp3 = new String[inp3.length * 2];
                for(int j = 0; j<inp3.length ; j++){
                    realInp3[j] = inp3[j].replace(" ",",").split(",");
                }*/
                //System.out.println(Arrays.toString(realInp3));
                //System.out.println(inp3.length);
                final int three = 3;
                if (inp3.length == three) {
                    //System.out.println(quiz.responses[i]);
                    switch (quiz.responses[i]) {
                    //System.out.println(quiz.responses[i]);
                    case "4":
                        quiz.responses[i] = "1";
                        //System.out.println(quiz.responses[i]);
                        break;
                    case "2":
                        quiz.responses[i] = "2";
                        break;
                    default:
                        break;

                    }
                    // System.out.println();
                }
                /* 
                 System.out.println("-------------------");
                 System.out.println(quiz.responses[i])*/
                String neww = quiz.responses[i];
                if (quiz.correctAns[i].equals(neww)) {
                    //  System.out.println("i am here");
                    correctAns = Integer.parseInt(quiz.marks[i]);
                    System.out.println(quiz.questions[i]);
                    System.out.println
                    (" Correct Answer! - Marks Awarded: " + quiz.marks[i]);
                } else {
                    penality = Integer.parseInt(quiz.penality[i]);
                    System.out.println(quiz.questions[i]);
                    System.out.println
                    (" Wrong Answer! - Penalty: " + quiz.penality[i]);
                }
                total = total + correctAns + penality;
            }
            System.out.println("Total Score: " + total);
        }
    }
}
