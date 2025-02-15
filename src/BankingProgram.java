import java.util.Scanner;

public class BankingProgram  {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        boolean isRunning = true;
        double balance = 0;

        while (isRunning) {
            System.out.println("***************\nBANKING PROGRAM\n***************");
            System.out.println("1.Show Balance\n2.Deposit\n3.Withdraw\n4.Exit\n***************");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit();
                    break;
                case 3:
                    balance -= withdraw(balance);
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("EXIT.");
                    System.out.println("Thank you.");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        System.out.println("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount < 0){
            System.out.println("Invalid amount.");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance){
        System.out.println("Enter the amount to withdraw: ");
        double withdraw = scanner.nextDouble();
        if (withdraw>balance){
            System.out.println("Not enough balance.");
            return 0;
        }
        else if (withdraw < 0){
            System.out.println("Invalid amount.");
            return 0;
        }
        else{
            return withdraw;
        }
    }
}
