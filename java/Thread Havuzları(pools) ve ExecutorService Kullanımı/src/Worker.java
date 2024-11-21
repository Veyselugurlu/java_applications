
import java.util.logging.Level;
import java.util.logging.Logger;


public class Worker implements Runnable{
    private String isim;
    private int id;

    public Worker(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println(isim+ " isimli ve "+id+" li calisan isine basliyor... ");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println(isim+ " isimli ve "+id+" li calisan isini bitirdi..... ");
    }
    
    
}
