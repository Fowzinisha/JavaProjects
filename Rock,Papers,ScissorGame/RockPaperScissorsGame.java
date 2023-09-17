import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.print("Enter your choice (rock/paper/scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();
        
        if (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))) {
            System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
        } else {
            int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors
            String[] choices = {"rock", "paper", "scissors"};
            String computerChoiceStr = choices[computerChoice];
            
            System.out.println("Computer chooses: " + computerChoiceStr);
            System.out.println("You chose: " + userChoice);
            
            if (userChoice.equals(computerChoiceStr)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoiceStr.equals("scissors")) ||
                       (userChoice.equals("paper") && computerChoiceStr.equals("rock")) ||
                       (userChoice.equals("scissors") && computerChoiceStr.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
        
        scanner.close();
    }
}

