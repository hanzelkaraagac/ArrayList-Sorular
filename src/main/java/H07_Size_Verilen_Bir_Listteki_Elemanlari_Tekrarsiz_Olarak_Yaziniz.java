import java.util.ArrayList;
import java.util.List;

public class H_07_Size_Verilen_Bir_Listteki_Elemanlari_Tekrarsiz_Olarak_Yaziniz {
    public static void main(String[] args) {

        //Example 1: Size Verilen bir Listteki elemanlari tekrarsiz olarak yaziniz.
        //            [14, 8, 14, 14, 22, 7] ==> [14, 8, 22,7 ]

        List <Integer> sayi = new ArrayList<>();

        sayi.add(14);
        sayi.add(8);
        sayi.add(14);
        sayi.add(14);
        sayi.add(22);
        sayi.add(7);

        List<Integer> yeni = new ArrayList<>();

        for (int w: sayi) {

            if (!yeni.contains(w)) {

                yeni.add(w);
            }
        }
        System.out.println(yeni);//[14, 8, 22, 7]
    }
}
