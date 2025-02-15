import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] symbol = {"❤️","🍕","🎀","🪐","🌟"};
        int balance = 100;
        int amount;
        String symbol1;
        String symbol2;
        String symbol3;
        String playAgain = "y";

        System.out.println("******************\nWelcome to Java Slots\nSymbols: ❤️ 🍕 🎀 🪐 🌟\n******************");

        while ((balance > 0) && (playAgain.equalsIgnoreCase("Y"))){
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            amount = scanner.nextInt();

            if ((amount <= balance) && (amount > 0)){
                System.out.println("Spinning...");
                System.out.println("**************");

                symbol1 = symbol[random.nextInt(0,5)];
                symbol2 = symbol[random.nextInt(0,5)];
                symbol3 = symbol[random.nextInt(0,5)];

                String[] randomSymbols = {symbol1, symbol2, symbol3};

                System.out.println("| " + symbol1 + " | " + symbol2 + " | " + symbol3);
                System.out.println("**************");

                balance -= amount;

                int win = payOut(randomSymbols,amount);

                if (win > 0){
                    System.out.println("You won $" + win);
                    balance += win;
                }
                else {
                    System.out.println("Sorry you lost this round");
                }

                scanner.nextLine();
                System.out.print("Do you want to play again? (Y/N): ");
                playAgain = scanner.nextLine();
            }
            else if (amount < 0){
                System.out.println("Invalid Input");
            }
            else {
                System.out.println("Not enough balance.");
            }
        }

        System.out.println("GAME OVER! Your final balance is $" + balance);

    }
    static int payOut(String[] symbol, int amount){
        if (symbol[0].equals(symbol[1])&&(symbol)[1].equals(symbol[2])){
            return switch (symbol[0]){
                case "❤️" -> amount * 3;
                case "🍕" -> amount * 4;
                case "🎀" -> amount * 5;
                case "🪐" -> amount * 10;
                case "🌟" -> amount * 20;
                default -> 0;
            };
        }
        else if ((symbol[0].equals(symbol[1])) || (symbol[1].equals(symbol[2]))){
            return switch (symbol[1]){
                case "❤️" -> amount * 2;
                case "🍕" -> amount * 3;
                case "🎀" -> amount * 4;
                case "🪐" -> amount * 5;
                case "🌟" -> amount * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
