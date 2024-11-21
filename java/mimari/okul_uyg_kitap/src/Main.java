import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Kitap> kitaplar = new ArrayList<>();

      /* kitaplar.add(new Kitap("Design Patterns","Eric Gama",
                550));
        kitaplar.add(new Kitap("Clean Code","Robert.C.Martin",
                1500));
        kitaplar.add(new Kitap("Java: The Complete Reference","Herbert Schild",
                41248));

        Kutuphane kutuphane=new Kutuphane();
        KitapSiralaStrategy adinagoresiralamastrategy=new AdinaGoreSiralamaStrategy();
        KitapSiralaStrategy yazaragoresiralamaAtrategy=new YazaraGoreSiralamaStrategy();
        KitapSiralaStrategy sayfasayisinagoresiralamastrategy =new SayfaSayisinaGoreSiralandi();

        System.out.println("\n---------------------------------\n");

        kutuphane.setSiralaStrategy(yazaragoresiralamaAtrategy);
        kutuphane.kitaplariListele(kitaplar);

        System.out.println("\n---------------------------------\n");

        kutuphane.setSiralaStrategy(sayfasayisinagoresiralamastrategy);
        kutuphane.kitaplariListele(kitaplar);

        System.out.println("\n---------------------------------\n");

        kutuphane.setSiralaStrategy(adinagoresiralamastrategy);
        kutuphane.kitaplariListele(kitaplar);
*/      Kutuphane kutuphane=new Kutuphane();
        kitaplar.add(new Kitap(true,false,"Design Patterns","Eric Gama",
                550));
        kitaplar.add(new Kitap(false,false,"Clean Code","Robert.C.Martin",
                1500));
        kitaplar.add(new Kitap(true,false,"Java: The Complete Reference","Herbert Schild",
                41243));

        KitapState onerilenstate=new OnerilenKitaplarState();
        kutuphane.setState(onerilenstate);
        kutuphane.KitaplarimGuncelDurumuLsitele(kitaplar);



    }
}