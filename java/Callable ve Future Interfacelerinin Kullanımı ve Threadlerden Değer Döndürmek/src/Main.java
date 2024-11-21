
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
    
        ExecutorService executor = Executors.newFixedThreadPool(1); //1 thread olusturcagimiz icic icine bir yazdik
        /*  executor.submit(new Runnable() {
            @Override
            public void run() {  //run metodunu donduremiyru sebebi ise void fonksiyonu olması bunun icin collable metodunu kullnaicaz
                Random random =new Random();
                
                System.out.println("Thread Calisiyor...");
                
                int sure=random.nextInt(1000)+1000;   //1 -2 saniyearalıgında beklicek
                
                try 
                {
                    Thread.sleep(sure);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Thread Cikiyor ");
                
            }
        });  
      */
       
       //burda future interfaceini future<?> seklinde kullanirsak collable interface'inin icine ne atarsak onu alicak(int string degreleri vs...) 
        Future<?> future = executor.submit(new Callable<Integer>() { //generic metod inteface'imiz future 
            @Override
            public Integer call() throws Exception { //run metodundan farkli olarak burda bir tane exception firlaticamizi belirtmemiz gerekiyor
                Random random = new Random();
                
                System.out.println("Thread Calisiyor...");
                
                int sure=random.nextInt(1000)+1000;   //1 -2 saniyearalıgında beklicek
                if (sure>1500)
                {
                    //eger burda islem uzun surerse ıoexcepiton exceptiona donsuturluyor ve hata olara assada   execution excepitona gelir 
                throw new IOException("Thread islemleriniz cok uzun surdu... ");    
                      
                }
                
                try 
                {
                    Thread.sleep(sure);
                    
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.println("Thread Cikiyor ");
                return sure;   //boyle yapinca sureyi alamyşz ve hata verir bunun icin future kullnmamiz gerek 
                
            }
            });
      
             executor.shutdown(); //kapama islemiyapmasazsak sonuza kadar deger bekler bizden program kapanmaz.
                try 
                {
                    System.out.println("donen deger : "+future.get()); //donen degeri future den alir
                } catch (InterruptedException ex) 
                {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex)
                {  //future de bir sikinti oldugu zaman firlatilcak excepitonumuz 
                    System.out.println(ex); //hatayi buraya yazidirilicak 1500 mili saniyeden uzun surerse 
                } 
        //yani biz bir sure dondurduk dondurdugumuz degeri future ye atadik ondan sonra da future.get() metodu ile aldık ve yazidrdik.
    } 
}
