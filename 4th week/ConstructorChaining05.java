/**
 * ConstructorChaining
 */
public class ConstructorChaining05 {

    public ConstructorChaining05() {
        this("Constructor");
        System.out.println("Default Constructor");
    }

    public ConstructorChaining05(String str) {
        System.out.println("With one parameter");
    }

    public static void main(String[] args) {
        ConstructorChaining05 C = new ConstructorChaining05();
    }

}
