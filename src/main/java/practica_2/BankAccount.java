package practica_2;

public class BankAccount {
    private String owner;
    private int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Сумма для внесения денег не может быть <= 0");
            return;
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Сумма для снятия денег не может быть <= 0");
            return;
        }
        balance -= amount;
    }
}
