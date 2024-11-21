
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//file readerin buffereading arasoındaki farki buffered tek seferde veriyi alir filer reader ise tek tek listeyi tarar birer birer getirir bu da zan kaybina neden olutr
//buffered read daha verimlidiri bu yuzden kullanşmş şse new bufferedreader (new filereader )tarzinda devam eder) buyuk dosyalarda erformans acisindan daha iyi
//file writer degiskeni genelde txt dsyalarinda kullanilir filee out put stream gibi ugrastirmaz am file out put stream i genelde mp3 veya mp 4 degerlerde kullaniri
//ve de file output stream gibi ugrastirmaz dememizin sebebi ise file out put stream de String deger byte kod ile almayi vs yi kastediyorduk 
public class Main {
    public static void main(String[] args){
        FileWriter writer= null;   //en basta direkt olusturmamamizin sebebi finally metodundada kullanabilmek icindi.
        
        try 
        {            
            writer =new FileWriter("dosya3.txt",true); //dosya olusutrduk 
            writer.write("veysel ugurlu,yazilim muhendisligi\n"); //yazdirma islemi 
            writer.write("ali osman,Gida muhendisligi\n");
            writer.write("mehmet ali sivri,yazilim muhendisligi\n");
            writer.write("alios amigos,bilgisayar muhendisligi\n");
            
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
        
        
        //bu skısımdan sornası start veiyoruz 
   // try(Scanner scanner=new Scanner(new FileReader("dosya3.txt"))){   // okuma islemi icin scanner ile aliyoruz her bir satiri , satir alir  
 /*     try(Scanner scanner=new Scanner (new BufferedReader(new FileReader("dosya3.txt") ))){  //Bufferedreader sekli
        while(scanner.hasNextLine()){
   
            //System.out.println("okunan deger: " +scanner.nextLine() ); //txtin icindeki butun degri yazidirir.
            //sadece yazilim muhendisligi okuyanlari yazidrmk istersek eger 
   
            String ogrencibilgisi=scanner.nextLine(); 
            String[] array=ogrencibilgisi.split(","); //virgulden sorna ogrenci bilgisi aiıncak
            
            if(array[1].equals("yazilim muhendisligi")){  //virgulden sonra yazilim muhendisligi okuyan ogrencileri alıcak ve yazdiricak
                System.out.println("ogrenci bilgisi : "+ogrencibilgisi);
            }
        }
        
    } 
    catch (IOException ex) 
       {
        
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
  
      */
 
 
      //Bufferedwriter kullanim sekli ise soyledir 
      try(BufferedWriter writer4 = new BufferedWriter(new FileWriter("dosya3.txt",true)))
      {
      writer4.write("ali cebeci ,insaat muhendisli");
      } catch (IOException ex) 
      {
          System.out.println("Dosya acilirken hata olustu");
      }
        }
}
