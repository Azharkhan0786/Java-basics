import java.util.Scanner;

public class areaandperimter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length");
        int length=sc.nextInt();

        System.out.println("enter breadth");
        int breadth=sc.nextInt();

        int area=length*breadth;
        int perimeter=2*(length+breadth);
        if (area>perimeter)
         {
        System.out.println("area is greater than permimeter");    
        }
        else if (perimeter>area) {
            System.out.println("perimeter is greater than area");   
        }
        else 
         {
            System.out.println("area and perimeter are equal");
     
    }
}
}
