package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Kullanicidan alinan bir sayinin tek mi cift mi oldugunu konsola yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz:");
        int num = input.nextInt();
        // 1. Yol
        if (num%2==0){
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek sayi");
        }
    }
}
