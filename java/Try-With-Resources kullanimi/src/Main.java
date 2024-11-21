
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
 public static void main(String[] args){

         

         
   try(FileWriter writer = new FileWriter("diller.txt");//diyelimki birden fazla dosyaya veri yazmak istiyoruz o zman tanşmlicamiz sekil sosyle yapilir
        FileWriter wiriter2 =new FileWriter("vms.txt")){ //trywithresource finallly bloguna ihtiyac duymadan otomatik arka plandaki verileri kapatir 
      
         Scanner scanner =new Scanner(System.in);
     String dil;
     
     while(true){
         System.out.println("bir dil giriniz : ");
         dil=scanner.nextLine();
         
         writer.write(dil+"\n"); 
         
         if(dil.equals("-1")){
             
             System.out.println("Programdan Cikiliyor...");
             System.out.println("Dosyanizi kontrol edin....");
             break;
         }
     }
     
     }  
     catch (IOException ex) 
     {
         System.out.println("IOExcepition olusturulurken hata olustu...");
     }
 
 }   
}
