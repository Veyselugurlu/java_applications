
import java.util.HashMap;


public class Main {
    public static void main(String[] args){
    
    HashMap<String,String> sozluk=new HashMap<String,String>();
    
    sozluk.put("desk","sira" );
    sozluk.put("boss", "patron");
    sozluk.put("table","masa" );
        System.out.println(sozluk.size());
    
    
    for(String item: sozluk.keySet()){//listeler elemanlari
        System.out.println("eleman -"+item+" = deger- "+sozluk.get(item));
    
    }
    sozluk.clear();
        System.out.println(sozluk.get("table"));
    }
}
