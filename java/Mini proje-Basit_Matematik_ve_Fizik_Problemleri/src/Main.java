
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException{ //cikis islemi yapilinca 1 saniye bekleme icin atandı
    
       
       String islemler= "yapmak istediginiz islemi secin:\n"
                +"1- Daire alan hesaplama\n"
                +"2- Ucgen cevre hesaplama\n"
                +"3 vektor hespalama\n"
                +"q cikis\n";
       
         
        while(true){
            System.out.println(islemler);
            Scanner scanner =new Scanner(System.in);
            String islem=scanner.nextLine();
           
        if(islem.equals("q"))
        { 
            System.out.println("cikis yapiliyor...");
            Thread.sleep(1000);    
            break;
        }
        
        else if(islem.equals("1")){
            System.out.println("Dairenin Yaricapini Giriniz: ");
            int yaricap=scanner.nextInt();
            scanner.nextLine();
        
            Problemler.Matematik.Daire_alan(yaricap);
        }
        else if(islem.equals("2")){ 
            System.out.println("Ucgen Cevre Hesaplamak icin Kenar Bilgilerini Giriniz: ");
            System.out.println("Kenar1 : "); 
            int kenar1=scanner.nextInt();
            System.out.println("Kenar2 : ");
            int kenar2=scanner.nextInt();
            System.out.println("Kenar3 : ");
            int kenar3=scanner.nextInt();
            scanner.nextLine();
            
            Problemler.Matematik.Ucgen_cevre(kenar1, kenar2, kenar3);
            
        }
        else if(islem.equals("3")){ // vec static olmadigi  icin objesiii olustuup kullanabiliyoruz
            Vec vek1=new Vec("vektor 1 ");
            Vec vek2=new Vec("vektor 2 ");
           
            Problemler.Fizik.vektor(vek1, vek2);       
        }
        else {
            System.out.println("Lutfen Gecerli Bir islem Giriniz");
        }
           
        }
    
    }
}
