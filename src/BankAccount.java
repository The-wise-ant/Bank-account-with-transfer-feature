/**
 * The BankAccount class represents a simple model of a bank account. 
 * It allows users to create accounts, deposit and withdraw funds, check balances, and transfer money to other accounts.
 */
public class BankAccount {

    // Private instance variables to store the state of the bank account
    private double balance;  // The current balance in the account
    private String name;     // The name of the account holder

    /**
     * Constructor to initialize a bank account with the account holder's name and a balance of $0.0.
     *
     * @param name The name of the account holder.
     */
    public BankAccount(String name) {
        this.name = name;
        balance = 0.0;
    }

    /**
     * Get the current balance of the bank account.
     *
     * @return The current balance in the account.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Get the name of the account holder.
     *
     * @return The name of the account holder.
     */
    public String getName() {
        return name;
    }

    /**
     * Deposit a specified amount into the bank account, increasing the account's balance.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " has $" + balance);
    }

    /**
     * Withdraw a specified amount from the bank account, decreasing the account's balance.
     * If the withdrawal amount exceeds the available balance, it fails and is not processed.
     *
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(name + " has $" + balance);
        } else {
            System.out.println("Withdrawal by " + name + " fails.");
        }
    }

    /**
     * Transfer a specified amount from this account to another BankAccount instance.
     * If the balance of this account is insufficient, the transfer fails.
     *
     * @param amount The amount to transfer.
     * @param acc The recipient BankAccount for the transfer.
     */
    public void transfer(double amount, BankAccount acc) {
        if (this.balance < amount) {
            System.out.println("Transfer fails");
        } else {
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("Account of " + this.name + " becomes $" + this.balance);
            System.out.println("Account of " + acc.name + " becomes $" + acc.balance);
        }
    }
}
