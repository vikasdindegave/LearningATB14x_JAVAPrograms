package ex_01_java_basics;

import java.util.Scanner;

public class Lab011_MaxOfThreeNumbers {
    public static void main(String[] args) {

        System.out.println("please enter three numbers");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        //by using Ternary operator
//        int maxNum = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
//        System.out.println("Max of three numbers is "+maxNum);
        
        //by using if else condition
        
        if( n1 > n2 && n1 > n3){
            System.out.println("largest number is "+n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("largest number is "+n2);
        }else {
            System.out.println("largest number is "+n3);
        }
    }
}
