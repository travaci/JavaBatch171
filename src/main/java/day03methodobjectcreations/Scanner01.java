package day03methodobjectcreations;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1. Adim: Scanner class dan object olustur
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz:");
        byte age = input.nextByte();
        System.out.println("age = " + age);
    }
}
