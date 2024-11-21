
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void mekan_Yas_Kontrol(int yas) throws IOException{ //bu metod ıoexception fırlatcak demek. checked olduğu içinn 
            
    if(yas<18){
    throw new IOException();
    
    }
    else{System.out.println("mekana hosgeldiniz");}
    }
    public static void main(String[] args){ //en lattaki acıklamanin kodu burtaya yaazılır suslu oarentezzden hemen oncesine 'throws exception'
        System.out.println("yasinizi giriniz");
        Scanner scanner =new Scanner(System.in);
        int yas=scanner.nextInt();
 
        try {
            mekan_Yas_Kontrol(yas); // static olmasa obje oluşrurmadan yazamazdık
            //ya try catch le hatayı yakalamak laızm yada mainin yanına throw ıoexception ile belirrtmek
            
            //try catch ile diyelimki yakalatmadık o zman pulix static void mainin yanına throws ıoexception dyerek apı uygulamsında kullnaıcak kişi yakalatır
            //her zaman projeleri kendimiz icin gelistirmeyiz sebebide budur 
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("cemil");
    
    }
}
