
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WaitNotify {
    private Object lock=new Object();
    public void thread1Fonksiyonu(){
        synchronized (lock) { //n sebebi (this kullanmamizin)  lock u bu obje uzerinde yapicaz
            //nacak this obje ueinde bir anahtara sihpiz ama baksa metodlarla veya fomksiyonlarda synchronized var oldugu zaman bloklancak  
            //bunun icin lock olusturursak bisey olmaz 
            
        
                System.out.println("thread 1 calisiyor....");

                System.out.println("therad 1 thread 2'nin kendisini uyandirmasini bekliyor... ");
        
            try 
            {
                lock.wait(); //lock kullandigimiz zaman direkt wait degilde lock.wait metodunu kullnairiz 
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
                System.out.println("thread 1 uyandirildi. Devam ediyor...  "); //notify komututnu kelmezsek sonusza kadar bekler bizim eklememizi o yuzden notify eklemek lazim 

    
    }
    }
    
    public void thread2Fonkisyonu(){
        Scanner scanner =new Scanner(System.in);
            try 
            {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized (lock) 
            {
                System.out.println("devam etmek icin bir tusa basin: ");
                scanner.nextLine();
                
                lock.notify();  //egerki buraayş yorum satirina alitsak sonsuuza kadar beklicek
                System.out.println("thread 2 thread 1'i uyandirdi thread 1 devam ediyor ama 2 saniye bekle");
                
                try {
                Thread.sleep(2000);
                }   
                catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
                }   
        
                }
             }
}
