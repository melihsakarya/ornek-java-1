public class Ogrenci {
    String ad;
    String soyad;
    Integer yas;

    Double notOrtalamasi;

    Okul okulu = new Okul();

    public void dersCalis(){
        System.out.println(ad + " " + soyad + " ders calisiyor...");
    }

}
