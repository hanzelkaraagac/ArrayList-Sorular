import java.util.ArrayList;
import java.util.List;

public class H11_Size_Verilen_ArrayListte_8_Ve_8_den_Onceki_Tum_Sayilari_Elemanlari_2_Katina_Cikariniz {
    public static void main(String[] args) {

    //Example 2: Size verilen ArrayList'te 8 ve 8 den onceki tum sayilari elemanlari 2 katina cikariniz.

        List<Integer> nums = new ArrayList<>();

        nums.add(20);
        nums.add(3);
        nums.add(7);
        nums.add(8);
        nums.add(54);
        nums.add(55);

        for (Integer w:nums) {

            nums.set(nums.indexOf(w),w*2);

            if (w==8) {
                break;
            }
        }
        System.out.println(nums);


    }
}
