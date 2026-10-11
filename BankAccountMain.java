class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(0, balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(double amount) {
        boolean success; // Local variable records whether withdrawal worked.
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            success = true;
        } else {
            success = false;
        }
        System.out.println(success ? "Withdrawal successful." : "Withdrawal failed.");
    }

    double getBalance() { return balance; }

    void displayAccount() {
        System.out.println("Account: " + accountNo + ", Holder: " + accountHolderName
                + ", Balance: Rs. " + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Aarav Sharma", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(5000.0);
        account.displayAccount();
    }
}
