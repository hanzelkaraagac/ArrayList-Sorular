import java.util.ArrayList;
import java.util.List;

public class H04_ArrayListden_34_Elemaninin_Ilk_Gorunumunu_Siliniz {
    public static void main(String[] args) {

        //Example 2: ArrayList'den 34 elemaninin ilk gorunumunu siliniz.

        List<Integer> hanzel = new ArrayList<>();

        hanzel.add(7);
        hanzel.add(34);
        hanzel.add(77);
        hanzel.add(777);
        hanzel.add(34);
        hanzel.add(7777);

        System.out.println(hanzel);//[7, 34, 77, 777, 34, 7777]


        //remove() method'unun icine tam sayi koyarsaniz Java onu index olarak kabul eder.

        Integer sayi = 34;
        hanzel.remove(sayi);

        System.out.println(hanzel);//[7, 77, 777, 34, 7777]

    }
}
