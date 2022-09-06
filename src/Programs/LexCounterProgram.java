package Programs;

import java.util.Scanner;

public class LexCounterProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be computed");
        String testLine= sc.nextLine();
        char ch[] = testLine.toCharArray();
        int letter =0;
        int space = 0;
        int num =0;
        int other=0;

        for(int i=0;i<ch.length-1;i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isDigit(ch[i])){
                num++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            else {
                other++;
            }
        }

        System.out.println("Your String is:"+testLine);
        System.out.println("Number of letters: "+letter+"\nNumber of Digits: "+num+"\nNumber of Spaces: "+space+"\nothers: "+other);

    }
}
