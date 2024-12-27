import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number");
        int binary_num=sc.nextInt();

        int ans=0;
        int powerof2=1;

        while (binary_num>0) {
            int unit_digit=binary_num%10;
            ans+=(unit_digit*powerof2);
            binary_num=binary_num/10;
            powerof2=powerof2*2;

        }
        System.out.println(ans);
    }
}

