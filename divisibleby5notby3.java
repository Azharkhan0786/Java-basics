import java.util.Scanner;

public class divisibleby5notby3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        int n=sc.nextInt();

        if (n%5==0 && n%3!=0) {
            System.out.println("the number is divisible by 5and not by3:");
        }
        else
        {
            System.out.println("the number is not divisible by 5or is divisible b 3");
        }
    }
}

