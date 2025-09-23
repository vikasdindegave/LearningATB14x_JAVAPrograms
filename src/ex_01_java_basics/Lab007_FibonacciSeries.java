package ex_01_java_basics;

import java.util.Scanner;

public class Lab007_FibonacciSeries {
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13,21,.....

        int n1=0;
        int n2=1;
        int n3 =0;

        System.out.println("Please enter how many numbers you have to print");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(n1+","+n2);
        for(int i=2; i<=num; i++){
            n3 = n1+n2;
            n1= n2;
            n2= n3;
            System.out.print(","+n3);
        }

    }
}
