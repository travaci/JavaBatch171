package day01;

import java.util.Arrays;

public class C01_Variables {
    public static void main(String[] args) {

        //Bir variable olustur, yazdır
        int yas = 36;
        //syntax : variable data turu + variable isim +atama operatoru + variable deger
        int sayi = 50;

        System.out.println(yas);//ctrl d ile satırı alt alta cogaltabılırız
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);

        //sayi = 50 seklinde yazdır
        System.out.println("sayi = " + sayi);
        //sayi variable ini etiketiyle birlikte yazdırma
        //ctrl alt L -> kodlarımızı duzenlemeye yarar
        //bir variable ı etiketiyle birlikte yazdırmanın kısa yolu = soutv
        System.out.println("sayi = " + sayi);
        System.out.println(sayi);
        System.out.println("yas = " + yas);
        String isim = "Ali";
        System.out.println("isim = " + isim);

        //Olusturdugun variable'ı farkli bir variable'a kopyala
        //Aynı satırda coklu variable deklare et
        int yil = 2023, ay = 5, gun = 5;
        System.out.println(gun + "/" + ay + "/" + yil);
        //Bir variable degerini guncelle
        //Degişkenleri(variable) yazdır


    }

}
