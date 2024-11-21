
public class Main {
    public static int ikiilecarp(int a){
    return a*2;         // return geri döndüren fonksiyondur voidde kullanılmaz cunku void
                       //geri dondurulmeyen fonksiyondur *int* fonksiyonunda kulllanılabilir
    }
    public static int ikiiletopla(int a)
    {
    return a+2;
    }
    public static int dortilecarp(int a){
    return a*4; 
    }        
    public static int cikti(int a,int b,int c){
   //System.out.println( +(a+b+c)); //voiddeyken sout fonksiyonuyla aşşadan soutun icine almıyor
        
    return (a+b+c); 
    }
    public static void main(String[] args){
   
        System.out.println("sonuc: "+dortilecarp(ikiiletopla(ikiilecarp(4)))); //voidde cıktı olarak alip geri donduremeyiz
        System.out.println("cikti: "+cikti(1,2,3));
    }
}
