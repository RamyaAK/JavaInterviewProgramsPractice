package Programs;

import java.util.Scanner;

public class SumOfDigitsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer for which sum needs to be computed");
        int n = sc.nextInt();

        int sum = 0;
        while(n!=0){
           sum = sum +(n%10);
           n= n/10;
        }
        System.out.println("The sum of integers is "+sum);
    }
}
