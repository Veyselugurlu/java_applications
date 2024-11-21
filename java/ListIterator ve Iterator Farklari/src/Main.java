
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class Main {
  /*
   * ListIterator 
   * Sadece listınterface i implemente eden calsslarda kullnailir
   * hasnext ve previous() metodu vardir 
   * add metodu bulunur
    
   * Iterator
   * Set , Queue ve list Interface i implemente eden classlarda kullnailir
   * previous() metodu yoktur
   */
    public static void main(String[] args){
        Set<String> set=new HashSet<String>();
        List<String> list=new ArrayList<String>();
           list.add("Go");
        list.add("Java");
        list.add("Pyhton");
        list.add("Dart");
        list.add("Flutter");
        
        ListIterator<String> iterator=list.listIterator(); //olusturduk ancak oncesinde lisytin olusmasi gerekiyor
      /*  
        System.out.println("************");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        } System.out.println("************");
          while(iterator.hasPrevious()){ //buda listeyi tersten bastirma
            System.out.println(iterator.previous());
        } System.out.println("************");
      */
        while(iterator.hasNext()){
            String value=iterator.next();
            if(value.equals("Go")){
                iterator.remove();
            }
          
   
       
        }
        System.out.println("iiiii"); //silme islemi
          for(String i: list){
         System.out.println(i);
     }
        
     /*  set.add("Go");
        set.add("Java");
        set.add("Pyhton");
        set.add("Dart");
        set.add("Flutter");
        System.out.println("************");
        list.add("Go");
        list.add("Java");
        list.add("Pyhton");
        list.add("Dart");
        list.add("Flutter"); */ 
        
     /*   for(String s: set){
            System.out.println(s);
        }      System.out.println("************");
          for(String s: list){
            System.out.println(s);
        }*/
     
   /* Iterator<String> iterator1=set.iterator(); //obje olusturmadiigmz icin new kullnamadik setin iteratorunu kullnicagiz
     Iterator<String> iterator2 =list.iterator();
      System.out.println("-----------");
      while(iterator1.hasNext()){
          System.out.println(iterator1.next());
      
      }
        System.out.println("-----------");
        while(iterator2.hasNext()){ //iterator i kopyalayıp yapistirsak tekrardan yazdrimak icin yazmaz cunku iterator bulunan listnin en sonunda zaten
            System.out.println(iterator2.next()); 
        }
         System.out.println("-----------");
         while(iterator2.hasNext()){ //iterator i kopyalayıp yapistirsak tekrardan yazdrimak icin yazmaz cunku bulunan listnin en sonunda zaten
            System.out.println(iterator2.next());   //(denedik olmadi)
        }
        */ 
         //listiterator
         
         
    }
    }
