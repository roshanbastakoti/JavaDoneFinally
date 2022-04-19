public class Swapnumbers01 {

    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        System.out.println("Before swap");

        System.out.println("x is " + x);
        System.out.println("y is " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap :");

        System.out.println("x is " + x);
        System.out.println("y is " + temp);

    }

}
