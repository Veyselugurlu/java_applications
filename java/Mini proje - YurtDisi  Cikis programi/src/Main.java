
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
            try
            {
            yolcu.yurtdisiHarciKontrol();
            }
            catch(HarcException e)
            {e.printStackTrace();
            
            continue;}
            
            System.out.println("siyadsi yasak kontrol diliyor");
            Thread.sleep(1000);
              try{ 
              yolcu.siyasiYasakKontrol();
              }
              catch(SiyasiException e){
            e.printStackTrace();
            continue;
       }
              System.out.println("vize islemlerşniz komtrol ediliyor");
              Thread.sleep(2000);
              try{
              yolcu.vizeDurumuKontrol();
              }catch(VizeException e){
              e.printStackTrace();
               continue;
              }
             
        
        System.out.println("islemleriniz tam yurt disi seyahatinizde iyi yolculuklar dileriz...");
        break;
        
        
        
}
                
                
    }
}
