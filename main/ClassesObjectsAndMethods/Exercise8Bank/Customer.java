package ClassesObjectsAndMethods.Exercise8Bank;

import ClassesObjectsAndMethods.Exercise8Bank.Bank.Bank;
import ClassesObjectsAndMethods.Exercise8Bank.Bank.BankManager;

public class Customer {
    private String name;
    private int deposit;

    public Customer(String name, int deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public void accessVault (Bank bank, BankManager manager) {
        manager.accessVault(bank); //  We can access the vault through manager's class.
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Jake", 1000);
        Bank bank = new Bank();
        BankManager manager = new BankManager();
        customer.accessVault(bank, manager);
    }
}
