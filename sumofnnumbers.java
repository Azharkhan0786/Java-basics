import java.util.Scanner;

public class sumofnnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter thr number uo to which you want to print ");
        int n = sc.nextInt();
        System.out.println(n);
        int num=1;
        int sum=0;

        while (num<=n) {
           sum=sum+num;
           num++;

    
            
        }
        System.out.println(sum);

    }
}
