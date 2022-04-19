public class BankaccountOutput {

    public static void main(String[] args) {
        BankAccount02 B1 = new BankAccount02("Roshan", 123456, "Saving", 100000);
        System.out.println(B1.getName());
        System.out.println(B1.getAccount());
        System.out.println(B1.getType());
        System.out.println(B1.getbalance());
        System.out.println();

        BankAccount02 B2 = new BankAccount02("Sakar", 0123456, "current", 200000);
        // B2.setName("Sakar Khatri");
        System.out.println(B2.getName());
        System.out.println(B2.getAccount());
        System.out.println(B2.getType());
        System.out.println(B2.getbalance());
        // System.out.println(B2.setAccount());
        // System.out.println(B2.setType());
        // System.out.println(B2.setbalance());

    }
    
}
