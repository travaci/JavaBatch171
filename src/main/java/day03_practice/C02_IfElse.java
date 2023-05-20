package day03_practice;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın
        Scanner in = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        int sayi1 = in.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        int sayi2 = in.nextInt();
        if (sayi1>sayi2) {
            System.out.println("Ilk sayi ikinci sayidan buyuk");
        } else {
            System.out.println("Ikinci sayi birinci sayidan buyuk");
        }
    }
}
