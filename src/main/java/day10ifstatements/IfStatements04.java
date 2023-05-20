package day10ifstatements;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your age:");
        byte age = input.nextByte();
        if (age<0) {
            System.out.println("Input a valid age.");
        } else if (age<5) {
            System.out.println("You are a baby");
        } else if (age<13) {
            System.out.println("You are a child");
        } else if (age<21) {
            System.out.println("You are young");
        } else if (age<31) {
            System.out.println("You are an adult");
        } else {
            System.out.println("Not defined age.");
        }
        /*
    Homework
    1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
    //ve kullaniciya uygun mesaj veren kodu yaziniz

    2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
    //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....

    3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
    //  1==> January, 2 ==> February .....

*/
    }
}
