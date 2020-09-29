import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiziOrnek {

    @Test
    public void tekBoyutluDizi(){
        String[] dizi = new String[4];

        dizi[0] = "Ankara";
        dizi[1] = "Istanbul";
        dizi[2] = "Izmir";

        System.out.println(dizi.length);
        System.out.println(dizi[1]);
        System.out.println(dizi[3]);
        System.out.println(dizi[2]);

        //10-10 2 boyutlu bir dizi yapin
        //[4][2] değerine 8 atayın
        //[6][6] değerine 36 atayın

    }

    @Test
    public void diziOrnek(){
        int[][] carpimlar = new int[10][10];
        for (int x = 1; x < 10; x ++){
            for (int y = 1; y < 10; y ++){
                carpimlar[x][y] = x * y;
            }
        }

        System.out.println(carpimlar[2][2]);
        System.out.println(carpimlar[9][9]);
        System.out.println(carpimlar[6][8]);
        System.out.println(carpimlar[5][5]);
    }

    @Test
    public void diziOrnek2(){
        String[] dizi = {"Ankara", "Istanbul", "Izmir", "Adana"};
        //System.out.println(dizi[1]);

        for (String sehir: dizi) {
            System.out.println(sehir);
        }

        System.out.println("*********");
        Arrays.sort(dizi);

        for (String sehir: dizi) {
            System.out.println(sehir);
        }
    }

    @Test
    public void listOrnek(){

        List<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
        sehirler.add("Adana");

        for (String sehir: sehirler) {
            System.out.println(sehir);
        }
    }
}
