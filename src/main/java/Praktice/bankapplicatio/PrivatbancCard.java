package Praktice.bankapplicatio;

public class PrivatbancCard extends Card{
    private double commision = 0.012;

    @Override
    public double withdrawMoney(double amountToWithdraw) {
        double commissionAmount = amountToWithdraw *  commision;
        double moneyToWithdrawFromAccount = amountToWithdraw;
        if (commissionAmount>40){
            moneyToWithdrawFromAccount += commissionAmount;
        } else {
            moneyToWithdrawFromAccount +=40;
        }
        this.balance -= moneyToWithdrawFromAccount;
        return amountToWithdraw;
    }
}