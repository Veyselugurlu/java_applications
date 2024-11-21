
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

//mesela diyelim ki mp3 bi dosyamiiz ctrl+c yaparak bu programda files kismina gelip kopyalamak istedik bunu varsayalimki oyle yaotik(muzik yok)
public class Main {
    private static ArrayList<Integer> icerik=new ArrayList<Integer>();  //icerigin depolanacagi kismi actik
    
    public static void dosyaOku(){ 
          try {
        //once dosyyai okumak icin bir file  input stream aciyoruz
        
        FileInputStream in=new FileInputStream("marş.mp3");//burda varsaydigimiz dosyayi yaziyoruz marş.mp 3 olsun bu dopsyanin ismi
        int oku;
        
        while(( oku = in.read()) != -1){ 
        icerik.add(oku);   // burda icerigi alip array'e aticaz ondan sorna assada kopyala metodu ile kopyalama islemini gerceklestircez     
        
        }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public static void kopyala(String dosyaismi){
        try {
            FileOutputStream out=new FileOutputStream("marş.mp3"); //kopyalancak dosya 
            for(int deger: icerik){ ////arraylistin uzerinde gezip yazdirma islemi  
            out.write(deger); //
            }
                       
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args ){
        
            dosyaOku();                 // once dosya okuma islemi tamamlandi  
            long baslangic = System.currentTimeMillis(); //o anki saniyeyi alir simdiki zaman 
            kopyala("mars2.mp3");
            kopyala("marş.mp3");    //burdan dosyayi koplyalama islemi tammalandi ve file'e gidip bakablirsin ama sarki acilmaz cunku sarki indirmedim ve kullanmadim 
            long bitis = System.currentTimeMillis();

            System.out.println("kopyalamak icin gecen sure "+((bitis-baslangic)/1000)+" saniyedir ");
            
    }
    
}
