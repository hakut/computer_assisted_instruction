import java.security.SecureRandom;
import java.util.Scanner;

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
            int total = 10, correctNum = 0;
            while (true){
                if(total == 0) {
                    System.out.printf("You are %.2f%% correct\n",(float)correctNum/10*100);
                    if(correctNum<8)
                        System.out.println("Please ask your teacher for extra help.");
                    break;
                }
                System.out.printf("How much is %d times %d\n",firstNum,secondNum);
                result = sc.nextInt();
                if(result == (firstNum*secondNum)){
                    System.out.println(correct[rand.nextInt(4)]);
                    firstNum = 1 + rand.nextInt(10);
                    secondNum = 1 + rand.nextInt(10);
                    correctNum++;
                    total--;
                }
                else {
                    System.out.println(wrong[rand.nextInt(4)]);
                    total--;
                }
            }

        }
    }
}