package day02_practice;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a character:");
        char c = in.next().charAt(0);
        triangle(c);
    }
    public static void triangle(char c) {
        System.out.println("  "+c);
        System.out.println(" "+c+" "+c);
        System.out.println(c+" "+c+" "+c);
    }
}
