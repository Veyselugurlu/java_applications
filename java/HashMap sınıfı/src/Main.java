
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args){
       
        HashMap<Integer,String> hashMap =new HashMap<Integer,String>(); 
    
        hashMap.put(10, "Veysel");
        hashMap.put(20, "Alex");
        hashMap.put(30, "Messi");
        hashMap.put(10, "Lugano");
    
        System.out.println(hashMap);
        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(8));
        System.out.println();
        
        for(Map.Entry<Integer,String> entry :hashMap.entrySet()){   //get key ve get valure degerlerine ulasmak icin  hashmapi entry sete donusturduk.
            System.out.println("Anahtar: "+ entry.getKey()+"  Deger:--> "+entry.getValue());
        }
        
    }
}
