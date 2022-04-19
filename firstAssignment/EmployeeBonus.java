import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the salary of Employee");
        double salary = scan.nextDouble();

        System.out.println("Enter the employee year of service");
        int year = scan.nextInt();

        if (year > 5) {

            double bonus = 0.05 * salary;
            System.out.println("The bonus to be received by an Employee is " + bonus);
        }

        else {
            double bonus = salary;
            System.out.println("The bonus to be received by an  Employee is  " + salary);
        }
        scan.close();
    }

}
