package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(num < 10 ? "Kucuk" : "Kucuk degil");


        if (num % 2 == 0) {
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek sayi.");
        }
        System.out.println(num % 2 == 0 ? "Cift sayi" : "Tek sayi");

        Scanner input = new Scanner(System.in);
        System.out.println("Input two numbers:");
        double first = input.nextDouble();
        double second = input.nextDouble();
        System.out.println(first<second ? first : second);
    }
}
