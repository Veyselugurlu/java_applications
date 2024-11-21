

import java.util.ArrayList;


public class Main {
    public static void yazdir(ArrayList<String> a){
    for(int i=0 ; i<a.size() ; i++){
        System.out.println("eleman: "+(i+1)+":"+a.get(i));
    }
        
    }
    public static void main(String[] args){
    ArrayList<String>  arraylist= new ArrayList<String>();
    
    arraylist.add("muz");
    arraylist.add("seftali");
    arraylist.add("armut");
    arraylist.add("megadeth");
     /*  
        System.out.println(arraylist.get(0));//0'inci indexteki elemani yazar
        System.out.println(arraylist.get(1));
        System.out.println(arraylist.get(2));
        System.out.println(arraylist.size());//icindeki eleman sayisini veriyot (uzunlugunu)
         
         arraylist.set(3, "meyve");// 3. indexteki elemani gunceller
        for(int i=0;i<arraylist.size();i++){
            System.out.println(arraylist.get(i));
//silmek icin ise  
       // arraylist.remove(1);// bu sekilde ikinci elemani yazdirmadik.
            System.out.println(arraylist.indexOf("muz"));   //bu sekilde mzuun kacinci indexte yer alir gorduk
            
            System.out.println(arraylist.lastIndexOf("muz"));// 3. indexteki muzu yazdirir arrattigimiz degr yoksa -1 verir
    }*/  
            yazdir(arraylist);
        
    }
}
