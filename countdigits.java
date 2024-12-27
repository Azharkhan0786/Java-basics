import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number in which you want to count the digits");
        int n=sc.nextInt();
        int original_n=n;
        int numofdigits=0;
        while (n>0) {
            n=n/10;
            numofdigits++;
        }
System.out.println("number of digits in "+original_n+"="+numofdigits);


    }
}