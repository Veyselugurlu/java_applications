
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static String harfnotuHesapla(String isim,int vize,int kisasinav,int finalnot){
         String  cikti=""; //surekli her ciktiyi string olarak belirtmektense tek tanimladik  
        double totalnot=(vize*(3/10.0)+kisasinav*(2/10.0)+ finalnot*(5/10.0));
        
        if(totalnot>=90){
        cikti = isim+" adli ogrenci AA aldi";
        }
        else if(totalnot>=85){
        cikti = isim+" adli ogrenci BA aldi";
        
        }
        else if(totalnot>=80){
        cikti = isim+" adli ogrenci BB aldi";
        
        }
        else if(totalnot>=75){
        cikti=isim+" adli ogrenci CB aldi";
        
        }
        else if(totalnot>=70){
        cikti = isim+" adli ogrenci CC aldi";
        
        }
        else if(totalnot>=65){
        cikti = isim+" adli ogrenci DC aldi";
        
        }
        else if(totalnot>=60){
        cikti= isim+" adli ogrenci DD aldi";
        
        }
        else if(totalnot>=55){
        cikti = isim+" adli ogrenci FD aldi";
        
        }
        else {
        cikti = isim+" adli ogrenci FF aldi ve kaldi";
        
        }
        
return cikti;
}
    
    public static void main(String[] args) {
        try(Scanner scanner =new Scanner(new FileReader("ogrenciler.txt"));
             FileWriter writer=new FileWriter("harnotlari.txt"))  
        {
        while(scanner.hasNextLine()){
        String ogrenciBilgileri= scanner.nextLine();  //bu sekil dosyanin degerini okuyacagiz
        
           String[] ogrenciArray=ogrenciBilgileri.split(","); //indexleri ayirdikik
            
            int vize=Integer.valueOf(ogrenciArray[1]);    //int  degere dondurduk cunku Stirng durumunda 
            int kisasinav=Integer.valueOf(ogrenciArray[2]);
            int finalnot=Integer.valueOf(ogrenciArray[3]);
            
      String cikti=harfnotuHesapla(ogrenciArray[0], vize, kisasinav, finalnot); //ciktiyi alip yazdirdik
            writer.write(cikti+"\n");

            
        }
        } 
        
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
