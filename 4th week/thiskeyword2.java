public class thiskeyword2 {

    String name;
    int age;

    public thiskeyword2(String name) {
        this(21);
        System.out.println("Name of Student : " + name);
    }

    public thiskeyword2(int age) {
        System.out.println("Age of student = " + age);
    }

    public thiskeyword2() {
        this("Roshan");
    }

    public static void main(String[] args) {
        // This calls the third constructor.
        thiskeyword2 T2 = new thiskeyword2();
    }
}
