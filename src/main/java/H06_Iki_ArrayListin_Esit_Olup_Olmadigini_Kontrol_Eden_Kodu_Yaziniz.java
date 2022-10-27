import java.util.ArrayList;
import java.util.List;

public class H06_Iki_ArrayListin_Esit_Olup_Olmadigini_Kontrol_Eden_Kodu_Yaziniz {
    public static void main(String[] args) {

        //example 4: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz.
        //Note: Iki ArrayList'in esit olabilmesi icin, elemanlar esit olmali ve ayni elemanlar ayni index'de olmali.

        List <Character> listem = new ArrayList<>();

        listem.add('P');
        listem.add('A');
        listem.add('R');
        listem.add('A');

        List <Character> listem2 = new ArrayList<>();

        listem2.add('P');
        listem2.add('A');
        listem2.add('R');
        listem2.add('A');

        boolean esitmi = listem.equals(listem2);

        if (esitmi) {
            System.out.println("Listler esittir");
        } else {
            System.out.println("Listler esit degildir");
        }



    }
}
