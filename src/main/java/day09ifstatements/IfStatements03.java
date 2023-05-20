package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Verilen karakter buyuk harf ise ekrana "Buyuk Harf" yazdiran
        //kucuk harf ise "Kucuk Harf" yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz:");
        char ch = input.next().charAt(0);

        if (ch>='A' && ch<='Z') {
            System.out.println("Buyuk harf.");
        } else if (ch>='a' && ch<='z') {
            System.out.println("Kucuk harf");
        } else {
            System.out.println("Harf degil");
        }
    }
}
