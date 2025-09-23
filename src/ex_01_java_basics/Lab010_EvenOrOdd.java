package ex_01_java_basics;

import java.util.Scanner;

public class Lab010_EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num+" is a even number");
        }else {
            System.out.println(num+" is a odd number");
        }
    }
}
