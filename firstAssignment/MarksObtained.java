import java.util.Scanner;

public class MarksObtained {
double fullmark = 300;
    

    public static double totalmarks (double science, double engish, double maths){

        return science+engish+maths;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mark in science out of 100 :");
        double science = scan.nextDouble();

        System.out.println("Enter the mark in math out of 100 :");
        double maths = scan.nextDouble();

        System.out.println("Enter the mark in english  out of 100 :");
        double english = scan.nextDouble();

        System.out.println("Enter the full marks of examination");
        double fullmark = scan.nextDouble();

        MarksObtained M = new MarksObtained();


        System.out.println("The total marks obtained is " + (M.totalmarks(science, english, maths)) );
        System.out.println("The percentage obtained is " + (M.totalmarks(science, english, maths)/fullmark)*100);

    }
}
