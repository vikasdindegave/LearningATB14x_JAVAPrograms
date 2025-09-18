package ex_01_java_basics;

public class Lab006_AddTwoBinaryString {
    public static void main(String[] args) {
        String s1 = "011011";
        String s2 = "1010111";

        //1st convert to integer
        int i1 = Integer.parseInt(s1,2);
        int i2 = Integer.parseInt(s2,2);

        int sum = i1 + i2;

        System.out.println("Convert sum to binary = "+Integer.toBinaryString(sum));
    }
}
