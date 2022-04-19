public class Employee {
    double salary;
    String category;
    String name;

    Employee() {
        this.name = "ram";
        this.salary = 5000;
        this.category = "peon";
    }

    Employee(String name, double salary, String category) {
        this.name = name;
        this.salary = salary;
        this.category = category;
    }

    Employee(String name, String category) {
        this.name = name;
        this.category = category;

    }

    public double IncreasedSalaryViceAssistance() {

        return 0.2 * this.salary;

    }
    public double IncreasedsalaryAssistance() {

        return 0.3 * this.salary;

    }public double IncreasedSalaryManager() {

        return 0.4 * this.salary;

    }

    public static void main(String[] args) {
        // Before the increase of salary

        Employee roshan = new Employee("roshan", 500000, "Manager");
        Employee sakar = new Employee("sakar", 40000, "Assistance");
        Employee achyut = new Employee("achyut", 30000, "ViceAssistance");

        // Before increase of salary
    
        System.out.println("Before the increment : ");
        System.out.println("The salary of roshan(Manager) is " + (roshan.salary));
        System.out.println("The salary of sakar(Assistance) is " + (sakar.salary));
        System.out.println("The salary of achuyt(ViceAssistance) is " + (achyut.salary));
        System.out.println("");
        System.out.println("");

        // After the increase of salary
        System.out.println("After the increment according to designation :");
        System.out.println("The salary of  roshan(Manager) is " + (roshan.salary + roshan.IncreasedSalaryManager()));
        System.out.println("The salary of  sakar(Assistance) is " + (sakar.salary + sakar.IncreasedsalaryAssistance()));
        System.out.println("The salary of  achuyt(ViceAssistance) is " + (achyut.salary + achyut.IncreasedSalaryViceAssistance()));

    }

}
