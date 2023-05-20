package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive     : char        boolean     byte    short   int       long    float   double
        //Wrapper Class : Character   Boolean     Byte    Short   Integer   Long    Float   Double
        //Wrapper class lar non-primitive dir. O yuzden memory de cok yer kaplarlar.

        int n = 12;
        Integer m = 12;

        byte p = 33;
        Byte w = 44;

        //Ornek: short data type inin minimum ve maximum degerlerini kod yazarak bulunuz
        System.out.println("Short Min value = "+Short.MIN_VALUE);
        System.out.println("Short Max value = "+Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE+Byte.MAX_VALUE);

        //Primitive int i wrapper Integer a ceviriniz
        int num = 12;
        Integer wrapperNum = num;
    }
}
