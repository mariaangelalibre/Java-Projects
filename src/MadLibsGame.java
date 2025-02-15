import java.util.Scanner;
public class MadLibsGame {
    public static void main(String[] args){
        // Scanner = class , scanner = object
        Scanner scanner = new Scanner(System.in);
        String firstAdjective;
        String firstNoun;
        String secondAdjective;
        String firstVerb;
        String thirdAdjective;

        System.out.println("Enter an adjective (description): ");
        firstAdjective = scanner.nextLine();

        System.out.println("Enter a noun (animal or person): ");
        firstNoun = scanner.nextLine();

        System.out.println("Enter an adjective (description): ");
        secondAdjective = scanner.nextLine();

        System.out.println("Enter a verb end with -ing (action): ");
        firstVerb = scanner.nextLine();

        System.out.println("Enter an adjective (description): ");
        thirdAdjective = scanner.nextLine();

        System.out.println("Today I went to a " + firstAdjective + " zoo.");
        System.out.println("In an exhibit, I saw a " + firstNoun + ".");
        System.out.println(firstNoun + " was " + secondAdjective + " and " + firstVerb + "!");
        System.out.println("I was " + thirdAdjective + "!");

        scanner.close();
    }
}