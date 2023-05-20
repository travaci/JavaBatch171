package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {
        int number = -125;
        number = Math.abs(number);
        if (number>99 && number<1000) {
            System.out.println("Sayi uc basamaklidir.");
        }
    }
}
