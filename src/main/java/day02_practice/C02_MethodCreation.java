package day02_practice;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit:");
        double f = in.nextDouble();
        System.out.printf(f + " fahrenheit = %.2f celsius.\n",fahToCel(f));
    }
    public static double fahToCel(double f) {
        double c = (f-32)/1.8;
        return c;
    }
}
