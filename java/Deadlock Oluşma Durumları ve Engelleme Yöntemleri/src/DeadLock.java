
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


// deadLlock tikanma ihtimaline karsi engelleme yontemi gorcez simdi


public class DeadLock {
    
    private Hesap hesap1 = new Hesap();
    private Hesap hesap2 = new Hesap();
    private Random random = new Random();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2= new ReentrantLock();
    
        public void locklariKontrolEt(Lock a,Lock b){
        boolean a_elde_edildi=false;
        boolean b_elde_edildi=false;
        
         while(true){ //bu sonsuz donguden sadece ikiside true oldugu zamn cikicakk ve degerimizi elde edicez 
            a_elde_edildi= a.tryLock();
            b_elde_edildi = b.tryLock();
                if(a_elde_edildi==true && b_elde_edildi == true){  //true olana kadar dongu devam edicek ve tikanmanin onune gecicek 
                return;
                }
                if(a_elde_edildi==true){

                a.unlock();
                }
                if(b_elde_edildi == true ){
                b.unlock();
                }
              } 
    }
    public void thread1Fonksiyonu(){
        locklariKontrolEt(lock1, lock2);
            for(int i=0;i<5000;i++){
            Hesap.paraTranferi(hesap1, hesap2, random.nextInt(100)); //para transferi 
            }
            lock1.unlock();
            lock2.unlock();
            } 
    
    public void thread2Fonksiyonu(){
        locklariKontrolEt(lock2, lock1); // her seferinde olmasada DeadLock olucaktı biz bunu engellemek icin boyle bir yontem
                                         //kullnadik tikanma olmaz suan ama eger ki lock2.lock() "\n" ve mlock1.lock kullnasaydik olurdu  
            for(int i=0 ; i < 5000 ; i++){
            Hesap.paraTranferi(hesap2, hesap1, random.nextInt(100)); 

            }
            lock2.unlock();
            lock1.unlock();
        
    }    
     public void threadOver(){
         
            System.out.println(" Hesap 1 Bakiye : " +hesap1.getBakiye()+" Hesap 2 Bakiye: " +hesap2.getBakiye());
            System.out.println(" Toplam Bakiye :  "+(hesap1.getBakiye()+hesap2.getBakiye()));
    }
}
