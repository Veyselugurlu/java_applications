
public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Sabiha Gokcen Havalimanına Hosgeldiniz...");
        
        String Sartlar= "herhangi bir siyasi yasaginizin bulunmamasi gerekiyor \n"
                +"harc ucretini tam yatirmaniz gerekiyor\n"
                 +"gideceginiz ulkeye vizenizin olmasi gerekiyor";
                
                String message="bu sartlarin hepsini saglamaniz gerekiyor";
    
    while(true){
        System.out.println("*************************");
        System.out.println(message);
        System.out.println("*************************");
        System.out.println(Sartlar);
        
        Yolcu yolcu=new Yolcu();
        System.out.println("harc bilgileri kontrol ediliyor...");
       
        Thread.sleep(3000);
        
        if(yolcu.yurtdisiHarciKontrol()==false){
            
            System.out.println(message);
            
            continue;
        }
        if(yolcu.siyasiYasakKontrol()==false){
            System.out.println(message);
            continue;
        }
        if(yolcu.vizeDurumuKontrol()==false){
            System.out.println(message);
        continue;
        }
        System.out.println("islemleriniz tam yurt disi seyahatinizde iyi yolculuklar dileriz...");
        break;
        
        
        
    }
                
                
    }
}
