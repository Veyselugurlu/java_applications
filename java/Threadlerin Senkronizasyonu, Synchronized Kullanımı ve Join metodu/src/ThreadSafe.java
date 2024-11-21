
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadSafe {
    private int count=0;

    
 public synchronized void arttir(){
 count++;
 }
    
    public void threadleriCalistir(){
    Thread thread1 =new Thread(new Runnable() { //anonim thread olusturduk 
        @Override 
        public void run() {
            for (int i=0;i<4000;i++){
            //count++; yerine atrrir metodunu kulllanairiz senkroinze old icin    
            arttir();
            }
        }
    });
    Thread thread2 =new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i =0;i<4000;i++){
         //   count++;  
            arttir();
            }
         }
    });
    
    thread1.start(); 
    thread2.start();
   
         try {
            thread1.join();
             thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadSafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("count degeri: "+count);//bu da ayri bir thread suanda join kullanmadgimiz icin 0 degerini elde edicegiz
        // main thread tte ayni anda calisiyor  join metodu ile bekleditiyoru main threadini bekletiyor threadler bittikten sorna devame diyor sorna calistiriyor
    //join kullaniriz ancak ilk calsitirdigimzida 8000 degerini elde edemeyiz bunun sebebi senkronize olmamaasi tjrad 1 calsiirken thread 2 nin de calismasi
    //synchronized  metodu kullnarak halledebilirz  
   
    }
    
    public static void main(String[] args){
        ThreadSafe calistir = new ThreadSafe(); 
         calistir.threadleriCalistir();
    }
}
