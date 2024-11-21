
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
      
            ExecutorService executor=Executors.newFixedThreadPool(2); //2 li sekilde threadleri almamizi saglar
            
            for (int i=1;i<=5;i++)
            {              
                executor.submit(new Worker(String.valueOf(i), i));
            }
            try 
        {
            executor.shutdown();//kaptmazsak program kapanmicak ve bizden biseyler eklememizi beklicek    
            executor.awaitTermination(1, TimeUnit.DAYS); // egrki islemler i 1 gunu gecerse ondan sorna kapaticak 
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
             System.out.println("Butun isler tamamlandi ...");
    }
    
}
