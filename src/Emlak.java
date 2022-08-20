import java.util.Scanner;

public class Emlak extends Ilan {

    public int odaSayisi;
    public int alan;
    public int kat;
    public String isSite;
    public int banyo;

    Scanner input = new Scanner(System.in);

    @Override
    public void ilanBaslik() {
        super.ilanBaslik();
    }

    @Override
    public void ilanAciklama() {
        super.ilanAciklama();
    }

    @Override
    public void ilanSehir() {
        super.ilanSehir();
    }

    @Override
    public void ilanIlce() {
        super.ilanIlce();
    }

    @Override
    public void sahibindenMi() {
        super.sahibindenMi();
    }

    public int oda(){

        System.out.println("Lütfen oda sayısı giriniz:");
        odaSayisi = input.nextInt();
        return odaSayisi;

    }

    public int daireAlani(){

        System.out.println("Lütfen daire m2 bilgisi giriniz:");
        alan = input.nextInt();
        return alan;

    }

    public int katBilgisi(){

        System.out.println("Daire kat bilgisini giriniz:");
        kat = input.nextInt();
        return kat;

    }

    public void siteMi(){

        System.out.println("Daireniz site içerisinde mi?");
        isSite = input.nextLine().toUpperCase();

    }

    public int banyoSayisi(){

        System.out.println("Dairenizde kaç adet banyo bulunmaktadır?");
        banyo = input.nextInt();
        return banyo;

    }

    public void emlakIlanBilgileri(){

        System.out.println("Emlak İlanınıza Ait Bilgiler Aşağıdaki Gibidir;");
        System.out.println("İlan Başlığı : " + baslik);
        System.out.println("İlan Açıklaması : " + aciklama);
        System.out.println("İlanın Bulunduğu İl : " + sehir);
        System.out.println("İlanın Bulunduğu İlçe : " + ilce);
        System.out.println("Sahibinden İlanı Mı : " + isSahibinden );
        System.out.println("Daire Site İçerisinde Mi : " + isSite );
        System.out.println("Dairenin Bulunduğu Kat Bilgisi : " + kat );
        System.out.println("Daire Oda Sayısı : " + odaSayisi );
        System.out.println("Daire m2 Bilgisi : " + alan );
        System.out.println("Daire Banyo Sayısı : " + banyo );

    }


}
