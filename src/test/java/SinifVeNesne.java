import org.junit.Test;

public class SinifVeNesne {

    @Test
    public void ornekSinifVeNesne(){
        Ogrenci o = new Ogrenci();
        o.ad = "Melih";
        o.soyad = "Sakarya";
        o.yas = 39;
        o.notOrtalamasi = 2.96;


        System.out.println(o.ad + " " + o.soyad + " " + o.yas);
    }

    @Test
    public void ornekSinifVeNesne2(){
        Ogrenci o1 = new Ogrenci();
        Ogrenci o2 = new Ogrenci();
        Ogrenci o3 = o1;

        o1.ad = "Melih";
        o1.soyad = "Sakarya";
        o1.dersCalis();

        o2.ad = "Ahmet";
        o2.soyad = "Dursun";
        o2.dersCalis();

        o3.ad = "Ali";

        o1.dersCalis();
        o3.dersCalis();
    }

    @Test
    public void kompozisyon(){
        Ogrenci o1 = new Ogrenci();
        o1.ad = "Melih";
        o1.soyad = "Sakarya";
        o1.yas = 39;
        //o1.okulu = new Okul();
        o1.okulu.ad = "Ayvalik Lisesi";
        o1.okulu.adres = "Balıkesir Ayvalik";
        o1.okulu.ogrenciSayisi = 300;

        System.out.println(o1.ad + " " + o1.soyad + " " + o1.yas);
        System.out.println(o1.okulu.ad + " " + o1.okulu.adres + " " + o1.okulu.ogrenciSayisi);
    }
}
