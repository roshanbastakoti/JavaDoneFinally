import java.util.Scanner;

public class Average {

    

    public static void main(String[] args) {

        int sum = 0;
        int Average = sum / 7;
        

        for (int i = 1; i <= 7; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the  number");
            int a = scan.nextInt();
            sum = sum + a;
            Average = sum/7;
        

        }
        System.out.println("The sum of seven number is "+ sum);
        System.out.println("The average of seven numberr is "+Average);

    }
}
    


