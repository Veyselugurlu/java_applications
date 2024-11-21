
import java.util.Scanner;

//Thread eklencek
public class Main {
    public static void main(String[] args) {
        System.out.println("kumanda prıgramina Hosgeldiniz...");
        Scanner scanner=new Scanner(System.in);
        
        String islemler=" islemler\n"
                + "1.Kanallari Goster\n"
                + "2.Kanal Ekle\n"
                + "3.Kanal Sil \n"
                + "4.Kanal Sayisi Ogren\n"
                + "Cikis icin q bas";
         System.out.println(islemler);
        Kumanda kumanda =new Kumanda();
            while (true){
            System.out.println("yapmak istediginiz islemi seciniz .... ");
            String islem=scanner.nextLine();
           
            if(islem.equals("q")){
                System.out.println("cikis yapiliyor...");
                break;
                
            }
            else if(islem.equals("1")){
                kanallariGoster(kumanda);
            }
            else if(islem.equals("2")){
                System.out.println("eklencek kanal secin ");
                String kanal_ismi=scanner.nextLine();
                kumanda.kanalEkle(kanal_ismi);
            }
            else if(islem.equals("3")){
                System.out.println("silincek kanali secin : ");
                String kanal_ismi=scanner.nextLine();
                kumanda.kanalSil(kanal_ismi);
                
            }
            else if(islem.equals("4")){
                System.out.println("kanal sayisi : "+kumanda.kanalSayisi());
                
            }
            else{
                System.out.println("Gecersiz Islem Sectiniz !");
            }
            
            
        }
    
    }
    public static void kanallariGoster(Kumanda kumanda){
    if(kumanda.kanalSayisi()==0){
        System.out.println("su anda hic kanal bulunmuyor...");
    }
    else {
    for(String kanal:kumanda){
        System.out.println("kanal: "+kanal);
    }
    }
    
    }
}
