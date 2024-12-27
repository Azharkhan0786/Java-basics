import java.util.Scanner;

public class nested3or5butnotfifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n % 5 == 0 || n % 3 == 0) {
            if (n % 15 != 0) {
                System.out.println("divisible by 5 or 3 but not by fifteen");
            }
            else
            {
                System.out.println("not matching the required condition");
            }
        }
    }
}
