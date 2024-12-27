import java.util.Scanner;

public class print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number up to which you want to print");
        int n = sc.nextInt();

        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num = num + 1;
        }
    }
}
