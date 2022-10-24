import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        // Define question numbers and answer number
        int firstNum, secondNum, result;
        // Generate random integer between 1 to 10
        firstNum = 1 + rand.nextInt(10);
        secondNum = 1 + rand.nextInt(10);
        // Infinite loop
        while(true) {
            // Ask question
            System.out.printf("How much is %d times %d\n",firstNum,secondNum);
            // Get answer
            result = sc.nextInt();
            // If answer is correct print very good and generate new number
            if(result == (firstNum*secondNum)){
                System.out.println("Very good!\n");
                firstNum = 1 + rand.nextInt(10);
                secondNum = 1 + rand.nextInt(10);
            }
            // Otherwise print no try again
            else {
                System.out.println("No. Please try again.\n");
            }
        }

    }
}