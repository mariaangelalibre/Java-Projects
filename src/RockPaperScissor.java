import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String move;
        int randomChoice;
        String computerMove = "";
        String playAgain;

        do {
            System.out.print("Enter your move (rock, paper, scissor): ");
            move = scanner.nextLine();

            randomChoice = random.nextInt(1, 4);

            switch (randomChoice) {
                case 1: {
                    computerMove = "rock";
                    System.out.println("Computer choice: " + computerMove);
                    if (move.contains("paper")) {
                        System.out.println("You win!");
                    } else if (move.contains("scissor")) {
                        System.out.println("You lose!");
                    } else if (move.contains("rock")) {
                        System.out.println("Tie!");
                    }
                    break;
                }
                case 2: {
                    computerMove = "paper";
                    System.out.println("Computer choice: " + computerMove);
                    if (move.contains("scissor")) {
                        System.out.println("You win!");
                    } else if (move.contains("rock")) {
                        System.out.println("You lose!");
                    } else if (move.contains("paper")) {
                        System.out.println("Tie!");
                    }
                    break;
                }
                case 3: {
                    computerMove = "scissor";
                    System.out.println("Computer choice: " + computerMove);
                    if (move.contains("rock")) {
                        System.out.println("You win!");
                    } else if (move.contains("paper")) {
                        System.out.println("You lose!");
                    } else if (move.contains("scissor")) {
                        System.out.println("Tie!");
                    }
                    break;
                }
            }
            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("yes"));
        scanner.close();
    }
}
