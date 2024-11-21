
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SemaphoreOrnegi {
    
    private Semaphore sem = new Semaphore(3); //semphore olusturma
    public void threadFonkisyonu(int id)
    {
        
        try 
            {
                sem.acquire(); //acqurie metodu bakar 0(threadi alır aynı anda calistirir) olana kadar aldigi threadleri aynı anda calistirir 
            }
            catch (InterruptedException ex) 
            {
                Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println("Thraad Casliyor : "+ id);
        try 
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException ex) 
            {
                Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        System.out.println("Thread cikiyor : "+id); 
        
        sem.release(); //cikan threadlerden sorna aynı anda aldıgı 3 elemanı bırakır sayiyi artirarak kalan elmanlari alir sayi diyelim 
                                                //ki 8 ise yine uc tane alir kalan iki yi bir sornai asamada alir 
        
    
    }
    
}
