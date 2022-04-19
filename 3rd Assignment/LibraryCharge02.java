import java.util.Scanner;

public class LibraryCharge02 {

    public static double days (double days){

        if (days<=5){
            return 2*days;
        }

        else if (days>5 && days<=10){
            return 3*(days-5)+ (5*2);
        }

        else if (days>10 && days<=15){
            return 4*(days-10)+ (5*2)+(5*3);
        }
        else {
            return 5* (days-15)+(5*4)+(5*3)+(5*2);  
        }
    }


   public static void main(String[] args) {
    
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the days spent on library");
        int days = scan.nextInt();

        System.out.println("The total to be paid in library is "+ LibraryCharge02.days(days));

    }
}