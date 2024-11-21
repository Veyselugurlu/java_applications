
import java.util.PriorityQueue;
import java.util.Queue;
//clear() : metodu kuyrugu temizler 
//size() : kuyrugun basindaki elmani doner.
//contains() : metodu kuyrugun icinde istenen eleman bulunurmu ona bakar varsa ture deger dondurur yoksa false

class Player implements Comparable<Player>{ //tümel sıralama (total ordering) yapar. 
    
private String isim;
private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public int compareTo(Player player) { //boylece buyukten kucuge dogr yazdirdik
        if(this.id > player.id){
        return -1;
        }
        else if(this.id<player.id){
        return 1;
        
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Player{" + "isim=" + isim + ", id=" + id + '}';
    }

}

public class Main {
    public static void main(String[] args){
    
       //priorityqueue de sıralama yazilirken oncelik olan sıra alir yani 1,4,2,3 arasında en kucukten buyuge gore sıraa olmasi gereken gibi siralanir
       //yani 1,2,3,4 diye sira alir... ancak for dongusu ile yazdigimiz zaman sira ile yazamaz!!!!!! ancak poll yaparken onvcelik sirasina gore 
       //elemalari cikarir.
       Queue<Player> queue =new PriorityQueue<Player>();
       queue.offer(new Player("VEYSEL", 2));
       queue.offer(new Player("okan", 3));
       queue.offer(new Player("mehmet", 7));
       
       
    /*   Queue<Integer> queue=new PriorityQueue<Integer>(); calsımız acytgmi z icin olayere ozgu bir obje olusrurcazo nda bloka aldik
        queue.offer(1);
        queue.offer(4);
        queue.offer(2);
        queue.offer(300);
        */ 
     //   System.out.println(queue.peek()); //ilk elemani alir yoksa null deger dondurur.
    //    System.out.println("ilk cikarilan elman : "+queue.poll());
      //  System.out.println("********************");
   /*     for(Integer q: queue){      //for iile yazdirdigimiz zaman sira ile yazmiyor. buun yerine while dongusu kullaniriz.
            System.out.println("eleman cikariliyor: "+q);
        }
    
   while(!queue.isEmpty()){     //sira ile cikarilir elamanlar
       System.out.println("eleman cikariliyor: "+ queue.poll());
   
   }
   
     */
   while(!queue.isEmpty()){     //sira ile cikarilir elamanlar
       System.out.println("eleman cikariliyor: "+ queue.poll());
   
   }
   
    }
}
