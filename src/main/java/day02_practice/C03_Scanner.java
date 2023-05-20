package day02_practice;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        boolean check = checkSquare(a,b);
        System.out.println(check);
    }
    private static boolean checkSquare(int a, int b) {
        return a*a == b*b;
    }
}
