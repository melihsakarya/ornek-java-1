import org.junit.Test;

public class MetodOrnekleri {

    @Test
    public void matematikIslemleri(){
        Matematik mat = new Matematik();

        int sonuc = mat.topla(4, 5);

        System.out.println(mat.topla(2, 4));
        System.out.println(mat.carp(2, 4));
        System.out.println(mat.bol(7, 2));

        mat.yazdir("Merhaba Dunya");

        mat.topla(2, 4);
        mat.topla(2, 4, 6);
        mat.topla(2, 4L);
        //mat.topla(2, "");
    }

    @Test
    public void varArgs() {
        Matematik mat = new Matematik();
        System.out.println(mat.carpma(2, 4));
        System.out.println(mat.carpma(2, 4, 6));
        System.out.println(mat.carpma(2, 4, 2, 2, 8, 6));
    }
}
