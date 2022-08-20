import java.util.Scanner;

public class Ilan {

     String kategori;
     String baslik;
     String aciklama;
     String sehir;
     String ilce;
     String isSahibinden;

    Scanner input = new Scanner(System.in);

    public void ilanBaslik(){

        System.out.println("Lütfen İlan Başlığınızı Giriniz:");
        baslik = input.nextLine().toUpperCase();

    }

    public void ilanAciklama(){

        System.out.println("Lütfen İlan Açıklamanızı Giriniz:");
        aciklama = input.nextLine().toUpperCase();

    }

    public void ilanSehir(){

        System.out.println("Lütfen İlan Vereceğiniz Şehir Bilgisini Giriniz:");
        sehir = input.nextLine().toUpperCase();

    }

    public void ilanIlce(){

        System.out.println("Lütfen İlan Vereceğiniz İlçe Bilgisini Giriniz:");
        ilce = input.nextLine().toUpperCase();

    }

    public void sahibindenMi(){

        System.out.println("İlanınız sahibinden mi?");
        isSahibinden = input.nextLine().toUpperCase();

    }

    public void kategoriBilgisi(){

        System.out.println("Lütfen İlan Kategorisi Seçiniz ( EMLAK / VASITA ):");
        kategori = input.nextLine().toUpperCase();

    }


}
