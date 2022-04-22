import java.util.ArrayList;

public class Arraylist01 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("guava");
        fruits.add("grapes");
        fruits.add("orange");
        System.out.println(fruits);
        // Indexing
        System.out.println(fruits.get(4));
        // Seting newobject
        fruits.set(4, "Banana");
        System.out.println(fruits);
        // Remove the object
        fruits.remove(1);
        System.out.println(fruits.size());


        //check  the  current array list
        System.out.println(fruits);

        //after clearing the array
        fruits.clear();
        System.out.println();

    }

}
