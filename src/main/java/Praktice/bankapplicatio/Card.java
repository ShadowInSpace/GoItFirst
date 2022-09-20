package Praktice.bankapplicatio;

public abstract class Card {
    protected double balance;

    public abstract double withdrawMoney(double amountToWithdraw);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
