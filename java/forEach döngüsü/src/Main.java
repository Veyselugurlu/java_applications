
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args){
    
    String[] array={"elma","armut","kiraz","seftali"};
    
    /*
    for(int i=0; i<array.length ;i++){
    
        System.out.println(array[i]);
    }
    */ //arrayin kisa halini assagida yapicaz...
    
    for(String a : array){   
        System.out.println(a);
    }
  
    int[] dizi={1,3,5,7,9}; 
    for(int b : dizi){
        System.out.println(+b);
    }
    
    
    Deneme[] dizi3={new Deneme("veysel"),new Deneme("ugurlu")}; 
    
        for(Deneme d: dizi3){   // alttaki satir yerine sout'ın icin d yazsakta olurdu.
    d.yaz();
    }
    
    }
}
