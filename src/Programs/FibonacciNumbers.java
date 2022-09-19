package Programs;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n;
        int n1=0,n2=1;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which Fibonacci series to be displayed.");
        n= sc.nextInt();

        System.out.println("Printing the Fibonacci series for "+n);

        System.out.println(n1+"\n"+n2); //printing 1st and 2nd element

        for(int i=2;i<n;i++){  // for loop i initialized to 2 as we start from 3rd element. first 2 elements already printed.
            sum = n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }
    }
}
