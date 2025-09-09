package ex_01_java_basics;

import java.util.Scanner;

public class Lab001_AdditionOfTwoNumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("Please enter 2nd number");
        int n2 = sc.nextInt();

        sum = n1 + n2;
        System.out.println("Addition of two numbers is "+sum);

    }
}
