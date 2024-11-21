
public class Main {
    public static void main(String[] args){
    KronometreThreading thread1=new KronometreThreading("thread 1 ");
     KronometreThreading thread2=new KronometreThreading("thread 2 ");
     KronometreThreading thread3=new KronometreThreading("thread 3 ");
     
     thread1.Start();
     thread2.Start();
     thread3.Start();
    }
}
