import java.util.Scanner;

public class benjaminbulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bulbs: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
