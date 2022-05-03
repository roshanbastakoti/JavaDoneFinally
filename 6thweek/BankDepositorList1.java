import java.util.Scanner;
import java.util.ArrayList;

public class BankDepositorList1{
    public static void main(String[] args){
        ArrayList<BankAccount> bankAccList=new ArrayList<BankAccount>();
        Scanner scan=new Scanner(System.in);
        for(int i=1;i<6;i++){
            System.out.println("Enter the name of "+i +"th the depositor ");
            String name=scan.next();
            System.out.println("Enter the address of "+i +"th the depositor");
            String address=scan.next();
            System.out.println("Enter the account type of "+i +"th the depositor");
            String accountType=scan.next();
            System.out.println("Enter the balance amount of "+i +"th the depositor");
            double balance=scan.nextDouble();
            System.out.println(" ");
            BankAccount bankAcc=new BankAccount(name,address,accountType, balance);
            bankAccList.add(bankAcc);// for adding
        }
        for(BankAccount bankAccount:bankAccList){
            bankAccount.displayInfo();
            System.out.println(" ");
            // bankAccount.getSalary();
            // employee.getDate();
        }

        bankAccList.get(1).amountDeposit(100000);
        bankAccList.get(1).displayInfo();

        bankAccList.get(0).amountWithdraw(200000);
        bankAccList.get(0).displayInfo();

        bankAccList.get(2).changeAddress("Kavreplanchok");;
        bankAccList.get(2).displayInfo();

        scan.close();


    }
} 