package day10ifstatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
         /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz        */
        Scanner input = new Scanner(System.in);
        System.out.println("Input 3 numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean isTriangle = (a + b) > c && c > Math.abs(a - b) && (a + c) > b && b > Math.abs(a - c) && (b + c) > a && a > Math.abs(b - c);
        if (isTriangle) {
            if (a == b && b == c) {
                System.out.println("It's an equilateral triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("It's an isosceles triangle");
            } else {
                System.out.println("It's a triangle");
            }
        } else {
            System.out.println("Not a triangle.");
        }
    }
}
