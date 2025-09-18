package ex_01_java_basics;

import java.util.Scanner;

public class Lab004_MultiplyFloatingPointNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1st floating value");
        float f1 = sc.nextFloat();

        System.out.println("Please enter 2nd floating value");
        float f2 = sc.nextFloat();

        float result = f1 * f2;

        System.out.println("Multiplication = "+result);
    }
}
