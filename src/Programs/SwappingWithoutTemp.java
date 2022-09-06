package Programs;

import java.util.Scanner;

public class SwappingWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Numbers before swapping:\n"+a+" "+b);

        a= a+b;
        b= a-b;
        a= a-b;

        System.out.println("After swapping:\n"+a+" "+b);

    }
}
