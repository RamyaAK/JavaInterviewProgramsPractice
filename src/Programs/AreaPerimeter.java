package Programs;

import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter of a Circle = "+perimeter);
        System.out.println("Area of a Circle = "+area);
    }
}
