import java.util.Scanner;

public class Fivedigitnumber {

public static int firstint (int number){
    return number/10000;
}

public static int fourth(int number) {
    return (number%100)/10;
}
public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter the  five digit number");
    int number = scan.nextInt();
    System.out.println("The first digit is : " + Fivedigitnumber.firstint(number));
    System.out.println("The second last digit is : " + Fivedigitnumber.fourth(number));

    System.out.println("The sum of  first and second last number is : "+ (Fivedigitnumber.firstint(number)+ Fivedigitnumber.fourth(number)));

}
    
}
