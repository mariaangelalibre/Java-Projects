import java.util.Scanner;

public class WeightAndTemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        int option;

        System.out.println("Conversion Program");
        System.out.println("1: Weight Conversion Program\n2: Temperature Conversion Program");
        System.out.print("Choose among the 2 conversions:");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Weight Conversion Program");
                System.out.print("Enter the weight: ");
                double weight = scanner.nextDouble();
                System.out.println("1: Convert lbs to kgs\n2: Convert kgs to lbs");
                System.out.print("Choose an option: ");
                option = scanner.nextInt();
                double newWeight = (option == 1) ? weight * 0.453592 : weight * 2.20462;
                System.out.printf("The new weight is: %.2f", newWeight);
                break;
            case 2:
                System.out.print("Enter the temperature: ");
                double temp = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
                String conversion = scanner.nextLine();
                double converted = (conversion.equalsIgnoreCase("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
                System.out.printf("%.1f", converted);
                break;
        }
        scanner.close();
    }
}