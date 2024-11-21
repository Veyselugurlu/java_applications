
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
import javax.lang.model.util.Elements;

//vekrtorleri thread işlemlerinde arraylist yerine kullaniriz daha cok tecih edilir
//stackler lıfo mantigiyla calisir (son giren ilk cikar)
public class Main {
    public static void main(String[] args){
              Vector<String> vector=new Vector<String>(); //vektor dizi olusturma
 
        vector.add("Ankara");
        vector.add("Istanbul");
        vector.add("Bursa");
/*
    
        
        for(String v: vector){
        
            System.out.println(v);
        }
        System.out.println("----------");
        System.out.println("ilk element"+vector.firstElement());
       System.out.println(vector.lastElement());//son elemntin gosterim sekli 
       */
        ListIterator<String> iterator= vector.listIterator();//new kullnammamizin sebebi list iteratorun degil vektorun lemanlarını listeleyecegimiz icin
  //     while(iterator.hasNext()){ //bi sonrakiş elemani varsa 
//
  //          System.out.println(iterator.next());
    
   //}
    /*    System.out.println("   enumaration ile yazimi");
        Enumeration<String> enumaretion=vector.elements();
        while(enumaretion.hasMoreElements()){
            System.out.println(enumaretion.nextElement());
        }
        System.out.println("ilk eleman "+vector.firstElement()); //ilk elemanin yazimi
        
  */
        System.out.println("**stackler**");
        Stack<String> stack=new Stack<String>();
        System.out.println("stack bos mu dolum u kontrolu yapılaması stack.empty()");
        System.out.println(stack.empty());  //stack dolu mu bos mu kontrol yapilir
        stack.push("erzurum");      //stackte eleman ekleme
        stack.push("sivas");
        stack.push("siirt");
        
     //   for(String s: stack){
       //      System.out.println(s);
 //}
        System.out.println("enumaretion ile stack yazimi");
        Enumeration<String> enumeration=stack.elements(); //stackin elelmnetlerninin yazimi
   
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        
        System.out.println("stackin son eleman gosterini peek ile yapilir ");
       System.out.println( stack.peek());
        System.out.println("stack ten son eleman cikarilmasi");
        System.out.println(stack.pop());
        System.out.println("kalan elmanlarin yazimi");
          for(String s: stack){
           System.out.println(s);}
   
        System.out.println("stackteki elemanlarin kaldirilmasi");
        while(!stack.empty()){
            System.out.println("eleman cikariliyor " +stack.pop()); //kalan iki elmani da cikardık 
        }
        System.out.println("simdide iki lemanda silindikten sonra bos mu dolu mu diye konstrol edelim ve bize true veya false deger dondursun");
        System.out.println(stack.empty());
    }    
    
    
}
