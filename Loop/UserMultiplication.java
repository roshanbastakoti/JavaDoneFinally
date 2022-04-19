import java.util.Scanner;

public class UserMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number from 1 to 10");

        int x = scan.nextInt();

        for (int i = 1; i<=10 ; i++){
            System.out.println(x + "*"   + i + " = " + (x * i));

        }

        scan.close();

    
    }
    
}
