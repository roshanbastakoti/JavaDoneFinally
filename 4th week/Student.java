public class Student {
    String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {

        this.name = name;
    }

    public static void main(String[] args) {
        Student S = new Student();
        Student Sakar = new Student("Sakar");
        System.out.println("The name of Student while no string passed is : " + S.name);
        System.out.println("The name of Student while string name is passed is : " + Sakar.name);

    }

}
