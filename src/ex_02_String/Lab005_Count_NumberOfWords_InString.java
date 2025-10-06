package ex_02_String;

import java.util.Scanner;

public class Lab005_Count_NumberOfWords_InString {

    public static void main(String[] args) {
        System.out.println("please enter a sentence with white spaces");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] splitArray = input.split(" ");
        System.out.println("count of words :"+splitArray.length);
    }
}
