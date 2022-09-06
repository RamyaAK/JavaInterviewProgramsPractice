package Programs;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be reversed\n");
        char ch[] = sc.nextLine().toCharArray();
        System.out.println("Before Reversal:");
        for(int i=0;i<=ch.length-1;i++){
            System.out.print(ch[i]);
        }

        System.out.println("\nAfter Reversal");
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }

    }
}
