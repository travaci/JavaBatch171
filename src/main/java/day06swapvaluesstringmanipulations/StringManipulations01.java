package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String country = "Turkiye";
        System.out.println(country.length());
        System.out.println(country.toLowerCase());
        System.out.println(country.toUpperCase());
        System.out.println(country.charAt(0));

        String s = "Java is easy";
        System.out.println(""+s.charAt(1)+s.charAt(s.length()-2)); //as
        System.out.println(s.substring(0,4)); //Java
        System.out.println(s.substring(8)); //easy
        System.out.println(s.substring(5,7)); //is
        System.out.println(s.contains("money")); //false
        System.out.println(s.contains("is")); //true
        System.out.println(s.startsWith("J")); //true
        System.out.println(s.startsWith("i",5)); //true

    }
}
