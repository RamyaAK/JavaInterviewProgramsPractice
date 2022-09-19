package Programs;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n;
        boolean is_prime= true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        n=sc.nextInt();

        if(n==0 || n==1){ // because 0 is a whole number and 1 is a perfect square
            is_prime= false;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
               is_prime=false;
               break;
            }
        }
        if(is_prime == true){
            System.out.println(n+" is a Prime Number");
        }
        else {
            System.out.println(n+" is not a Prime Number");
        }
    }
}
