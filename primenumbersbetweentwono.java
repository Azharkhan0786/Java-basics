import java.util.Scanner;

public class primenumbersbetweentwono {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lowest number");
        int low = sc.nextInt();
        System.out.println("enter the highest number");
        int high = sc.nextInt();
        if(low==1){
            System.out.println("Neither a prime nor a composite number");
        }

        for (int n = low; n <= high; n++) {
            int count = 0;

            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;

                }
            }
            if (count == 0) {
                System.out.println(n);
            }
        }
    }

}
