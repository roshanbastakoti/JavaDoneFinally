import java.util.Scanner;

public class Billcalculation01 {
    

    public static double Unitconsumed(double unit) {
        if (unit <= 100) {
            return 0;
        } else if (unit > 100 && unit < 200) {
            return 5 * (unit-100);
        }

        else {
            return 10 * (unit-200)+500;
        }
    }
  

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the unit consumend");
        int unit = scan.nextInt();

        System.out.println("Total amount to be paid is " + Billcalculation01.Unitconsumed(unit));

    }

}
