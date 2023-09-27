package entities;

public class BankAccount {

    // ATTRIBUTES
    private String nameAccountHolder;
    private int bankAccountNumber;
    private double bankAccountBalance;

    // CONSTRUCTORs
    public BankAccount(String nameAccountHolder, int bankAccountNumber, double initialDeposit) {
        this.nameAccountHolder = nameAccountHolder;
        this.bankAccountNumber = bankAccountNumber;
        depositOperation(initialDeposit);
    }

    public BankAccount(String nameAccountHolder, int bankAccountNumber) {
        this.nameAccountHolder = nameAccountHolder;
        this.bankAccountNumber = bankAccountNumber;
    }

    // GETTERS
    public String getNameAccountHolder() {
        return nameAccountHolder;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public double getBankAccountBalance() {
        return Double.parseDouble(String.format("%.2f", bankAccountBalance));
    }

    // SETTERS
    public void setNameAccountHolder(String nameAccountHolder) {
        this.nameAccountHolder = nameAccountHolder;
    }


    // METHODS
    public String toString() {
        return "Account " + bankAccountNumber + ", Holder: " + nameAccountHolder + ", Balance: $" + String.format("%.2f", bankAccountBalance);
    }

    public void withdrawOperation(double value) {
        bankAccountBalance = bankAccountBalance - value - 5.00;
    }

    public void depositOperation(double amount) {
         bankAccountBalance += amount;
    }



}
