import java.util.Scanner;
public class MagicNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        while(num > 9){

            int sum = 0;
            while(num > 0){

                sum += num % 10;
                num = num / 10;
            }

            num = sum;
            sc.close();
        }

        if (num == 1){
            System.out.println("The num is magic");
        }

        else{
            System.out.println("it's not");
        }

        
    }
}
