import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double principal;
        double rate;
        double n;
        double year;
        char currency = '$';
        double compoundInterest;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the # of times compounded per year: ");
        n = scanner.nextDouble();

        System.out.print("Enter the # of years: ");
        year = scanner.nextDouble();

        compoundInterest = principal * Math.pow(1 + (rate/n), n * year);

        System.out.printf("The amount after %.2f years is %c%.2f", year, currency, compoundInterest);

        scanner.close();
    }
}
