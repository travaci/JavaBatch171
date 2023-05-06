package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    Java'da method nasil olusturulur?

    1) main method un disinda, class in icinde.
    2) Access modifier + Return type + method ismi + () + {}

    Olusturulan method lar nasil kullanilir?
    1) Method u olusturmak methodu calistirmak icin hyeterli degildir, Kullanilmak istenen method main method un icinden kullanilir.
    2) method un ismi + () yazin
     */
    public static void main(String[] args) {
        System.out.println(topla(5,6));
        System.out.println(multiply(4,5));
        System.out.println(calculate(3,5,10));
    }
    //Ornek 1: Toplama islemiyapan bir method olusturunuz ve kullaniniz

    public static int topla(int a, int b){
        return a+b;
    }

    protected static long multiply(int a, int b){
        return a * b;
    }

    private static long calculate(int a, int b, int c){
        return a * b + c;
    }
}

