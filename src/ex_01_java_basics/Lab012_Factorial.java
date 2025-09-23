package ex_01_java_basics;

import java.util.Scanner;

public class Lab012_Factorial {
    //WAP to find factorial of a number

    public static void main(String[] args) {
        int fact = 1;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i <= num ; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of given number is "+fact);
    }
}
