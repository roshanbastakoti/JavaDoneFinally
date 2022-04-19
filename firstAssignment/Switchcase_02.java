import java.util.Scanner;

public class Switchcase_02 {

    public char calculateGrade(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks obtained");
        int x = s.nextInt();
        s.close();

        if (x<25) {
            return  'F' ;
        }

            else if (x>=25 && x<45){
                return 'E';
            }
            else if(x>=45&&x<50){
                return 'D';
            }
            else if (x>=50&&x<60){
                return 'C';
            }
            else if (x>=60&&x<=80){
                return 'B';
            }

            else if (x>80 && x<=100){
                return 'A';
            }

            
            else {
                return 'X';
            }
        }   

        public static void main(String[] args) {
            Switchcase_02 SG = new Switchcase_02();
            char marks = SG.calculateGrade();
                switch (marks) {
                    case 'A' :
                    System.out.println("outstanding");
                        
                        break;
                    case 'B':
                    System.out.println("exel");
                        
                        break;
                    
                        case 'C':
                    System.out.println("good");
                        
                        break;
                    
                        case 'D':
                    System.out.println("ave");
                        
                        break;
    
                     case 'E':
                    System.out.println("poor");
                        
                        break;
    
                    case 'F':
                    System.out.println("you are fail");
                        
                        break;

                    default:
                    System.out.println("Invalid");
                
            }

            
        
        }
}
