import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class H08_Kullanicidan_Bir_Harf_Aliniz_Harf_Sizdeki_Listin_Icinde_Varsa_0_Harfi_Bulunduya_Ceviriniz_Yoksa_O_Harfi_Liste_Ekleyiniz {
    public static void main(String[] args) {

        //Example 2: Kullanicidan bir harf aliniz, harf sizdeki List'in icinde varsa
        // o harfi "Buldunuz" ya ceviriniz yoksa o harfi List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

        Scanner input = new Scanner(System.in);

        String harf = "";

        List<String> c = new ArrayList<>();

        c.add("P");
        c.add("A");
        c.add("R");
        c.add("A");

        do {
            System.out.println("Lutfen bir harf giriniz");
            harf = input.next().substring(0, 1);

            if (c.contains(harf)) {
                c.set(c.indexOf(harf), "Buldunuz");

            } else if (!harf.equals("Q")){
                System.out.println("Cikmak icin \"Q\" ya basiniz");
                c.add(harf);
            }
            System.out.println(c);

        }while (!harf.equals("Q"));


    }
}
