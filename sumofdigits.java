import java.util.Scanner;

public class sumofdigits { 
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int original_n=n;

        while (n > 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println("number of digits in " + original_n+ "=" + sum);
    }
}
