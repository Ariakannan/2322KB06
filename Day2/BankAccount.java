class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        balance = initialBalance > 0 ? initialBalance : 0;
    }
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
