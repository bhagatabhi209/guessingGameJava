import java.util.*;
import java.util.Random;

public class NumGessingGame {
    public static void main(String[] args) {
        Random ran= new Random();
        int rendNum= ran.nextInt(100);
        System.out.println("Guess the number:");
        Scanner sc= new Scanner(System.in);

        int count=1;
        while (true){
            int userNum = sc.nextInt();
            if (userNum==rendNum){
                System.out.println("congratulation!!! you guess the number in "+count+" tries");
                break;
            } else if (userNum>rendNum) {
                System.out.println("Good trie!!! guess lower than " +userNum);
                count++;
            }else{
                System.out.println("Good trie!!! guess higher than "+userNum);
                count++;
            }
        }

    }
}
