
public class Statickeyword03 {

    static int a = 10;
    static int b = 20;
    static int sum = a + b;


    public static int Method(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        System.out.println("The sum using the static variables is : " + sum);
        Method(a, b);
        System.out.println("The sum using static method is : "+ Method(10, 30));


    }

}
