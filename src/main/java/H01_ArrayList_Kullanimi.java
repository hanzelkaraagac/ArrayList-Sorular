import java.util.ArrayList;
import java.util.List;

public class H01_ArrayList_Kullanimi {

     /*
            ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.
            Array ile ArrayList'in farki nedir?

            1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
            Array'ler eleman sayisinda "fixed" dirler.
            ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.

            2)Array'lerin icine "primitive" ve "reference" lar konulabilir.
            ArrayList'lerin icine ise sadece "non-primitive"ler konulur.

            3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.

            Note: Elema sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
                  eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin.


         */

    public static void main(String[] args) {



            //ArrayList nasil olusturulur?
            //1.yol
            ArrayList<Integer> ages = new ArrayList<Integer>();

            //2.yol
            ArrayList<Integer> heights = new ArrayList<>();

            //3.yol
            List<Integer> nums = new ArrayList<>(); //Genellikle 2. ve 3. kullanilir. 3. daha kisa oldugu icin o mantikli.



            //ArrayList'ler nasil yazdirilir?
            System.out.println(nums);// [ ];

            //ArrayList'lere nasil eleman eklenir?
            // add() method'u her zaman elemani en sona ekler. (insertion order)
            nums.add(21);
            nums.add(18);
            nums.add(20);
            System.out.println(nums);//[21, 18, 20]

            nums.add(1,50); // index'e eleman eklemimize yarar
            System.out.println(nums);//[21, 50, 18, 20]

            List<Integer>prices = new ArrayList<>();
            prices.add(23);
            prices.add(185);

            nums.addAll(prices); //List icin List ekleyebilmemize yarar

            System.out.println(nums);//[21, 50, 18, 20, 23, 185]
            System.out.println(prices);//[23, 185]

            nums.addAll(2,prices);//eklemek istedigin Listin istedigin yere koyabilirsin.
            System.out.println(nums);//[21, 50, 23, 185, 18, 20, 23, 185]

            //ArrayList'lerin eleman sayisini nasil bulunur?
            int elemanSayisi = nums.size(); // Array'ler hakkinda "Lenght" kullanin. Listler hakkinda konusurken "Size" diyin
            System.out.println(elemanSayisi);//8

            //ArrayList'lerde herhangi bir eleman nasil secilir?
            int el1 = nums.get(3); // get() method'u istenen bir index'deki elemani verir.
            System.out.println(el1);//185

            //ArrayList'in bos olup olmadigini nasil anlariz?
            boolean bos1 = nums.isEmpty();// bos oldugu zaman "true" verir. dolu oldugu icin "false" verir.
            System.out.println(bos1);//false

            boolean bos2 = nums.isEmpty();
            System.out.println(bos2);//true

            //ArrayList' de bir eleman nasil degistirilir?

            nums.set(3,200); //var olan bir elemani, yeni bir elemanla degistirmeye yarar. (indexini alir, sayiyi degistirir)
            System.out.println(nums);// [21, 50, 23, 200, 18, 20, 23, 185]

    }
}
