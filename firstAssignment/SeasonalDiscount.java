import java.util.Scanner;

public class SeasonalDiscount {

    public double forLaptop(double amount) {
        if (amount <= 25000) {
            return 0;
        }

        else if (amount > 25000 && amount <= 57000) {

            return 0.05;
        }

        else if (amount > 57000 && amount <= 10000) {

            return 0.075;
        }

        else {
            return 0.1;
        }

    }

    public double forPc(double amount) {
        if (amount <= 25000) {
            return 0.05;
        }

        else if (amount > 25000 && amount <= 57000) {

            return 0.075;
        }

        else if (amount > 57000 && amount <= 10000) {

            return 0.1;
        }

        else {
            return 0.15;
        }
    }

    public double netAmount(double amount, char val) {
        double discountPer;
        if (val == 'l') {
            discountPer = forLaptop(amount);
        } else {
            discountPer = forPc(amount);
        }
        double discount = discountPer * amount;
        double netamount = amount - discount;
        return netamount;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the purchase amount");
        int amount = scan.nextInt();

        System.out.println("Enter your name");
        String name = scan.next();

        System.out.println("Enter your address");
        String address = scan.next();

        System.out.println("Enter your L for Laptop & D for Deskotp");
        char val = scan.next().charAt(0);

        SeasonalDiscount offer = new SeasonalDiscount();
        System.out.println(name + " from " + address + " is charged with "+ offer.netAmount(amount, val));
        
        scan.close();

    }
}
