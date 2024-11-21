
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeYaz {
    public static void main(String[] args){
    Ogrenci o1=new Ogrenci("veysel ugurlu", 1234, "yazilim muhendidsligi",2); //objeleri olusturduk
    Ogrenci o2=new Ogrenci("mehmet ali ", 123456, "yazilim muhendslgi", 2);
    Ogrenci o3=new Ogrenci("ersin tekinel", 6787, "gida muhendisligi", 3);
    
    Ogrenci[] ogrenci_array={o1,o2,o3}; //arrayi olsurutduk 
    ArrayList<Ogrenci> liste =new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array)); //listeyi olusturduk
    try(ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){ //serilestirerek yazma islemi
    out.writeObject(ogrenci_array); //arrayi objeye donsuturduk .
    out.writeObject(liste);         //listeyi objeye donsuturduk.
    
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(ObjeYaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObjeYaz.class.getName()).log(Level.SEVERE, null, ex);
        }
       }}
       
    