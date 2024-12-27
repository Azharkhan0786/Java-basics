import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x coordinate of the center");
        int x = sc.nextInt();
        System.out.println("y coordinate of the center");
        int y = sc.nextInt();
        System.out.println("enter the value of x2");
        int x2 = sc.nextInt();
        System.out.println("enter the value of y2");
        int y2 = sc.nextInt();

        System.out.println("enter the radius of the circle");
        double radius = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));

        if (distance < radius) {
            System.out.println("the point is inside the circle ");

        } else if (distance > radius) {
            System.out.println("the point is outside the circle");
        } else {
            System.out.println("the point lies on the circle");
        }
    }
}
