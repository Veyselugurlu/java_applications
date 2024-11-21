
import java.util.ArrayList;
import java.util.Iterator;


public class Radyo implements Iterable<String> { //strigler uzerinde gezcek onu belirtiyoruz
private ArrayList<String> kanallarListesi=new ArrayList<String>(); //kanalllar burda depolancak

public class RadyoIterator implements Iterator<String>{ 
private int index=0;
        @Override
        public boolean hasNext() {
            if(index<kanallarListesi.size()){
                
                return true;
            }
            else   
                return false;
        }

        @Override
        public String next() {
            String deger=kanallarListesi.get(index);
            index++;
            
            return deger;
        }

}
        public Radyo(String[] kanallar){
        for(String kanal: kanallar){
           kanallarListesi.add(kanal);
        }
        }
    @Override
    public Iterator<String> iterator() {
        
        return new RadyoIterator(); //referans donerr iteratorun
 
}
}