package day06swapvaluesstringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {
        String s = "      Ali Can    ";
        System.out.println(s.trim());

        //Ornek 2: Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //  String tv = "$456.99";     String laptop = "$875.99";  ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        String tv2=tv.replace("$","");
        System.out.println(tv2);

        String laptop2=laptop.replace("$","");
        System.out.println(laptop2);

        double totalPrice =Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);

        //Ornek 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.

        String name = "    Ali Can    ";
        char first = name.trim().toUpperCase().charAt(0);
        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(""+first+last);
    }
}
