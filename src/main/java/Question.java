import java.util.Scanner;


public class Question {
    //Instant Variables
    private String question;
    private int totalMarks; 
    private String answer; 
    private String studentAnswer; 


    // Constructor 
    public Question(String question, int totalMarks, String answer) {
        this.question = question;
        this.totalMarks = totalMarks;
        this.answer = answer;
        this.studentAnswer = ""; // initialize to empty string
}

//AskQuestion method as specified
public void AskQuestion(Scanner scanner) {
    System.out.println(question + " (" + totalMarks + " marks)");
    System.out.print("Your answer: ");
    this.studentAnswer = scanner.nextLine(); // read user input
}

//method to check answer 
public int CheckAnswer() {
    if (this.answer.equals(this.studentAnswer)) {
        return this.totalMarks;
    } else {
        return 0;
    }
}

}


