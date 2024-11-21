
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


class ProducerConsumer {
    
    
    Random random = new Random();
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);   //10 indexten oluscak kuruk diizis
    
    public void produce()
    {
        while(true){
        
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
       try {   
            Integer value=random.nextInt(100); //0ile 100 arasinda dgeerler alincak 
            queue.put(value); //alinan degerleri kuyruga  bloga koycak 
            System.out.println("producer uretiyor ..."+value); //uretilenlerin yazimi 
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        }   } 
        public void consume(){      //  produce 0 oldukan sonra degere eklemesini bekler 
        while(true){
            try {
           
                Thread.sleep(2000);
           
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
          
          try {
                Integer value=queue.take();
                System.out.println("consume aliniyor "+value);
                
                System.out.println("boyutu "+queue.size());
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    
    
}
