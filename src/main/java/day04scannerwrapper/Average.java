package day04scannerwrapper;

import java.util.Scanner;

public class Average {
    /*
    Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
    ornegin => 3,5,7 icin ortalama (3+5+7)/3=5
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 3 numbers:");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double avg = (n1+n2+n3)/3;
        System.out.println("Average = " + avg);
    }
}
