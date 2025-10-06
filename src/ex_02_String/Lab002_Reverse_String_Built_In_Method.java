package ex_02_String;

import java.util.Scanner;

public class Lab002_Reverse_String_Built_In_Method {
    public static void main(String[] args) {

        System.out.println("Enter a string to reverse it");
        Scanner sc = new Scanner(System.in);
        String inputText = sc.next();

        StringBuilder sb = new StringBuilder(inputText);
        sb.reverse();
        System.out.println("Reverse String :"+sb);

    }
}
