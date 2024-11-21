import java.util.List;

public class Kutuphane {

    private KitapSiralaStrategy siralaStrategy;

    public Kutuphane(){

    }

    public void setSiralaStrategy(KitapSiralaStrategy siralaStrategy) {
        this.siralaStrategy = siralaStrategy;
    }
    public void kitaplariListele(List<Kitap> kitaplar){

        siralaStrategy.sort(kitaplar);
        for(Kitap kitap : kitaplar){
            System.out.println(kitap);
        }
    }
    private KitapState gunceldurumu;

    public void setState(KitapState gunceldurumu){
        this.gunceldurumu =gunceldurumu;
    }
    public void KitaplarimGuncelDurumuLsitele(List<Kitap> kitaplar){
        gunceldurumu.KitapGoruntule(kitaplar);
    }


}
