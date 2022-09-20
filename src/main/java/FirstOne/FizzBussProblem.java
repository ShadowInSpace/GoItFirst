package FirstOne;

public class FizzBussProblem {
    // you have an int array. if element divisible by 3 print fizz,
    // if element divisible by 5 print buzz,
    // if element divisible by 3 and 5 print fizzbuzz
    public static void main(String[] args) {
        int[] numbers = {1, 2, 7, 6, 8, 10, 30, 15};
        solve(numbers);
    }

    public static void solve(int[] numbers) {
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.print("fizz");
            }
            ;
            if (number % 5 == 0) {
                System.out.print("buzz");
            }
            ;
            System.out.println(" " + number);
        }
    }

}
