public class Fibonacci {
    public static void main(String[] args) {
        int n = 15; // number of terms to display
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");

            // compute the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
