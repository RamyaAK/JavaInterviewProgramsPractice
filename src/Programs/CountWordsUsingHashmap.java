package Programs;

import java.util.HashMap;
import java.util.Scanner;

public class CountWordsUsingHashmap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String value to be computed:");
        String str = sc.nextLine();

        //split the string using split fn:
        String[] splitStr= str.split(" ");

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<splitStr.length;i++){
            if(map.containsKey(splitStr[i])){
                int count =map.get(splitStr[i]);
                map.put(splitStr[i],count+1);
            }
            else{
                map.put(splitStr[i],1);
            }
        }
        System.out.println(map);

    }
}
