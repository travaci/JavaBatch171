package day02_practice;

public class C05_MethodCreation {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Num1="+num1+"\nNum2="+num2);
        swapNums(num1,num2);
    }
    private static void swapNums(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Num1="+num1+"\nNum2="+num2);
    }

}
