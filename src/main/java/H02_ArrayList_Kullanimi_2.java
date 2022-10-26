import java.util.ArrayList;
import java.util.List;

public class H02_ArrayList_Kullanimi_2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);// [Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");


        names.removeAll(cities);//removeAll() kullandiginizda sadece ilk list degisir, parantezin icindeki list degismez
        System.out.println(names);//[Thomas, Tahsin]
        System.out.println(cities);// [Trump, Tom, Taceddin]

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames);//Bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder.
        //Hepsi varsa "True" En az biri yoksa false verir.
        System.out.println(sonuc1);//true

        List<String> a = new ArrayList<>();
        a.add("Altin Kemer");
        a.add("Pirlanta Tac");
        a.add("Gerdanlik");
        a.add("Kelepce Bilezik");
        a.add("Altin Kemer");
        a.add("Biberon");
        a.add("Altin Kemer");
        System.out.println(a);//[Altin Kemer, Pirlanta Tac, Gerdanlik, Kelepce Bilezik, Altin Kemer, Biberon, Altin Kemer]


        //Example 1:"a" Listinde "Altin kemer" elemaninin ilk gorunumunu siliniz.
        a.remove("Altin Kemer");
        System.out.println(a);//[Pirlanta Tac, Gerdanlik, Kelepce Bilezik, Altin Kemer, Biberon, Altin Kemer]


        //example 2: "a" Listinde "Altin kemer" elemaninin tum gorunumlerini siliniz.
        List<String> silinecekler = new ArrayList<>();

        silinecekler.add("Altin Kemer");//

        a.removeAll(silinecekler);//[Pirlanta Tac, Gerdanlik, Kelepce Bilezik, Biberon]
        System.out.println(a);


    }
}
