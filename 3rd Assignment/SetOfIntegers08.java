import java.util.Scanner;

public class SetOfIntegers08 {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int num = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number except 0");
        num = scan.nextInt();

        do { 

            System.out.println("Enter the number except 0");

            num = scan.nextInt();

            if (num % 2 == 0) {
                evenSum = num + evenSum;

            } else {
                oddSum = num + oddSum;
            }
        }
    

            while(num !=0);

            System.out.println("Even sum = " + evenSum);
            System.out.println(("Odd sum = " + oddSum));

        

    }

}
