import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter  Cost price");
        int cp = sc.nextInt();

        System.out.print("enter selling price");
        int sp = sc.nextInt();

        if (sp > cp) {
            System.out.println("you made a profit");
        }
        if (sp < cp) {
            System.out.println("you made a loss");
        }

    }
}
