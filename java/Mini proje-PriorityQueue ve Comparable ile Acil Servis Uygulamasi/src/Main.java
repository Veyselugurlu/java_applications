
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    public static void main(String[] args){
    int i=1;
  Queue<Hasta> acil =new PriorityQueue<Hasta>();
    acil.offer(new Hasta("veysel","Goz"));
    acil.offer(new Hasta("veyso","agri"));
    acil.offer(new Hasta("Namik","Yanik"));
    acil.offer(new Hasta("Fazil","Apandisit"));
    acil.offer(new Hasta("Husnu","Apandisit"));
    acil.offer(new Hasta("Yeliz","Yanik"));
    acil.offer(new Hasta("Ayse","Yanik"));
    while(!acil.isEmpty()){
        System.out.println(i+". sirada");
        System.out.println(acil.poll());//sıradaki hastayi alicak(i. elmani yani)
        System.out.println("*****************");
        i++;
        
         if(acil.isEmpty()){
            System.out.println("Butun Hastalar Oncelik Sirasina Gore Siralandi...");
           break;
        }
    }
   
    }
}
