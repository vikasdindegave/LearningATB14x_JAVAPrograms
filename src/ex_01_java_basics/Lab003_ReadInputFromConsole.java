package ex_01_java_basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab003_ReadInputFromConsole {
    public static void main(String []args) throws IOException {

        //By using Scanner class

        //Read integer from console
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("User Inputted Integer= "+num);

        //Read string from console
        System.out.println("Please enter string value");
        String value = sc.next();
        System.out.println("User Inputted String is "+value);

        //By using Buffered Reader class

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a number");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Num1 ="+num1);

        System.out.println("Please enter name");
        String value1 = reader.readLine();
        System.out.println("value1 ="+value1);

    }
}
