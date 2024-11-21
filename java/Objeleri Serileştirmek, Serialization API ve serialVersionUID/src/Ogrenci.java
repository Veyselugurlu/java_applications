
import java.io.Serializable;
//dosyaya bisey ekleyip cikarinca bunu belirmemiz lazim yoksa 
//eger bir casis degistirceksek bu clasi belli bir versiyon kontrolunde  degistirmemiz gerekiyor
//yani : biz bir calsimizi n ismini degistiriyorsak(ornegin ogrenci bir iken ogrenci iki yapiyoruz bunu )yada clasi degistiriyouz en basitinden bunu belirtmeyince java bunu algillamiyor ve hata vermiyort

public class Ogrenci implements Serializable{
    private String isim;
    private int id;
    private String bolum;
   private static int ogrenci_sayisi=1; 

    public static int getOgrenci_sayisi() {
        return ogrenci_sayisi;
    }

    public static void setOgrenci_sayisi(int ogrenci_sayisi) {
        Ogrenci.ogrenci_sayisi = ogrenci_sayisi;
    }
    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Ogrenci " + "isim=" + isim + ", id=" + id + ", bolum=" + bolum ;
    }
    
    
}
