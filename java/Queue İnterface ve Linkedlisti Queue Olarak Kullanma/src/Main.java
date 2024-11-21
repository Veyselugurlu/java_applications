
import java.util.LinkedList;
import java.util.Queue;
//offer : elemani kuyryga ekler eklerse true doner ekleyemzse falzse dondurur.
//add : Eleman ekler.Ekleyemezzse hata firlatir
//poll() : Kuyrugun en basindaki elamani kuyruktan cikarir .Kuyruk bossa null referans yollar.
//remove() : Kuyrugun en basindaki elmani siler .Kuyruk bossa hata firlatir.
//peek() : Kuyrugun en basindaki elmani doner .kuyruk bossa null referans dondurur. 
//element():  Kuyrugun en basindaki elmani doner .Kuyruk bossa hata firlatir
//Queue : inteface ini implemens eden linked list clasi calisir (fifo)
//queue de fıfo matigi vardr ilk giren ilk cikar (first in firs out)

public class Main {
    public static void main(String[] args)
    {
        Queue<String> queue=new LinkedList<String>();
        
        
        
        queue.offer("Java"); //offer kuyruk yapisinaaelamn ekler ekleyemezse null deger dondurur
        queue.offer("Pyhton");
        queue.offer("Flutter");
        queue.offer("Dart");
        queue.offer("Kotlin");
        System.out.println(queue.peek());//ilk elelmani doner
        
        System.out.println("---------start---------");
        
        for (String q: queue){
            System.out.println(q);
        }
        System.out.println("eleman cikarma cikarilan elaman :");
        System.out.println("eleman cikariliyor... "+queue.poll());
        
         for (String q: queue){
            System.out.println(q);
        }
            System.out.println(queue.isEmpty());
            System.out.println("*******");
                 while(!queue.isEmpty()){ //kuyruk bos degilse eleeman cikar
             
                         System.out.println("elaman cikariliyor ..." +queue.poll());
        
                    }
         
         
         
    }}
