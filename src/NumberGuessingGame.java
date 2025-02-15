import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num;
        int randomNum;
        String guess;
        int attempts = 0;

        System.out.println("Number Guessing Game");
        System.out.println("Guess the number between 1-100");
        randomNum = random.nextInt(1,101);

        do {
            System.out.print("Enter a guess: ");
            num = scanner.nextInt();
            attempts++;
            if (num > randomNum){
                System.out.println("TOO HIGH! Try again");
            }
            else if (num < randomNum){
                System.out.println("TOO LOW! Try again");
            }
            else {
                System.out.println("Congratulations! You guessed the random number " + randomNum);
                System.out.println("Total number of attempts " + attempts);
            }
        } while (num != randomNum);

        scanner.close();
    }
}
