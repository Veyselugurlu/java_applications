import java.util.List;

public class AdinaGoreSiralamaStrategy implements KitapSiralaStrategy
{
    @Override
    public void sort(List<Kitap> kitaplar) {
        kitaplar.sort((b1,b2)->b1.getAdi().compareTo(b2.getAdi()));
        System.out.println("kitaplar , başlık sırasına gore sıralandı .");
    }
}
