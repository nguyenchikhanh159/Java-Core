package thread.com.bankatm;

public class Account {
    private int balance = 8000;

    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
