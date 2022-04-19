import java.util.Scanner;
public class PrimeNumber01 {
    public static void main(String[] args) {
        int count = 0 ;


        Scanner scan = new Scanner ( System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        scan.close();

        for  (int i = 2; i<n; i++){
            if (n%i==0){
            count++;
            break;
        }
    }

        if (count==0){
            System.out.println("It is a prime number");

        }
        else
        {
            System.out.println("It is not a prime number");
        }
    

    }

}
