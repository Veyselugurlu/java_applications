
import java.io.Serializable;


public class Ogrenci implements Serializable{
    
//dosya boyutumuz cok fazla articaksa bazi ozellikerlini serilestirmemek isteriz bunu transient komutu ile yapariz  
//yada bazi ozellikler onemli degildir dosyada b-falza boyut kaplammasi icin de kullnairiz 
    
    private String isim;
    private int id;
    private String bolum;
    private transient int sinif; //kullnadik ve int deger old ivcşn ve Integerin carsayşlan degeri 0 old icin yazip
                                 //calistirdigimiz da o degerini vericek her ogrenci icin String deger olsa null dondurur varsayilani o cunku 
    //mesela bir ozellik eklemek isterek 
 
    
    public Ogrenci(String isim, int id, String bolum, int sinif) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        String bilgiler="\n Ogrenci ismi: " +isim+ "\n bolumu : " +bolum+"\n id: "+id+"\n sinifi : "+sinif;
        return bilgiler;
    }
    
    
    
}
