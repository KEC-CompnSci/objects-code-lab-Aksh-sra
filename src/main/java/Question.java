import java.util.Scanner;


public class Question {
    //Instant Variables
    private String questions;
    private int totalMarks; 
    private String answer; 
    private String studentAnswer; 


    //constructor 
    public Question(String questions, int totalMarks, String answer, String studentAnswer) {
    this.question = question; 
    this.totalMarks = totalMarks; 
    this.answer = answer;
    this.studentAnswer = ""; 
}

//method to ask question
public void AskQuestions(Scanner Scanner) {
    Systren.out.println(question + "(" + totalMarks + "marks)"); 
    System.out.println("YourAnswer: ");
    studentAnswer = scanner.nextLine(); 
}

//method to check answer 
public int CheckAnswer() {
    if (studentAnswer != null && studentAnswer.equals(answer)) {
        return totalMarks;
    } else {
        return 0;
    }
}

}

