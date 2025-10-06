package ex_02_String;

import java.util.Scanner;

public class Lab003_Reverse_String_CharArray {

    public static void main(String[] args) {

        System.out.println("Enter a string to reverse it");
        Scanner sc = new Scanner(System.in);
        String inputText = sc.next();
        String reverseText = "";

        char[] charArray = inputText.toCharArray();

        for(int i=charArray.length-1; i>=0; i--){
            reverseText = reverseText + charArray[i];
        }

        System.out.println("reverse string :"+reverseText);

    }
}
