package Praktice.bankapplicatio;

public class ApplicationAccount {
    private String accountNumber = "asdgfawsdfvsd";
    private Card[] myCards;

    public void initCards(){
        myCards = new Card[2];
        Card privatbancCard = new PrivatbancCard();
        privatbancCard.setBalance(14000.15);
        Card monobankCard = new MonobancCard();
        monobankCard.setBalance(15000.10);
        myCards[0] = privatbancCard;
        myCards[1] = monobankCard;
    }

    public double calculateOverallBallance(){
        double sum=0;
        sum+= myCards.getBalance();

        return sum;
    }

    public double withdrawMoneyFromCard(Card card,double amountToWithdraw){
        return card.withdrawMoney(amountToWithdraw);
    }

    public Card[] getMyCard() {
        return myCards;
    }

    public void setMyCard(Card[] myCard) {
        this.myCards = myCard;
    }
}
