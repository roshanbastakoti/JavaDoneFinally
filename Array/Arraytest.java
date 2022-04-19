public class Arraytest {
    public static void main(String[] args) {
        int [] myarray ; //Declaration of array
        myarray = new int[10]; //Instantiation of array
        int [] NewArray = new int [5];
        //Initialization of an array

        NewArray [0]= 5;
        NewArray [1]= 15;
        NewArray [2]= 55;

        for (int i =0; i<5;i++){
            System.out.println(NewArray[i]);
        }
        for (int i : NewArray){
            System.out.println(i);
        }

    }
    
}
