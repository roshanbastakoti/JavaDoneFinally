// import java.util.Scanner;

public class TaxCalculation {
    double tax;
    double income;
    double taxableincome;

    public double CalculateTax(double income) {

        if (income <= 100000) {

            tax = 0;
            return tax;
        }

        else if (income > 100000 && income <= 150000) {

            taxableincome = income - 100000;
            tax = 0.1 * taxableincome;
            return tax;
        }

        else if (income > 150000 && income <= 250000) {
            taxableincome = income - 150000;
            tax = 0.2 * taxableincome + 5000;
            return tax;
        } else {
            taxableincome = income - 250000;
            tax = 0.3 * taxableincome + 25000;
            return tax;
        }

    }

    public static void main(String[] args) {

        TaxCalculation C = new TaxCalculation();

        System.out.println("The tax to be paid for 99000 is : " + C.CalculateTax(99000));
        System.out.println("The tax to be paid for 300000 is : " + C.CalculateTax(300000));
        System.out.println("The tax to be paid for 800000 is : " + C.CalculateTax(800000));
        System.out.println("The tax to be paid for 2000000 is : " + C.CalculateTax(2000000));

    }

}
