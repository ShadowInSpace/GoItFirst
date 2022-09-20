import java.util.Arrays;
import java.util.*;

public class Main {

    //    public String[] getPlanets(String galaxy){
//        if (galaxy.equals("Miaru")) {
//            return new String [] {"Maux", "Reux", "Piax"};
//        } else if (galaxy.equals("Milkyway")){
//            return new String [] {"Earth", "Mars", "Jupiter"};
//        } else if (galaxy.equals("DangerBanger")){
//            return new String [] {"Fobius", "Demius"};
//        } else {
//            return new String [0];
//        }
//    }
//    public double[] solve(int a, int b, int c) {
//        int d = b * b - 4 * a * c;
//        double x1, x2;
//        double[] answer;
//
//        if (d > 0d) {
//            x1 = ((-1 * b) - Math.sqrt(d)) / (2 * a);
//            x2 = ((-1 * b) + Math.sqrt(d)) / (2 * a);
//            answer = new double []{x1, x2};
//        } else if (d == 0) {
//            x1 = (double) ((-1 * b) / (2 * a));
//            answer = new double []{x1};
//        } else {
//            answer = new double[0];
//        }
//        return answer;
//    }
//    public int[] findMinMaxPrices(int[] prices) {
//        int[] answer = new int[0];
//        if (prices.length == 0) {
//            return new int[0];
//        }
//
//        int max = prices[0];
//        int min = prices[0];
//        for (int price : prices) {
//            if (price < min) {
//                min = price;
//            }
//            if (price > max) {
//                max = price;
//            }
//            if (max == min) {
//                answer = new int[]{max};
//            } else {
//
//                  answer = new int[]{min, max};
//            }
////            return answer;
//        }
//        return answer;
//
//    }
//}
//    public int[] leavePrice9(int[] prices){
//        int[] hub = new int[prices.length];
//        int count = 0;
//        for (int price:prices){
//            String se = Integer.toString(price);
//            char e = se.charAt(se.length());
//            if (e!='9'){
//                hub[count]=price;
//                count++;
//            }
//        }
//        return Arrays.copyOf(hub,count);
//    }

//Test output
    public static void main(String[] args) {
boolean condition1 = false;
boolean condition2 = false;
boolean condition3 = false;
boolean condition4 = true;
        System.out.println(condition1 && condition2 && condition3 || condition4);
    }



}

//public static int translate(String romanNumber){
//    romanNumber=romanNumber.trim();
//    romanNumber=romanNumber.toUpperCase();
//    System.out.println(romanNumber);
//    switch(romanNumber){
//        case "I":
//            return 1;
//        case "II":
//            return 2;
//
//        case "III":
//            return 3;
//
//        case "IV":
//            return 4;
//
//        case "V":
//            return 5;
//
//        case "VI":
//            return 6;
//
//        case "VII":
//            return 7;
//
//        case "VIII":
//            return 8;
//
//        case "IX":
//            return 9;
//
//        case "X":
//            return 10;
//
//        case "XI":
//            return 11;
//
//        case "XII":
//            return 12;
//
//        default:
//            return -1;
//
//    }
//
//}
//}