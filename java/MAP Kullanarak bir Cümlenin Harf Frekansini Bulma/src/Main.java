
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);
    System.out.println("Cumle Girin: ");
    String Text=scanner.nextLine();
   
    Map<Character,Integer> frekans=new TreeMap<Character,Integer>(); //treemap bir set olusturuyoruz sıralama islemi icin alfabetik tabi strinng old icin
    
        for(int i=0 ; i<Text.length() ; i++){    //cumlenein uzunluguna kadar dondurur
            char c=Text.charAt(i);               //cumlemizdeki i olan karektreri alir 

            if(frekans.containsKey(c)){          //eger ki karekter yine ayni karektere sahipse frekansi bir arttitir ve devam ettirir
            frekans.replace(c, frekans.get(c)+1);    
            }
            else{ //degilse ciktiya atar.
            frekans.put(c, 1); 

            }

   }
   
     for(Map.Entry<Character,Integer> entry: frekans.entrySet()) //yazdirma islemi degerleri ve anahtarlari alma islemi 
       {
           System.out.println("Karekter: " +entry.getKey()+" " +entry.getValue()+"kadar harf bulunuyor" );
       }}
}
