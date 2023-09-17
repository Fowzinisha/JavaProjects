import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        // Question 1
        System.out.println("Question 1: What is the capital of France?");
        System.out.println("A) London");
        System.out.println("B) Berlin");
        System.out.println("C) Paris");
        System.out.print("Your answer (A/B/C): ");
        char answer1 = scanner.next().toUpperCase().charAt(0);
        if (answer1 == 'C') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong. The correct answer is C) Paris.");
        }

        // Question 2
        System.out.println("Question 2: Which planet is known as the Red Planet?");
        System.out.println("A) Venus");
        System.out.println("B) Mars");
        System.out.println("C) Jupiter");
        System.out.print("Your answer (A/B/C): ");
        char answer2 = scanner.next().toUpperCase().charAt(0);
        if (answer2 == 'B') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong. The correct answer is B) Mars.");
        }

        // Display the final score
        System.out.println("Your final score is: " + score + " out of 2");
        scanner.close();
    }
}
