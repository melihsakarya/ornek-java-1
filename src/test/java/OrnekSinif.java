import org.junit.Test;

public class OrnekSinif {

    //deneme
    //asdasd
    @Test
    public void ornekMethod(){
        System.out.println("Merhaba Dünya");
        int x;
        long y;
        float z;
        double d;
        Double d2 = 22.0;
        String ad = "Melih";

        byte b = 127;
        short s = 4;

        int a = 4;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);

    }

    @Test
    public void ornekMetodIki(){
        int x = 4;
        int y = 6;
        System.out.println(x == y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x != y);


        System.out.println(x == y && x > 0);
        System.out.println(x != y && x > 0);
        System.out.println(x != y || x > 0);



    }

    @Test
    public void ornekMetodUc(){
        String ad = "Melih";
        String soyad = "Sakarya";

        System.out.println(ad + " " + soyad);
    }

    //JDK kurulumu yapın
    //IntelliJ kurulumu yapın

    //Bir maven projesi oluşturun
    //JUnit' i ekleyin
    //Ornek bir test kodu yazin
    //Testi çaşlıştırın


}


