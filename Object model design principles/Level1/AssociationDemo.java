import java.util.ArrayList;

class Account {
    private String accountNumber;
    private double balance;
    private Bank bank;

    public Account(String accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in account: " + accountNumber);
        }
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\nCustomer: " + name);
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getName() +
                    " | Account: " + account.getAccountNumber() +
                    " | Balance: " + account.getBalance());
        }
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Account openAccount(Customer customer, String accountNumber) {
        Account account = new Account(accountNumber, this);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            addCustomer(customer);
        }
        return account;
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("HDFC Bank");

        Customer c1 = new Customer("Akshay");
        Customer c2 = new Customer("Rahul");

        Account acc1 = bank1.openAccount(c1, "SB1001");
        Account acc2 = bank1.openAccount(c1, "SB1002");
        Account acc3 = bank2.openAccount(c2, "HDFC2001");

        acc1.deposit(5000);
        acc2.deposit(10000);
        acc3.deposit(7000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
