
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

//lock u istedigimiz zaman unlocked edyoruz synchronized blogumuzda bunu yapamiyoruz bu yuden daha kullanisli 
public class ReenTrantLock {
    private int say = 0;
    private Lock lock =new ReentrantLock(); //synchronized kod bloklarina alternatif olarak gelistirilmistir daha cok tercih edilir. 
    private Condition condition= lock.newCondition();// abstact metood oldugu icin new ile yapmadik  lock uzerinde herhangi bir islem yapmak icin bu metodu kullnmamiz gerekiyor.
     
    public void artir(){
        for(int i=0 ; i<10000 ; i++){
            say++;  
        }
         
}
   public void thread1Fonksiyonu(){
        
   lock.lock();
       //araya baska thread girmesini engelliyor senkronize metoduna alternatif  wait ve notify metodu ise await ve signal metodlari ile yapilir
        System.out.println("thread 1 calsiyor ");
          System.out.println("thread 1 uyandirilmayi bekliyor ");
           
        try {
           condition.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(ReenTrantLock.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        System.out.println("thread 1 uyandirildi ve islemine devam ediyor.");
        artir();
    
    lock.unlock();
    }
    
    public void thread2Fonksiyonu(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReenTrantLock.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner scanner = new Scanner(System.in);     

        lock.lock();
        System.out.println("thread 2 calisisyor ");
        artir();
        System.out.println("devam etmek şcin bir tusa basin ");
        scanner.nextLine();
        condition.signal(); //thread 2 nin isi bittikten sırna thread 1 e gidip geri kalan kismi tamamlicak .
        System.out.println("thread 1 i yandirdim ben gidiyorum ... ");
        lock.unlock();
    
    }
       public void threadOver()
       {
           System.out.println("say degiskeninin degeri : " +say);
       }
  
}
