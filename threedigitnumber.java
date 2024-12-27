import java.util.Scanner;

public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        int n=sc.nextInt();

        if (n>99 && n<1000) {
            System.out.println("this is a digit number");
        }
        else
        {
            System.out.println("not a three digit number");
        }
    }
}
