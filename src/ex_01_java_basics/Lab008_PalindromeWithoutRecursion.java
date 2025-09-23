package ex_01_java_basics;

import java.util.Scanner;

public class Lab008_PalindromeWithoutRecursion {

    static int rev = 0;
    static int r = 0;
    static int originalNum = 0;

    public static void main(String[] args) {
        //1221
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        originalNum = num;

        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        while(num>0){
            r = num%10;
            rev = rev * 10 + r;
            num = num /10;
        }

        if(rev==originalNum){
            System.out.println("Given number is palindrome");
        }else {
            System.out.println("Given number is not a palindrome");
        }
    }

}
