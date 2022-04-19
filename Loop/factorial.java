import java.util.Scanner;

public class factorial {


    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in);
        System.out.println("Enter the number");
        int x = scan.nextInt();
        int a = 1;


        for (int i=1 ; i <=x ; i++){
            a= a*i;

            
        }
        System.out.println("The factorial of the given number is "+ a);
    }
    
}
