package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string\n");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter the second string\n");
        String str2 = sc.nextLine().toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("These two strings are not anagrams");
        }

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        Boolean isAnagram = Arrays.equals(ch1,ch2);

        if(isAnagram){
            System.out.println(str1+" and "+str2+" are Anagrams");
        }
        else {
            System.out.println(str1+" and "+str2+" are not Anagrams");
        }

    }
}
