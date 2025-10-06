package ex_02_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab004_Palindrome_CharAt {
    //write a program to check given text is palindrome or not

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a text to check palindrome");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        String reverse = "";

        for(int i= input.length()-1; i >= 0; i--){
            reverse = reverse + input.charAt(i);
        }
        System.out.println("reverse : "+reverse);

        if(input.equalsIgnoreCase(reverse)){
            System.out.println("its a palindrome");
        }else {
            System.out.println("its not a palindrome");
        }

    }
}
