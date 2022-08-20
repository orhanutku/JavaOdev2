import java.util.Scanner;

public class Vasita extends Ilan {

     String vitesTipi;
     String renk;
     String isKazali;

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

    public void aracVitesTipi(){

        System.out.println("Otomatik vitesli mi? Manuel vitesli mi?");
        vitesTipi = input.nextLine().toUpperCase();

    }

    public void aracRenk(){

        System.out.println("Lütfen araç renginizi belirtiniz:");
        renk = input.nextLine().toUpperCase();

    }

    public void kazaliMi(){

        System.out.println("Aracınız kazalı mıdır?");
        isKazali = input.nextLine().toUpperCase();

    }


    public void vasitaIlanBilgileri(){

        System.out.println("Vasıta İlanınıza Ait Bilgiler Aşağıdaki Gibidir;");
        System.out.println("İlan Başlığı : " + baslik);
        System.out.println("İlan Açıklaması : " + aciklama);
        System.out.println("İlanın Bulunduğu İl : " + sehir);
        System.out.println("İlanın Bulunduğu İlçe : " + ilce);
        System.out.println("Sahibinden İlanı Mı : " + isSahibinden );
        System.out.println("Araç Vites Bilgisi : " + vitesTipi );
        System.out.println("Aracınızın Renk Bilgisi : " + renk );
        System.out.println("Araçta Hasar Var Mı : " + isKazali );

    }

}
