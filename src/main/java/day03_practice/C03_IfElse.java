package day03_practice;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın
        
        Scanner in = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        int sayi1 = in.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        int sayi2 = in.nextInt();
        if (sayi1>0 && sayi2>0) {
            System.out.println("Sayilarin toplami="+(sayi1+sayi2));
        } else if (sayi1<0 && sayi2<0) {
            System.out.println("Sayilarin carpimi="+(sayi1*sayi2));
        } else if (sayi1==0 || sayi2==0) {
            System.out.println("Sifir carpmaya gore yutan elemandir");
        } else {
            System.out.println("Farkli isaretli sayilarla islem yapamazsin.");
        }
    }
}
