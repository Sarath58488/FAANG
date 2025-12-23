package Assignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a= obj.nextInt();
        int b= obj.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
}
