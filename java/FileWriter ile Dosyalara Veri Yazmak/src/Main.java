
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//file writer degiskeni genelde txt dsyalarinda kullanilir filee out put stream gibi ugrastirmaz am file out put stream i genelde mp3 veya mp 4 degerlerde kullaniri
//ve de file output stream gibi ugrastirmaz dememizin sebebi ise file out put stream de String deger byte kod ile almayi vs yi kastediyorduk 
public class Main {
    public static void main(String[] args){
        FileWriter writer= null;   //en basta direkt olusturmamamizin sebebi finally metodundada kullanabilmek icindi.
        
        try 
        {            
            writer =new FileWriter("dosya.txt",true); //dosya olusutrduk 
            writer.write("veysel ugurlu\n"); //yazdirma islemi 
            writer.write("ali osman\n");
            writer.write("mehmet ali sivri\n");    
            
        }
        catch (IOException ex) 
        {
                System.out.println("Dosya Acilirken İOexception olustu...");
        }
        
        finally{
            
        if(writer != null) 
        {       //  eger dosya bos degilse kapat gerkesiz veri kullanilmasin diye bu yuzden finally blogunu kullanmak iyidir
            try 
            {
                writer.close();
                
            } 
            catch (IOException ex) 
            {
                System.out.println("Dosya Kapatilirken bir hata olustu....");
            }
        }
        }
    
    }
}
