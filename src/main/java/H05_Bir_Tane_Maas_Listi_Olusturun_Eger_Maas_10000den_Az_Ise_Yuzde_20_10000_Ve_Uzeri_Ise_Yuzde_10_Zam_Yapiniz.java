import java.util.ArrayList;
import java.util.List;

public class H05_Bir_Tane_Maas_Listi_Olusturun_Eger_Maas_10000den_Az_Ise_Yuzde_20_10000_Ve_Uzeri_Ise_Yuzde_10_Zam_Yapiniz {
    public static void main(String[] args) {

        //Example 1: Bir tane maas listi olusturun,
        //eger maas 10.000'den az ise %20
        //10.000 ve uzeri ise %10 zam yapiniz.

        List <Double> maas = new ArrayList<>();

        maas.add(100000.50);
        maas.add(19000.750);
        maas.add(10000.00);
        maas.add(5000.600);
        maas.add(1000.500);

        System.out.println(maas);//[100000.5, 19000.75, 10000.0, 5000.6, 1000.5]

        for (Double w: maas) {

            if (w<10000) {

                maas.set(maas.indexOf(w),w*1.2 );

            } else {

                maas.set(maas.indexOf(w),w*1.1 );
            }
        }
        System.out.println(maas);//[110000.55, 20900.825, 11000.0, 6000.72, 1200.6]

    }
}
