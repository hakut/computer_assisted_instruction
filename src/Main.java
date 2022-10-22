import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        int firstNum, secondNum, result;
        firstNum = 1 + rand.nextInt(10);
        secondNum = 1 + rand.nextInt(10);
        while(true) {
            System.out.printf("How much is %d times %d\n",firstNum,secondNum);
            result = sc.nextInt();
            if(result == (firstNum*secondNum)){
                System.out.println("Very good!\n");
                firstNum = 1 + rand.nextInt(10);
                secondNum = 1 + rand.nextInt(10);
            }
            else {
                System.out.println("No. Please try again.\n");
            }
        }

    }
}