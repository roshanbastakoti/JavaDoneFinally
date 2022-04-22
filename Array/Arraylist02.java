import java.util.ArrayList;
public class Arraylist02 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("guava");
        fruits.add("grapes");
        fruits.add("orange");
        System.out.println(fruits);
        
        for (int i=0; i<fruits.size();i++)
        System.out.println(fruits.get(i));
        
    }
    
    
}
