
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku {
    public static void main(String[] args) { //bilgileri gormek icin mainden sağ clik basili kaydirirp run file diyoruz 
                                                                    //ve ogrenci.bin dosyasinin icindeki bilgileri okuyoruz   
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){ //okucamiz dosyayi belirtme sekilimiz 
        Ogrenci ogrenci1=(Ogrenci)in.readObject();  //okuma islemi obje en ust class old icin ogrenciye geri cevirdik
        Ogrenci ogrenci2=(Ogrenci)in.readObject();

            System.out.println(ogrenci1);
            System.out.println("**************");
            System.out.println(ogrenci2);
            
                    System.out.println("ogrenci sayisi : "+Ogrenci.getOgrenci_sayisi()); //ogrenci sayisini yine de bir veriyor cunku objeye ozgu degil ve bu yuzden serileştirme islemi yapmiyor

        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadi....");
            } catch (IOException ex) {
            System.out.println("Dosya acilirken hata olustu");
        } catch (ClassNotFoundException ex) {
            System.out.println("Sinif bulunamadi");
        }
    }
}
