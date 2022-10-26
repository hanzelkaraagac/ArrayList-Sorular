import java.util.ArrayList;
import java.util.List;

public class H03_Hanzel_ArrayListindek_Tum_Tek_Sayilari_11_Artirdiktan_Sonra_Ekrana_Yazdiriniz {
    public static void main(String[] args) {

        //Example 1: hanzel ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        List <Integer> hanzel = new ArrayList<>();

        hanzel.add(1);
        hanzel.add(11);
        hanzel.add(5);
        hanzel.add(4);
        hanzel.add(8);
        hanzel.add(12);

        for (int w: hanzel) {

            if (w%2!=0) {

              hanzel.set(hanzel.indexOf(w), w+11);

       System.out.println(hanzel.get(hanzel.indexOf(w+11)));//sadece update olanlari ekrana yazdirmaya yarar.
            }
        }
        System.out.println(hanzel);//[12, 22, 16, 4, 8, 12]
    }
}
