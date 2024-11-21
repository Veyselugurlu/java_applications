
public class KronometreThreading implements Runnable{
    private Thread thread;
    private String threadName;
    public KronometreThreading(String threadName){
    this.threadName=threadName;
        System.out.println("olusturuluyor...");
        
    
    }
    
    
    public void run(){
   
        System.out.println("calistiriliyor..."+threadName);
        try
        {
             for(int i=0;i<=10;i++){
                 System.out.println(threadName+" : "+i);
                 Thread.sleep(1000);
             }
        }
        catch(InterruptedException expection)
        {
            System.out.println("kesildi..."+threadName);
        }
        System.out.println("thread bitti."+threadName);
        
        
    }
    
    public void Start(){
        System.out.println("nesne olusturuluyor... ");
        if(thread==null){
        thread=new Thread(this,threadName);
        thread.start();
        }
        
        
    }
}
