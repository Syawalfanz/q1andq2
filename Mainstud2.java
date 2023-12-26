import java.util.Scanner;

// Base class representing a bank account
class Bank {
    private long accnum;

    // Constructor to initialize the account number
    public Bank(long accnum) {
        this.accnum = accnum;
    }

    // Getter method to retrieve the account number
    public long getAcc() {
        return accnum;
    }
}

// Subclass representing a customer, extending the Bank class
class Customer extends Bank {
    private String name;

    // Constructor to initialize account number and customer name
    public Customer(long accnum, String name) {
        super(accnum);
        this.name = name;
    }

    // Getter method to retrieve the customer name
    public String getName() {
        return name;
    }

    // Setter method to set the customer name
    public void setName(String name) {
        this.name = name;
    }
}

// Another subclass representing a deposit, also extending the Bank class
class Deposit extends Bank {
    private double payment;

    // Constructor to initialize account number and payment amount
    public Deposit(long accnum, double payment) {
        super(accnum);
        this.payment = payment;
    }

    // Getter method to retrieve the payment amount
    public double getPay() {
        return payment;
    }

    // Setter method to set the payment amount
    public void setPay(double payment) {
        this.payment = payment;
    }
}

// Main class of the program
public class Mainstud2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // User input for customer information
        System.out.print("Please put in customer name: ");
        String b = obj.nextLine();

        System.out.print("Please put in account number: ");
        long a = obj.nextLong();

        System.out.print("Please put in payment: RM");
        double c = obj.nextDouble();

        // Create a Customer object with the provided information
        Customer x = new Customer(a, b);

        // Display bank information header
        System.out.println("-----------------------------------------------");
        System.out.println("                MAYBANK BERHAD                 ");
        System.out.println("-----------------------------------------------");

        // Display customer information
        System.out.println("\nAccount number is: " + x.getAcc());
        System.out.println("Customer name is: " + x.getName());

        // Create a Deposit object with the provided information
        Deposit y = new Deposit(a, c);

        // Display payment information
        System.out.println("Payment is: RM" + y.getPay());
        System.out.println("-----------------------------------------------");

        obj.close(); // Close the Scanner to prevent resource leaks
    }
}
