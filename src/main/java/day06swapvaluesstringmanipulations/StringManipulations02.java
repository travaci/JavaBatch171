package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";
        System.out.println(s.endsWith("money")); //true
        System.out.println(s.replace("money","dollar"));
        System.out.println(s.replace("earn","win"));
        System.out.println(s.replace("a","*")); //Le*rn J*v* e*rn money
        System.out.println(s.replace("n","xxx"));
        System.out.println(s.replace("e",""));
        String t = "Ali 13 yasindadir!...";
        // t Stringindeki rakamlari "*" e cevirin
        System.out.println(t.replaceAll("[0-9]","*")); //Ali ** yasindadir!...
        // t Stringindeki tum harf ve rakamlari "!" e cevirin
        System.out.println(t.replaceAll("[a-zA-Z0-9]","!")); //!!! !! !!!!!!!!!!!...
        // t stringindeki tum sesli harfleri "?" ne ceviriniz
        System.out.println(t.replaceAll("[aeiouAEIOU]","?")); //?l? 13 y?s?nd?d?r!...
        // t stringindeki kucuk harfler disindaki tum karaterleri "<>" a ceviriniz
        System.out.println(t.replaceAll("[^a-z]","<>")); // <>li<><><><>yasindadir<><><><>

        /*
        Regex
        Tum rakamlar: [0-9]
        Tum kucuk harfler: [a-z]
        Tum buyuk harfler: [A-Z]
        Tum kucuk ve buyuk harfler: [a-zA-Z]
        Tum harfler ve rakamlar: [a-zA-Z0-9]
        Tum noktalama isaretleri:  \\p{Punct}
        Tum sesli harfler: [aeiouAEIOU]
        Kucuk harfler haric: [^a-z]
        Harfler haric butun karakterler: [^a-zA-Z]
        sadece space karakteri: \\s
        space karakteri haric: \\S
        sadece rakamlar: \\d
        rakamlar haric: \\D
         */

    }
}
