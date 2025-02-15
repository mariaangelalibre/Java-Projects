import java.util.Scanner;

public class CalculatorProgram {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        double firstNum;
        String operator;
        double secondNum;

        System.out.print("Enter the first number: ");
        firstNum = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.nextLine();

        System.out.print("Enter the second number: ");
        secondNum = scanner.nextDouble();

        switch (operator){
            case "+" -> System.out.println(firstNum + secondNum);
            case "-" -> System.out.println(firstNum - secondNum);
            case "*" -> System.out.println(firstNum * secondNum);
            case "/" -> System.out.println(firstNum / secondNum);
            case "^" -> System.out.println(Math.pow(firstNum, secondNum));
            default -> System.out.println("Invalid Operator");
        }
        scanner.close();
    }
}