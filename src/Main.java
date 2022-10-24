import java.security.SecureRandom;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        // Define correct and wrong answer arrays
        String[] correct = new String[] {"Very Good!","Excellent!",
                "Nice Work!","Keep up the good work!"};
        String[] wrong = new String[] {"No. Please try again.",
                "Wrong. Try once more", "Don't give up!", "No. Keep trying."};
        // Question numbers and answer number definition
        int firstNum, secondNum, result;
        // Generate first and second number between 1 to 10
        firstNum = 1 + rand.nextInt(10);
        secondNum = 1 + rand.nextInt(10);
        // Infinite loop
        while(true) {
            // Print question
            System.out.printf("How much is %d times %d\n",firstNum,secondNum);
            // Get answer
            result = sc.nextInt();
            // If answer is correct print random correct statement and generate new numbers
            if(result == (firstNum*secondNum)){
                System.out.println(correct[rand.nextInt(4)]);
                firstNum = 1 + rand.nextInt(10);
                secondNum = 1 + rand.nextInt(10);
            }
            // Otherwise print random wrong statement
            else {
                System.out.println(wrong[rand.nextInt(4)]);
            }
        }
    }
}