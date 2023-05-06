package day03methodobjectcreations;

public class Runner {
    public static void main(String[] args) {
        //Object nasil olusturulur?
        car myCar = new car();
        myCar.model = "Model Y";
        myCar.fiyat = 47000;

        System.out.println("Model = " + myCar.model);
        System.out.println("Fiyat = " + myCar.fiyat);
        myCar.hareket();
        myCar.dur();


        Student aliCan = new Student();

        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.study();
        aliCan.feed();

        //homework
        //icinde isim ve yas varibale lari ile teach methodu bulunan bir Teacher objecti olusturun ve obje uzerinde bu ozellikleri kullanini
    }
}
