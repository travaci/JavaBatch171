package day06swapvaluesstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*
        Ornek:
            Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                1) En az 8 charcter olsun
                2) Space characteri passwordde olmasin
                3) En az bir buyuk harf olsun
                4) En az bir kucuk harf olsun
                5) En az bir rakam olsun
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your password:");
        String pwd = in.nextLine();
        boolean first = pwd.length()>7;
        System.out.println("8 characters:" + first);
        boolean second = !pwd.contains(" ");
        System.out.println("Space character:" + second);
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("At least one uppercase letter:"+third);
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("At least one lowercase letter:"+fourth);
        boolean fifth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("At least one digit:"+fifth);
        boolean result = first && second && third && fourth && fifth;
        System.out.println("Is password valid?:"+result);
    }
}
