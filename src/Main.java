import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int n = sec.nextInt();

        System.out.println(func(n));
    }

    /**
     * This function calculates the nth Fibonacci number recursively.
     *
     * @param n The index of the Fibonacci number to be calculated (0-based indexing).
     * @return The nth Fibonacci number.
     *
     * @throws IllegalArgumentException if n is negative.
     */
    public static int func(int n) {

        // Base case
        if (n <= 1) {
            return n;
        }
        // Recursive case: Calculate the sum of the previous two Fibonacci numbers
        return func(n - 1) + func(n - 2);
    }


}