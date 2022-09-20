public class ATM {
    public static int countBanknotes(int sum){
        int count=0;
        int[] num = {500,200,100,50,20,10,5,2,1};
        while(sum!=0){
            int i = 0;
            while (sum!=0 && i<9){
                if (sum-num[i] >=0){
                    sum-=num[i];
                    count++;
                    break;
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ATM test1 =  new ATM();
        System.out.println(countBanknotes(500));
    }
}
