package Programs;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Ramya Kulkarni";
        System.out.println(s.charAt(3)); // s.charAt(index);

        s = s.concat(" is SDET"); //s.concat(s1)
        System.out.println(s);
        s = s+" and also an Artist"; // + operator same concat()
        System.out.println(s);

        String s1 = "RAMYA";
        String s2 = "ramya";
        String s3 = "RAMYA";
        String s4="";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s1));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1));
        System.out.println(s2.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("isEmpty"+s1.isEmpty());
        System.out.println(s4.isBlank());

        System.out.println(s1.length()); // length() mthd applicable for Strings and length variable is applicable for arrays

        String s5 = "abababab";
        System.out.println(s5.replace('a','b'));

        String s6="abcdefg";
        System.out.println(s6.substring(3));
        System.out.println(s6.substring(3,6));

        String s7="abbabbab";
        System.out.println(s7.indexOf('b'));
        System.out.println(s7.lastIndexOf('b'));

        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
    }
}
