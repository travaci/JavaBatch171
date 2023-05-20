package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        int a=12;
        int b=5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //1. Yol:
        int temp=a;
        a=b;
        b=temp;

        //2. Yol:
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
