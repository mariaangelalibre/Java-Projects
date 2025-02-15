import java.util.Scanner;

public class QuizGame {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************\nWelcome to the Java Quiz Game!\n******************************");

        String[] questions = {"Which one is a member of ENHYPEN?",
                             "What is the representative animal of Jungwon?",
                             "Who is the eldest member in ENHYPEN?"
        };
        String[][] choices = {{"1. Yeji","2. Sunoo","3. Eun Woo"},
                              {"1. Cat","2. Dog","3. Hamster"},
                              {"1. Jake","2. Heeseung","3. Jay"}};

        int total = 0;

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for (String choice : choices[i]){
                System.out.println(choice + " ");
            }
            System.out.print("Your guess: ");
            int guess = scanner.nextInt();
            switch (i){
                case 0, 2: {
                    if (guess == 2){
                        System.out.println("CORRECT");
                        total++;
                    }
                    else{
                        System.out.println("WRONG");
                    }
                    break;
                }
                case 1: {
                    if (guess == 1){
                        System.out.println("CORRECT");
                        total++;
                    }
                    else{
                        System.out.println("WRONG");
                    }
                    break;
                }
                default:{
                    System.out.println("Invalid Answer");
                    break;
                }
            }
        }

        System.out.println("Your score is: " + total + " out of " + questions.length);

        scanner.close();
    }


}
