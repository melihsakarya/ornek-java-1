public class Matematik {

    int topla(int x, int y){
        return x + y;
    }

    int topla(int x, int y, int z){
        return x + y;
    }

    long topla(int x, long y){
        return x + y;
    }



    int cikar(int x, int y){
        return x - y;
    }


    int carp(int x, int y){
        return x * y;
    }

    int carpma(int ... carpimSayilari){

        int toplam = 1;
        for (int sayi: carpimSayilari) {
            toplam *= sayi;
        }

        return toplam;
    }

    double bol(int x, int y){
        return (double)x / y;
    }

    void yazdir(String mesaj){
        System.out.println(mesaj);
    }
}
