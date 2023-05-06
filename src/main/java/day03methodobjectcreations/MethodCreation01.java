package day03methodobjectcreations;

import static day01.C04_MethodCreation.square;

public class MethodCreation01 {
    public static void main(String[] args) {
        System.out.println(getCube(5));
        print("Hello world!");

        String str = "TechproEdu";
        printConsole(str);

        int a=3, b=5;
        multiply(a,b);

        int x=5;
        square(x);
    }

    private static void square(int x) {
        System.out.println(x*x);
    }

    private static void multiply(int a, int b) {
        System.out.println(a*b);
    }

    private static void printConsole(String str) {
        System.out.println(str);
    }

    static double getCube(double a){
        return a*a*a;
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
