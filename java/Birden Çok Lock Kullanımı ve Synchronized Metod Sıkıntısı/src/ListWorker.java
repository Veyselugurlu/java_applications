
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListWorker {
    ArrayList<Integer> list1=new ArrayList<Integer>();
    ArrayList<Integer> list2=new ArrayList<Integer>();
    
   private Object lock1=new Object();  //1. key thread 1 de kullanilcak isi birince thread ikiye girmden ikiy-cak bu sureyi yariya dusutrucek 
   private Object lock2=new Object();  // 2. key thread ikiye gidicek 
    Random random=new Random(); //rastgele deger atmak icin kullnadik 
    
   public void list1DegerEkle(){
       synchronized (lock1) { //iki lock kullnaidk bunlari senkrınize ettik key 1 buraya gelcek siis bitincecikicak 
           try {
               Thread.sleep(1);
           } catch (InterruptedException ex) {
               Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
                  
           }
           list1.add(random.nextInt(100));
           
       }
   }
   public void list2DegerEkle(){
       synchronized (lock2) { //bu blogu kullnarak sureyi yariya indirmeyi sagladik bu blok bize iki anahtarin a kullanmamşzş sagladi  key 2 buraya gelcek 
         //  thread 1 de direk key 1 i kullnadik isi bitince thread ikiye gitmedi (lkey1) thread 2 ye thread 1 bitince tkey 2 gitti 
         
         
           try 
           {
               Thread.sleep(1);
           } catch (InterruptedException ex) 
           {
               Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
           }
            list2.add(random.nextInt(100)); //ekleyecegimiz degerler sirayla degil random (karisik yani) 0 ile 10 arasinda deger atancak
       }
  
   }
   public void degerAta()
   {  
   
   for(int i=0 ; i<1000 ; i++){
       
       list1DegerEkle();
       list2DegerEkle();
 
   }
   }
   public void calistir(){
  
   Thread thread1 = new Thread(new Runnable() 
   {
       @Override
       public void run(){
           degerAta();
       }
   });
   
      Thread thread2 =new Thread(new Runnable() 
      {
       @Override
       public void run()
       {
           degerAta();
       }
   });
      
      long baslangic= System.currentTimeMillis();
      thread1.start();
      thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
       System.out.println("list1 size: "+list1.size()+"list2 size: " +list2.size());
      
      long bitis=System.currentTimeMillis();
      
       System.out.print("gecen sure : "+ (bitis-baslangic));
   }
   
   
   
}
