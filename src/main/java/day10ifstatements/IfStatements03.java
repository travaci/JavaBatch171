package day10ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the month name:");
        String month = input.next().toLowerCase();
        if (month.equalsIgnoreCase("january")) {
            System.out.println("1");
        } else if (month.equalsIgnoreCase("february")) {
            System.out.println("2");
        } else if (month.equalsIgnoreCase("march")){
            System.out.println("3");
        } else if (month.equalsIgnoreCase("april")){
            System.out.println("4");
        } else if (month.equalsIgnoreCase("may")){
            System.out.println("5");
        } else if (month.equalsIgnoreCase("june")){
            System.out.println("6");
        } else if (month.equalsIgnoreCase("july")){
            System.out.println("7");
        } else if (month.equalsIgnoreCase("august")){
            System.out.println("8");
        } else if (month.equalsIgnoreCase("september")){
            System.out.println("9");
        } else if (month.equalsIgnoreCase("october")){
            System.out.println("10");
        } else if (month.equalsIgnoreCase("november")){
            System.out.println("11");
        } else if (month.equalsIgnoreCase("december")){
            System.out.println("12");
        } else {
            System.out.println("The month name is not correct.");
        }
    }
}
