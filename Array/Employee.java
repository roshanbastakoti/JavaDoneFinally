public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getid (){
        return id;
    }
    public void setid (){
        this.id=id;
    }
    public String getname (){
        return name;
    }
    public void setname(){
        this.name=name;
    }
    public double getsalary (){
        return salary;
        
    }
    public void setsalary (){
        this.salary=salary;
    }

    public void  TaxCalculation (){
            double tax = 0.015 * salary;

            System.out.println("The tax amount of "+ name + "is"+  tax );
        }
    
}
