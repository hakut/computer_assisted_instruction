import java.security.SecureRandom;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        String[] correct = new String[] {"Very Good!","Excellent!",
                "Nice Work!","Keep up the good work!"};
        String[] wrong = new String[] {"No. Please try again.",
                "Wrong. Try once more", "Don't give up!", "No. Keep trying."};

        int firstNum, secondNum, result;
        firstNum = 1 + rand.nextInt(10);
        secondNum = 1 + rand.nextInt(10);
        while(true) {
            System.out.printf("How much is %d times %d\n",firstNum,secondNum);
            result = sc.nextInt();
            if(result == (firstNum*secondNum)){
                System.out.println(correct[rand.nextInt(4)]);
                firstNum = 1 + rand.nextInt(10);
                secondNum = 1 + rand.nextInt(10);
            }
            else {
                System.out.println(wrong[rand.nextInt(4)]);
            }
        }
    }
}