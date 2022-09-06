package Programs;

import java.util.Scanner;

public class SwappingUsingTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt(); int b= sc.nextInt();

        System.out.println("Numbers before swapping:\n"+a+" "+b);
        int temp = a;
        a= b;
        b = temp;
        System.out.println("Numbers after swapping:\n"+a+" "+b);

    }
}
