package Programs;

public class StringPalindrome {
    public static void main(String[] args) {
        String s1 = new String("lcoocl");
         s1 = s1.toLowerCase();

       // string reversal using charArray[]
        String rev = "";
        char[] charArray = s1.toCharArray();

        for(int i = charArray.length-1;i>=0;i--){
            rev = rev + charArray[i];
        }
        System.out.println(rev);


        // string reversal using String Builder class
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        System.out.println(sb.reverse());

        // string reversal using while loop
        String reverse = "";
        int len = s1.length()-1;
        while(len>=0){
            reverse+= s1.charAt(len);
            len--;
        }
        System.out.println(reverse);

        // string reversal using for loop
        String r="";
        for(int i=s1.length()-1;i>=0;i--){
            r = r + s1.charAt(i);
        }
        System.out.println(r);

        // string reverse using string buffer

        StringBuffer sbf = new StringBuffer();
        sbf.append(s1);
        System.out.println(sbf.reverse());

        //string reversal using recursion
        System.out.println( strRev(s1)); // calling strRev() recursively.

        System.out.println("checking if it is palindrom or not");

    }

    public static String strRev(String str) {
       if(str.length() == 0)
           return "";
     return(str.charAt(str.length()-1)+strRev(str.substring(0,str.length()-1)));
    }
}

