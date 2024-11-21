
//char veri tipi : karakterleri gostermek cin kullanılır.2byte yer kaolar 2^16 tane karekter simgeleneblir.

//boolean veri tipi: kosul durumlarında kullanılır true veya false degeri alir.
public class charveritipi {
    public static void main(String[] args){
    char a='a';
    char b='?';
    char c=2022;
    char d='\u0152';//bunlar coding table dan bakılır.
    char e='\u063c';
    
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(a);
    
    //*****************************//
    
    //boolean da ise true veya false uzerindden gidilir
    boolean x= true;
    boolean y = false;
    
    System.out.println(x);
    System.out.println(y);
    
    }
    
}
