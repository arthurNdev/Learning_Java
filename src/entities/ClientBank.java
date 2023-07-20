package entities;

public class ClientBank {

    private String name;
    private final int accountNumber;
    private double totalInAccount;


    public ClientBank(String name, int accountNumber, double initialDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }

    public ClientBank(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalInAccount() {
        return totalInAccount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        this.totalInAccount += amount;
    }

    public void withdraw(double amount) {
        this.totalInAccount -= amount + 5.00;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", totalInAccount);
    }

}
