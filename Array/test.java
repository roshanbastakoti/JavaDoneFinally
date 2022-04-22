import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> studlist = new ArrayList<Student>();
        
        Scanner scan = new Scanner(System.in);

        for (int i = 0 ; i<5 ; i++){
            System.out.println("Please Enter the name");
            String uname = scan.next();
            System.out.println("Please Enter the address");
            String uadd = scan.next();
            System.out.println("Please Enter the email");
            String uemail = scan.next();



            
            studlist.add(new Student(uname, uadd, uemail));

        }


        
        

    }

}
