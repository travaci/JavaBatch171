package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a 5 digits number:");
        int n = input.nextInt();
        int sum = (n / 10000) + ((n / 1000) % 10) + ((n / 10) % 10) + (n % 10);
        System.out.println("sum = " + sum);
    }
}
