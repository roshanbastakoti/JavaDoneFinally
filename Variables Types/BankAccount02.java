public class BankAccount02 {
    private String accountname;
    private int accountnumber;
    private String accounttype;
    private int balance;

    public BankAccount02(String accountname, int accountnumber, String accounttype, int balance) {
        this.accountname = accountname;
        this.accountnumber = accountnumber;
        this.accounttype = accounttype;
        this.balance = balance;
    }

    public String getName() {
        return this.accountname;
    }

    public int getAccount() {
        return this.accountnumber;
    }

    public String getType() {
        return accounttype;
    }

    public int getbalance() {
        return balance;
    }

    public void setName(String accountname) {
        this.accountname = accountname;

    }

    public void setAccount(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setType(String accounttype) {
        this.accounttype = accounttype;
    }

    public void setbalance(int balance) {
        this.balance = balance;
    }
}
