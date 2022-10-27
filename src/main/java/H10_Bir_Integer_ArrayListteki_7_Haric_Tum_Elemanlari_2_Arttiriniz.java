import java.util.ArrayList;
import java.util.List;

public class H10_Bir_Integer_ArrayListteki_7_Haric_Tum_Elemanlari_2_Arttiriniz {
    public static void main(String[] args) {

       // Bir Integer ArrayList'teki 7 haric tum elemanlari 2 arttiriniz.

        List<Integer> ages = new ArrayList<>();

        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w: ages) {

            if (w==7) {
                continue;
            }
            ages.set(ages.indexOf(w),w+2);
        }
        System.out.println(ages);//[14, 7, 23, 80, 11]
    }
}
