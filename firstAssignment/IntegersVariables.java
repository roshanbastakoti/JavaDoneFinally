public class IntegersVariables {

public static void main(String[] args) {

int x = 15;
int y = 8;
int z = 2;  
    

    if (x<y && x<z && z<y) {
    
            System.out.println("The ascending order is "+ x  + ", " + z + " ,"+ y );
        }
        
    
    else if(y<x && y<z && z<x ){
        System.out.println("The ascending order is "+ y +", "+ z + ", "+ x );
    }
    else if (z<x && z<y && x<y){
        System.out.println("The ascening orderr is "+ z + ", " + x + " ," + y );
    }
    else if (x<y && x<z && y<z){
        System.out.println("The ascending order is "+ x+ " " + y +" "+ z );


    }
    else if (y<x && y<z && x<z){
        System.out.println("The ascending order is "+ y+ " " + x +" "+ z );


    }else {
        System.out.println("The ascending order is "+ z+ " " +y +" "+ x );


    }

}
}   