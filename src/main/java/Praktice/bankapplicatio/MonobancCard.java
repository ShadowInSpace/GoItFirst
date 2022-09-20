package Praktice.bankapplicatio;

public class MonobancCard extends Card{
 private double commision = 0.04;

    @Override
    public double withdrawMoney(double amountToWithdraw) {
        System.out.println("withdrawMoney" );
        double moneyToWithdrawFromAccount = amountToWithdraw * (1+ commision);
        this.balance -= moneyToWithdrawFromAccount;
        return amountToWithdraw;
    }
}
