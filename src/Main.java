import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



    Ilan ilan = new Ilan();
    Emlak emlak = new Emlak();
    Vasita vasita = new Vasita();

    Scanner input = new Scanner(System.in);

    do {

        ilan.kategoriBilgisi();

        if (ilan.kategori.equals("EMLAK")) {
            emlak.ilanBaslik();
            emlak.ilanAciklama();
            emlak.ilanSehir();
            emlak.ilanIlce();
            emlak.sahibindenMi();
            emlak.siteMi();
            emlak.katBilgisi();
            emlak.oda();
            emlak.daireAlani();
            emlak.banyoSayisi();
            emlak.emlakIlanBilgileri();

        }

        else if (ilan.kategori.equals("VASITA")) {

            vasita.ilanBaslik();
            vasita.ilanAciklama();
            vasita.ilanSehir();
            vasita.ilanIlce();
            vasita.sahibindenMi();
            vasita.aracVitesTipi();
            vasita.aracRenk();
            vasita.kazaliMi();
            vasita.vasitaIlanBilgileri();
        }

    }

    while (ilan.kategori.equals("EMLAK") || ilan.kategori.equals("VASITA")) ;
        {

            System.out.println("Hatalı Kategori Bilgisi Girdiniz. Lütfen EMLAK ya da VASITA seçimi yapınız.");

        }
    }

}
