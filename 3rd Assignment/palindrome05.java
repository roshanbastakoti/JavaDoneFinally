import java.util.Scanner;

public class palindrome05 {
    public static void main(String[] args) {
        int number = 0;
        int reversenumber = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        number = scan.nextInt();

        int N = number;

        
        while (number!= 0) {
            reversenumber = reversenumber * 10;
            reversenumber = reversenumber + number % 10;
            number = number / 10;

        }
        if (N==reversenumber) {
            System.out.println("It is a palindrome");
            
        }
        else {
            System.out.println("It is not a palindrome");
        }


        
    }
}
