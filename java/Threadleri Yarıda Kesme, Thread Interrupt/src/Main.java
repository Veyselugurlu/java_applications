
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
public static void main(String[] args){

Thread t = new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("Thread calisiyor ....");
        
        for (int i =1 ; i<=10 ; i++){
        
            System.out.println("Thread Yaziyor : "+i);
            
            try 
            {
                Thread.sleep(1000);
                System.out.println("Uykumun "+ i+". saatindeyim");
                
                if(i==10)  //uykudan uyadigi zaman uyandigini soylesin 
                {
                    System.out.println("Uykumdan uyandim ....");
                }
                
            }
            catch (InterruptedException ex) 
            {     //interrupt yarida kesme                 
                System.out.println("uykum bolundu "+i+". saatte ");      
            }      
        }
    }
});

        t.start(); 
    try 
    {
        Thread.sleep(2000);     //2 saniye uyucak(gecitikten sonra) burda  uykunun 2. saatinde yarida kesicek interrupt metodu ile  .
    }
    catch (InterruptedException ex) 
    {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    
            t.interrupt();    //**  yarida kesme islemi **

}
}