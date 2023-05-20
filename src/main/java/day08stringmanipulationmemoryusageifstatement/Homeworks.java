package day08stringmanipulationmemoryusageifstatement;

public class Homeworks {

    public static void main(String[] args) {
        //Homework
        //1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        String s = "Abc*28P$90";
        int numOfChars = s.replaceAll("[0-9]","").length();
        System.out.println("numOfChars = " + numOfChars);


        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
        String s1 = "java is perfect";
        String newS1 = s1.substring(1,s1.length()-1).toUpperCase();
        System.out.println(newS1);
        System.out.println(s1.contains("x"));

        //3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
        String s3 = "Java";
        System.out.println(s3.charAt(0)+s3.charAt(s3.length()-1));


        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        //console a yazdirin
        String sehir = "istAnBul";
        System.out.println((""+sehir.charAt(0)).toUpperCase()+sehir.substring(1,sehir.length()).toLowerCase());

    /*
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun
     */
        String pwd = "Abcd2x";
        boolean check1 = pwd.length()>5;
        boolean check2 = pwd.replaceAll("[^A-Z]","").length()>0;
        boolean check3 = pwd.replaceAll("[^a-z]","").length()>0;
        boolean check4 = pwd.replaceAll("[^0-9]","").length()>0;
        boolean checkAll = check1 && check2 && check3 && check4;
        System.out.println("Is password valid?: "+(checkAll));


    /*
    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz

     */
    }




}
