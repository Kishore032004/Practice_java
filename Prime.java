import java.util.Scanner;
class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        int count = 0;

        sc.close();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        if (count == 2)
            System.out.println("prime");
        else
            System.out.println("is not prime");

    }
}