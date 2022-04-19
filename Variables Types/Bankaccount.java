import java.sql.Types;

public class Bankaccount {
    
    String Name;
    double AccountNumber;
    String Type;
    double balance;

    Bankaccount(String Name, double AccountNumber, String Type, double balance ) {
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.Type = Type;
        this.balance = balance;

    }

    Bankaccount (String Name, double balance){
        this.Name = Name;
        this.balance= balance;

    }

    public void displayName(){
        System.out.println(this.Name);

    }

    public void displayBalance (){
        System.out.println(this.balance);
    }

    public  void DepositAmount (double amount){
        // double amount=0;

        this.balance+=amount;
        // a=a+1;
        // a+=1;
    }

    public void Withdraw (double withdraw){
        // int withdraw=0;
        this.balance-=withdraw;
    }

    public static void main(String[] args) {

    //Checking the balance 
        Bankaccount Roshan = new Bankaccount("Roshan", 01715, "Saving", 100000);
        Bankaccount Sakar = new Bankaccount("Sakar", 200000);

     // To Name & Balance
     Sakar.displayName();
     Sakar.displayBalance();

     Sakar.DepositAmount(200000);
     Sakar.Withdraw(100000);

     Sakar.displayName();
     Sakar.displayBalance();

     






    }



    

}
