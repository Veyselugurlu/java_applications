
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
     
        FileOutputStream fos=null; //output stream e deger verdik
      //  File file=new File("dosya.txt");//dosyayı olusturuk
        try {
            fos=new FileOutputStream("dosya.txt",true); //diger bir dosya olusturma yontemi true ise dosyada daha once yazdigimiz verinin silinmemeisni saglar
            fos.write(65);
        //    byte[] s={101,66,68};
          //   fos.write(s);
             
             String s="veysel ugurlu"; 
             byte[] s_array=s.getBytes(); //String arrayini byte arrayine donusturduk.
             fos.write(s_array);
             
        } catch (FileNotFoundException ex) {
            System.out.println("file not found exception olustu...");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 
        //bizim arka plandaki kaynaklari bosa harcamamak icin ve hata oldugu zaman exception vermek icin 
        // finally bloğu olustururuz.
   finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("dosya olusturulurken bir hata olustu...");  
            }
        }
    } 
}
