import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        // Array definition for correct and wrong answers
        String[] correct = new String[] {"Very Good!","Excellent!",
                "Nice Work!","Keep up the good work!"};
        String[] wrong = new String[] {"No. Please try again.",
                "Wrong. Try once more", "Don't give up!", "No. Keep trying."};
        // Question numbers and result input from user
        int firstNum, secondNum, result;
        // Create random numbers between 1 to 10
        firstNum = 1 + rand.nextInt(10);
        secondNum = 1 + rand.nextInt(10);
        // Infinite loop
        while(true) {
            // Total question number is 10 and correct number 0 initially
            int total = 10, correctNum = 0;
            while (true){
                // If 10 questions asked print correct percentage and break loop
                if(total == 0) {
                    System.out.printf("You are %.2f%% correct\n",(float)correctNum/10*100);
                    // If correct number less than 8 which means less than 75% print ask teacher statement
                    if(correctNum<8)
                        System.out.println("Please ask your teacher for extra help.");
                    break;
                }
                // Ask question
                System.out.printf("How much is %d times %d\n",firstNum,secondNum);
                // Get answer
                result = sc.nextInt();
                // If correct increase correct number and decrease total question
                if(result == (firstNum*secondNum)){
                    // Print random string from correct array
                    System.out.println(correct[rand.nextInt(4)]);
                    firstNum = 1 + rand.nextInt(10);
                    secondNum = 1 + rand.nextInt(10);
                    correctNum++;
                    total--;
                }
                else {
                    // Print random string from wrong array and decrease total question
                    System.out.println(wrong[rand.nextInt(4)]);
                    total--;
                }
            }

        }
    }
}