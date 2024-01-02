package ClassesObjectsAndMethods.Exercise8Bank.Bank;

public class BankManager {

    public void accessVault(Bank bank) {
        bank.accessVault(); // Only the BankManager can access the bank's vault.
    }
}
