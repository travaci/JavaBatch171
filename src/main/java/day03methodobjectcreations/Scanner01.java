package day03methodobjectcreations;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1. Adim: Scanner class dan object olustur
        Scanner input = new Scanner(System.in);
        System.out.print("Adinizi girin:");
        String ad = input.next();
        System.out.print("Soyadinizi girin:");
        String soyad = input.next();
        System.out.println(ad+" "+soyad);
    }
}
