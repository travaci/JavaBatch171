package day01;

public class C04_MethodCreation {
    public static void main(String[] args) {
        printHelloWorld();
        square(3,5);
    }

    public static void printHelloWorld(){
        System.out.println("hello world");
        System.out.println("Hello World");
        System.out.println("HEllo WOrld");
        System.out.println("HELlo WORld");
        System.out.println("HELLo WORLd");
        System.out.println("HELLO WORLD");
    }

    public static void square(int a, int b){
        long sumOfSquares = a*a + b*b;
        System.out.println("sum Of Squares = " + sumOfSquares);
    }
}
