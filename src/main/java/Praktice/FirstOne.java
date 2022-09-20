package Praktice;

public class FirstOne {
    public static void main(String[] args) {
//        String targetUsername = "Ivan Petrenko";
//        String [] studentINGrou = {};
//        boolean studentPresentInGroup = isStudentPresentINGroup(studentINGrou, targetUsername);
//        System.out.println(targetUsername + " present in group: " + studentPresentInGroup);
        System.out.println(calc(9));
    }
    public static boolean isStudentPresentINGroup (String [] studentUsername, String targrtUsetname){
        for (String username: studentUsername) {
            if (username.equals(targrtUsetname)){
                return true;
            }

        }

     //   System.out.println("I am here");
        return false;
    }
    public static int calc(int n){
        int sum=1;
        for (int i = 3; i <= n; i+=2) {
            sum*=i;
        }
        return sum;
    }

}

