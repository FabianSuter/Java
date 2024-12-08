class BankAccount {
    private int balance = 0;
    public synchronized void deposit(int amount) {
        balance += amount;
    }
    public synchronized boolean withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
