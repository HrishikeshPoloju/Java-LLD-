class Customer {
    private String name;
    private String email;
    private String phone;

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getDetails() {
        return name + " | " + email + " | " + phone;
    }
}

class BankAccount {
    private Customer customer;
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, Customer customer, double initialAmount) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = initialAmount;
    }

    public void deposit(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amt;
        System.out.println("Deposited: ₹" + amt);
    }

    public void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Not enough balance");
        } else {
            balance -= amt;
            System.out.println("Withdrawn: ₹" + amt);
        }
    }

    public void printBalance() {
        System.out.println("Balance for " + accountNumber + ": ₹" + balance);
    }

    public void printAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer: " + customer.getDetails());
        printBalance();
    }
}

public class BankAccountWithCustomer {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Hrishi", "hrishi@email.com", "9876543210");
        BankAccount acc1 = new BankAccount("ACC123", cust1, 1000);

        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.printAccountInfo();
    }
}
