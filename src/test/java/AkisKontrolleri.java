import org.junit.Test;

public class AkisKontrolleri {

    @Test
    public void ifElseKontrolu(){
        int x = 6;

        if(x > 4){
            System.out.println("X değeri 4 ten büyüktür");
        }
        else if(x > 0){
            System.out.println("X değeri 0 dan büyüktür");
        }
        else if(x == 4){
            System.out.println("X değeri 4 tür");
        }
        else if(x < 4){
            System.out.println("X değeri 4 ten büyüktür");
        }
        else{
            System.out.println("X değeri bilinmiyor");
        }
    }

    @Test
    public void ornekForDongusu(){
        for (int x = 0; x < 10 ; x++){
            for (int y = 0; y < 10; y++) {
                System.out.println(x + " " + y);
            }
        }
    }

    //0-100 arasindaki çift sayıları yazdırın
    //0-1000 arasindaki asal sayilari bulup yazdirin


    @Test
    public void asalSayiBulma(){

        ilkDongu:
        for (int sayi = 2; sayi < 1000 ; sayi++){
            for (int bolen = 2; bolen < sayi; bolen ++){
                if(sayi % bolen == 0){
                    continue ilkDongu;
                }
            }
            System.out.println(sayi);
        }
    }

    @Test
    public void notKontrolu(){
        int not = 91;

        if(not >= 0 && not <= 59){
            System.out.println("F");
        }
        else if(not >= 60 && not <= 69){
            System.out.println("D");
        }
        else if(not >= 70 && not <= 79){
            System.out.println("C");
        }
        else if(not >= 80 && not <= 89){
            System.out.println("B");
        }
        else if(not >= 90 && not <= 100){
            System.out.println("A");
        }
        else {
            System.out.println("Geçerli bir not giriniz...");
        }

    }

    @Test
    public void ifVeElseIfFarki(){
        int dersNotu = 90;

        if(dersNotu >= 60){
            System.out.println("Tebrikler geçtiniz");
        }
        else if(dersNotu < 60){
            System.out.println("Maalesef kaldiniz...");
        }

        if(dersNotu > 80){
            System.out.println("Yüksek ortalama tebrikler...");
        }

    }

    @Test
    public void whileDongusu(){
        int i = 0;
        while(i < 10){
            System.out.println("i = " + i++);
        }
    }

    //içe döngü ile çarpın tablosu yapın
    //i*j = 48
    //i*j = 20
    //aynı sayı çarpımlarını koymayın

}
