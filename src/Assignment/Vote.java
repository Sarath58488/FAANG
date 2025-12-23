package Assignment;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String v =(age>=18)?"eligible":"not eligible";
        System.out.println(v);
    }
}
