import java.util.Scanner;

public class sidesoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("valid triangle");
        } else {
            System.out.println(" not a valid triangle");
        }
    }
}
