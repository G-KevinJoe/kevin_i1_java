//SHOW AN EXAMPLE OF PROGRAMMING BY CONTRACT?
package q15;
public class main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(2000);
        System.out.println("Balance after withdraw: " + account.getBalance());
        try {
            account.withdraw(10000);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new IllegalStateException("Not enough balance in the account.");
        }

        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}
