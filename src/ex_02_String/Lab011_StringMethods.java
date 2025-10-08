package ex_02_String;

public class Lab011_StringMethods {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "durga";
        String s3 = "ababab";
        String s4 = "VIkas";

        //isEmpty method
        System.out.println("empty meth1 -> "+s1.isEmpty());
        System.out.println("empty meth2 -> "+s2.isEmpty());

        //length() method
        System.out.println("length  -> "+s2.length());

        //replace method
        System.out.println("replace  -> "+s3.replace('a','b'));

        //subString method
        System.out.println("subString meth1 -> "+s2.substring(2));

        //subString method
        System.out.println("subString meth2 -> "+s2.substring(1,4));

        //indexOf method
        System.out.println("index of meth1 -> "+s2.indexOf('g'));

        //indexOf method
        System.out.println("index of meth2 not present char -> "+s2.indexOf('z'));

        //indexOf method
        System.out.println("index of meth3 1st occurrence -> "+s3.indexOf('b'));

        //lastIndexOf method
        System.out.println("last Index of b -> "+s3.lastIndexOf('b'));

        //toLowerCase method
        System.out.println("toLowerCase -> "+s4.toLowerCase());

        //toUpperCase method
        System.out.println("toUpperCase -> "+s4.toUpperCase());

        //equalIgnoreCase()
        //equals()
        //trim()
    }
}
