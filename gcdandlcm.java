import java.util.Scanner;

public class gcdandlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input two integers
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt(); // n1 is the dividend
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt(); // n2 is the divisor

        // Save the original values for LCM calculation
        int on1 = n1;
        int on2 = n2;

        // Compute GCD using the Euclidean algorithm
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;

        // Calculate LCM
        int lcm = (on1 * on2) / gcd;

        // Output results
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
