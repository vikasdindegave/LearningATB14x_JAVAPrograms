package ex_02_String;

import java.util.Scanner;

public class Lab006_FirstLetterOfEachWord {
    public static void main(String[] args) {

        System.out.println("please enter a sentence with white spaces");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] splitArray = input.split(" ");
        System.out.println("count of words :"+splitArray.length);

        for(String array : splitArray){
            System.out.println(array +" : "+ array.charAt(0));
        }

    }
}
