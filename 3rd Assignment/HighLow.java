import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int count;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;
        System.out.println(randomNumber); 

        for ( count = 0; count < 10; count++) {

            System.out.println("Enter your Guessig from 1-100 :");
            int playerGuess = scan.nextInt();

            if (playerGuess == randomNumber) {
                System.out.println("Hurray You win !");
                break;
                
            } else if (playerGuess > randomNumber) {
                System.out.println("Lower!!");
            } else {
                System.out.println("Higher!!");
            }
        }

        if (count == 10){

        System.out.println("Too many guesses try next time");

    }

}

}
