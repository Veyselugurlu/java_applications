
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiYaz {
    public static void main(String[] args) {
        
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){ //objeleri bu seri uzerinden serilestirrme islemi yapiyoruz 
       
        Ogrenci ogrenci1= new Ogrenci("veysel ugurlu", 1234, "yazilim muhendisligi");
        Ogrenci ogrenci2= new Ogrenci("yunus", 12221, "sosyal muhendislik");
       Ogrenci.setOgrenci_sayisi(100); //burda ogrenci sayşisinin degerini 100 verdik bakalim guncellencek mi (olmayacak objeye degil clasa ozgu ve buyuzden transient kullanılmis gibi oluyor )

        out.writeObject(ogrenci1); //ogrencimizi en ust sinif olan objeye donusturcek daha sonra bunu byte dizisine donusturup ogreci.bin dosyasina yazicak
        out.writeObject(ogrenci2);
        
        
        }
      catch (FileNotFoundException ex) {
            Logger.getLogger(ObjeyiYaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObjeyiYaz.class.getName()).log(Level.SEVERE, null, ex);
        }
} }
