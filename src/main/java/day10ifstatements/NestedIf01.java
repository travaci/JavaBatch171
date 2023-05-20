package day10ifstatements;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
      Example 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise "eskenar" Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */
        Scanner input = new Scanner(System.in);
        System.out.println("Input 3 numbers:");
        int a = Math.abs(input.nextInt());
        int b = Math.abs(input.nextInt());
        int c = Math.abs(input.nextInt());
        boolean isTriangle = (a+b)>c && c>Math.abs(a-b) && (a+c)>b && b>Math.abs(a-c) && (b+c)>a && a>Math.abs(b-c);
        if (isTriangle) {
            if (a == b && b == c) {
                System.out.println("It's a equilateral triangle.");
            } else {
                System.out.println("It's a triangle.");
            }
        } else System.out.println("It's not a triangle");
    }
}
