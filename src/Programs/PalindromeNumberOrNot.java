package Programs;

import java.util.Scanner;

public class PalindromeNumberOrNot {
    public static void main(String[] args) {
        int n, temp, sum = 0,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number variable to be checked for Palindrome number or not");
        n = sc.nextInt();
        temp = n; //temp used for checking if number entered is copy of actual integer number.
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
       if(temp == sum){
           System.out.println(temp+" is a Palindrome");
       }
       else {
           System.out.println(temp+" is not a Palindrome");
       }
    }
}
