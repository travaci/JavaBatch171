package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the short side:");
        double a = input.nextInt();
        System.out.print("Input the long side:");
        double b = input.nextInt();
        System.out.println("Perimeter = " + (2*a+2*b));
        System.out.println("Area = " + (a*b));
    }
}
