
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.SoundbankResource;


public class Main {
    public static void main(String[] args){
        //once dosya olustruduk
      FileOutputStream fos=null; //dosya olusturmak icin referans atadik 
        try {
            fos =new FileOutputStream("dosya1.txt"); //dosyayi olusturduk 
            String s="veysel ugurlu"; //Stirng arrayi olsuturduk 
            
            byte[] s_array=s.getBytes(); //String arrayini byta donsuturduk 
            fos.write(s_array);
            
        } catch (FileNotFoundException ex) {
            System.out.println("dosya bulunamdi");     
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("dosya olusturulurken bir hata olustu...");            }
        }
      
      //veri alma islemi burda basliyor...
        FileInputStream fis=null;
        
    
        try {
            fis=new FileInputStream("dosya1.txt");
         
            //besinci karekterden sonraski 5 karekteri almak istiyoruz diyelim o zaman 
            int deger=0;
            String s="";
            fis.skip(7); //7 den sonraki karekteri alip devam edciek 
            int say =0;
            while((deger = fis.read())!=-1){
            s+=(char)deger;
            say++; //say degerini 7 den sornaki 6 karekteri almak icin kullandik 
            if(say==6){
            break;
            }
            }
            System.out.println("dosyanin 7. karekterinden itibaren 6 katrekter: "+s);
            
            
          /* 
            int deger=0;
            String s="";
            while((deger=fis.read())!=-1) {     //okunan karekter bitince -1 degere doncek ve bu sayede program sonlancak
            s+=(char) deger;    //her okunan karekterden sonra degeri bir articak
            
            }
            System.out.println("dosya icerigi: "+s); 
            */ 
                 
                 
     /*       fis.skip(5);   //besinci karekterden sonraisni okumak icin yani 6 ;
            System.out.println("6.karekter karekter: "+(char)(fis.read())); 
            */
        //    System.out.println("ilk karekter: "+(char)( fis.read())); 
          //   System.out.println("ikinci karekter: "+(char)( fis.read())); 
            
        } catch (FileNotFoundException ex) {
            System.out.println("file bulunamadi ");        } 
        catch (IOException ex) {
               System.out.println("Dosya okunurken hata olustu");
        }
       finally{
        if(fis != null){
            try {
                fis.close();
            } catch (IOException ex) {
                
            }
        }
        }
        
    
    
    }
}
