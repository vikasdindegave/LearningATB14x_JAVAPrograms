package ex_02_String;

import java.util.Scanner;

public class Lab001_Reverse_String_CharAt {
    //write a program to reverse a string without using build in functions

    public static void main(String[] args) {
        System.out.println("Please enter a string");
        Scanner sc = new Scanner(System.in);
        String inputText = sc.next();
        String reverseString = "";

        for(int i=inputText.length()-1; i>=0;i--){
            reverseString = reverseString + inputText.charAt(i);
        }

        System.out.println(reverseString);

    }
}
