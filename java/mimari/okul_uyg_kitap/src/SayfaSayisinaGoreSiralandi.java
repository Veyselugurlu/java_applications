import java.util.List;

public class SayfaSayisinaGoreSiralandi implements KitapSiralaStrategy{
    @Override
    public void sort(List<Kitap> kitaplar) {
        kitaplar.sort((b1,b2)->Integer.compare(b1.getSayfaSayisi(), b2.getSayfaSayisi()));
        System.out.println("kitaplar sayfa sayısına gore sıralandı");
    }
}
