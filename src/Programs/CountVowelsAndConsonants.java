package Programs;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowelCount=0;
        int consonantCount=0;

        System.out.println("Enter a sentence to count the number of vowels or a consonants\n");
        String str = sc.nextLine();

        str = str.toLowerCase();
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowelCount++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                consonantCount++;
            }
        }
        System.out.println("Total number of vowels :"+vowelCount);
        System.out.println("Total number of consonants :"+consonantCount);

    }
}
