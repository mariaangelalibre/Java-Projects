import java.util.Scanner;
import java.util.Random;

public class DiceRollerProgram {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int total = 0;
        dice();

        System.out.print("Enter the number of dice to roll: ");
        int rolls = scanner.nextInt();

        if (rolls > 0) {
            for (int i = 0; i < rolls; i++) {
                int diceNumber = random.nextInt(1, 7);
                printDie(diceNumber);
                System.out.println("You rolled: " + diceNumber);
                total += diceNumber;
            }
            System.out.println("Total of all rolls: " + total);
        }
        else {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }
    static void dice(){
        String diceGame = """
                   _______
                  /\\ o o o\\
                 /o \\ o o o\\_______
                <    >------>   o /|
                 \\ o/  o   /_____/o|
                  \\/______/     |oo|
                        |   o   |o/
                        |_______|/
                """;
        System.out.println(diceGame);
    }
    static void printDie(int rolls){
        String dice1 = """
                 ---------
                |         |
                |    o    |
                |         |
                 ---------
                """;
        String dice2 = """
                 ---------
                |  o      |
                |         |
                |      o  |
                 ---------
                """;
        String dice3 = """
                 ---------
                |  o      |
                |    o    |
                |      o  |
                 ---------
                """;
        String dice4 = """
                 ---------
                |  o   o  |
                |         |
                |  o   o  |
                 ---------
                """;
        String dice5 = """
                 ---------
                |  o   o  |
                |    o    |
                |  o   o  |
                 ---------
                """;
        String dice6 = """
                 ---------
                |  o   o  |
                |  o   o  |
                |  o   o  |
                 ---------
                """;
        switch (rolls){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");
        }
    }
}