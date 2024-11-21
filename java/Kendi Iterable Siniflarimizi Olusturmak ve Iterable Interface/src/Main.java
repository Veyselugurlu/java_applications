
import java.util.Iterator;


public class Main {
    public static void main(String[] args){
        
        String[] kanallar={"Radyo Viva","Kanal 7","Atv","Radyo Hacettepe","Show TV"};
       
        Radyo radyo=new Radyo(kanallar);
        
     /*   for(String s: radyo){  //farki sekilde while ile de yaazdiriliabilir
            System.out.println(s);
       
        }*/
        Iterator<String> iterator=radyo.iterator();
     
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
                }
}
