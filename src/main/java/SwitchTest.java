public class SwitchTest {
    public static void main(String[] args) {
        String cardType = "Gold";
        switch (cardType) {
            case "Regular": {
                System.out.println("you have a regular card");

            }
            break;
            case "Gold": {
                System.out.println("You have a gold card");
            }
            break;
            default: {
                System.out.println("Unknown card type");
            }
        }
    }
}
