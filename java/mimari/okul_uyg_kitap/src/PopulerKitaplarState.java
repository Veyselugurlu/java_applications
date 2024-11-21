import java.util.List;

public class PopulerKitaplarState implements KitapState{
    @Override
    public void KitapGoruntule(List<Kitap> kitaplar) {
        System.out.println("Popüler Kitaplar.");
        for (Kitap kitap: kitaplar){

            if (kitap.isPopulermi()){
            System.out.println(kitap);
        }
        }
    }
}
