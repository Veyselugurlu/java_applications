
public class Main {
    public static void toplama(int a,int b,int c){
    
        System.out.println("toplam: "+(a+b+c));
    
    }
    public static void toplama(int a,int b){
        System.out.println("toplam: "+(a+b));
    }
    public static void toplama(String isim ,int a){
        System.out.println(isim+ " adli oyuncunun "+a+ " puani var");
    
    }
    public static void toplama(int a){
        System.out.println( "isimsiz adli oyuncunun "+a+ " puani var");
    
    }
    public static void toplama(String isim){
        System.out.println(isim+" adli oyuncunun hic puani yok..");
    
    }
    public static void main(String[] args){
    
    toplama(1,2,3);
    toplama(1,2);
    toplama("murat",10);
    toplama(200);
    toplama("mustafa");
    }
}
