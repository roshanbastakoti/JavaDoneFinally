public class Employee {
    private String name;
    private double salary;
    private String  date;
    Employee(String name, double salary, String date){
        this.name=name;
        this.salary=salary;
        this.date=date;
    }
    public void getName(){
        System.out.println("the name of the employee is "+ this.name);
    } 
    public void getSalary(){
        System.out.println("the salary of the employee is "+this.salary);
    } 
    public void getDate(){
        System.out.println("the date of joining is "+ this.date);
    } 
    
}
