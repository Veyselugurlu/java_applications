
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
    



public class Main {
        public static void mapYazdir(Map<Integer,String> map){
        map.put(1, "veysel");
        map.put(2, "ali");
        map.put(3, "mehmet");
        map.put(4, "ferhat");
        map.put(5, "emre");
        
   /*      for(Map.Entry<Integer,String> entry: map.entrySet()){ //hashmapi entryi sete donusturduk.
              
              System.out.println("Key: "+entry.getKey()+" value: "+entry.getValue()); //degerleri ve keyeri bu sekil yadirirdik
          
          }*/ 
          //diger bir yaidrima yontemi ise 
          
       //     System.out.println(map.keySet());// sadece keyleri yazdirir
            System.out.println("**--------------*******");
            for(Integer key : map.keySet()){
                System.out.println("key: "+key+" deger: " +map.get(key));
            }
            
            //sadece degerşeri bastirmak icicn ise su sekiş bi yontem kullanabilriz
            
            Collection<String> deger= map.values();
            for(String d: map.values()){
                System.out.println("Deger: "+d);
            }
    }
    
    public static void main(String[] args){
        
      Map<Integer,String> hashMap=new HashMap<Integer,String>();
      Map<Integer,String> linkedhashMap=new LinkedHashMap<Integer,String>();
      Map<Integer,String> treemap=new TreeMap<Integer,String>();
            mapYazdir(hashMap);
            System.out.println("*****");
            mapYazdir(treemap); //keylerini artan siaraya gore siralar ("keyleri")
            System.out.println("*******");
            mapYazdir(linkedhashMap);//linked kis listey oldugu gibib siralar.
            System.out.println("********");


    }
}

