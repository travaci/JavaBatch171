package day05concatenetionoperatorstypecasting;

public class TypeCasting {//Tip Dönüştürme
    /*
    Numeric Primitive Data Type'larının birbirine dönüştürülmesine "Type Casting" denir.
    Numeric data type'lar; byte, short, int, long, float, double
    byte oluşturacağız int gibi davranacak, int oluşturacağız long gibi davranacak
     */
    //Note 1: Küçük data type'larını büyük data type'larına çevirmeyi Java otomatik olarak yapar
    //Bu işleme "AutoWidening" (otomatik genişletme) denir

    //Note 2: Büyük data type'larını küçük data type'larına çevirmek riskli bir iştir, Java bu riskli işi otomatik olarak yapmaz bu işlemi kod yazanlardan bekler
    //Bu işleme "ExplicitNarrowing" (Açıktan Daraltma) denir


    public static void main(String[] args) {
        //byte data type'ını int data type'ına çeviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //int data type'ını short data type'ına çeviriniz
        int weight = 312;
        short weightShort = (short) weight;//Explicit Narrowing

        int a=32;
        float b = a;

        double x = 1564;
        System.out.println(x);
        short y = (short)x;
        System.out.println(y);

        short num=260;
        System.out.println(num);

        byte numByte = (byte)num;
        System.out.println(numByte); //4
    }
}
