import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Enter your address");
        String address = scan.nextLine();

        User u1 = new User(name, address);
        System.out.println(u1.getName());

        File  f1 = new File("Users\\roshan\\Desktop\\roshan.txt");
        
        try {
            boolean value = f1.createNewFile();
            if (value){
                System.out.println("The file is created");
            }
            else {
                System.out.println("The file doesn't exist");
            }

            //To write a file
            String data = "I am roshan";
            System.out.println();
            FileWriter fw = new FileWriter("Users\\roshan\\Desktop\\roshan.txt");
            fw.write(data);
            fw.write(u1.getName());
            System.out.println(" ");
            fw.write (u1.getAddress()); 
            System.out.println(" ");
            System.out.println("File saved");
            fw.close();
            
            //To read a file
            // FileReader fr = new FileReader("Users\\roshan\\Desktop\\roshan.txt");
            // fr.read (u1.getName());



        }

        catch (Exception e){
            e.getStackTrace();
        }





    }
}
