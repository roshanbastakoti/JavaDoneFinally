import java.util.Scanner;

public class IntegerAndCharacter {

int i ;
String c ;

public  void FirstSequence (int i, String c){

    System.out.println("The first sequnce is " + i + c);

}

public void SecondSequence (String c , int i){

    System.out.println("The second sequence is " +  c +  i );

}

public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter the first number");
    int i = scan.nextInt();

    System.out.println("Enter the first character");
    String c = scan.next();


    scan.close();

    IntegerAndCharacter A = new IntegerAndCharacter ();
    IntegerAndCharacter B = new IntegerAndCharacter ();


  A.FirstSequence(i, c);
  B.SecondSequence(c, i);
}
    
}
