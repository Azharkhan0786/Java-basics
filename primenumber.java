import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbre you u want to check");
        int n=sc.nextInt();
int count=0;
    for (int i = 1; i <= n; i++) {
       if (n%i==0) {
        count++;
       }
    }
    if (count==2) {
        System.out.println("yes");
       }
       else{
        System.out.println("no");
       }
    }
}
for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }