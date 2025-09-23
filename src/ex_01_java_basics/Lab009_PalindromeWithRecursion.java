package ex_01_java_basics;

import java.util.Scanner;

public class Lab009_PalindromeWithRecursion {

    static int originalNum = 0;
    static int rev = 0;
    static int rem = 0;
    static int num = 0;

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        originalNum = num;
        if(getReverse(num, rev) == originalNum){
            System.out.println("given number is palindrome");
        }else {
            System.out.println("given number is not a palindrome");
        }
    }

    public static int getReverse(int num, int rev) {
        if (num == 0)
            return rev;

        rem = num % 10;
        rev = rev * 10 + rem;

        return getReverse(num / 10, rev);
    }
}
