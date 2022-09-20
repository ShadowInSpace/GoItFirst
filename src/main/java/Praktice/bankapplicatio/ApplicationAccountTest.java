package Praktice.bankapplicatio;

public class ApplicationAccountTest {
    public static void main(String[] args) {
        MonobancCard monobancCard = new MonobancCard();
        monobancCard.setBalance(14000.15);

        ApplicationAccount applicationAccount = new ApplicationAccount();
        double myMoney = applicationAccount.withdrawMoneyFromCard(monobancCard,150);
        System.out.println(myMoney);
        System.out.println(monobancCard.getBalance());


    }
}
