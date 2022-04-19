import java.util.Scanner;

public class Attendence {
    
    public double PercentofAttendence(double classattended, double classheld){
        return((classattended/classheld)*100);  
     }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the classes held");
        double classheld = scan.nextDouble();

        System.out.println("Enter the number of classes attended");
        double classattended = scan.nextDouble();


        
        Attendence A =  new Attendence();
        System.out.println("The percentage of class attendance is "+ A.PercentofAttendence(classattended, classheld));

        


        if (A.PercentofAttendence(classattended, classheld) < 75) {
            System.out.println("The student will not be able to stay in class");
        }

        else {
            System.out.println("Student will be able to stay in class");
        }

    }
}
