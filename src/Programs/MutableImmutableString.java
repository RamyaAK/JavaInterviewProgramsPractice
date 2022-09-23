package Programs;

public class MutableImmutableString {
    public static void main(String[] args) {

        String s = new String("Ramya");
        s.concat("Kulkarni");
        System.out.println(s); // will print only Ramya and concatenation will be ignored because of string immutability nature and this value is garbage collection


        StringBuffer sb = new StringBuffer("Ramya");
        sb.append("Kulkarni");
        System.out.println(sb); // as string Builder is mutable meaning changeable, this will be giving output as RamyaKulkarni


        String s1 = new String("Ramya");// object class has .equals() which returns true only if reference matches
        String s2 = new String("Ramya");
        System.out.println(s1==s2);  // this will return false as the reference or address are different.
        System.out.println(s1.equals(s2));// in String i.e. class-->String has overridden the .equals() that compares the content but not reference



        StringBuilder sb1 = new StringBuilder("Ramya");// incase of StringBuilder the .equals() is not overridden and hence it matches only reference and not contents like in Strings
        StringBuilder sb2 = new StringBuilder("Ramya");
        System.out.println(sb1==sb2); // returns false as memory loc or refernces are different
        System.out.println(sb1.equals(sb2)); // returns false as references are diff and this is not overridden like in Strings.
    }
}
