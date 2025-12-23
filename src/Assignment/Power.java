package Assignment;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        System.out.println(a*=b);
    }
}
