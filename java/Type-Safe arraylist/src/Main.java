
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    
    public static void main(String[] args){
    ArrayList<String> sehirler=new ArrayList<String>();
    sehirler.add("ankara");
    sehirler.add("adana");
    sehirler.add("istanbul");
    sehirler.remove("istanbul");
        Collections.sort(sehirler);//alfabetik siralar
        for(String sehir: sehirler){
            System.out.println(sehir);
        }
        
    }
    
}