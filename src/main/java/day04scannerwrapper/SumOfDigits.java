package day04scannerwrapper;

import java.util.Scanner;

public class SumOfDigits {
    /*
    Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
    ornegin => 312 icin 3+1+2=6
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a 3 digits number:");
        int num = input.nextInt();
        System.out.println("Sum of digits = " + (num/100+num/10%10+num%10));
    }
}
