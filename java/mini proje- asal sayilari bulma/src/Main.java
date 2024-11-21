
public class Main {
    // 1'den 2000'e kadar olan sayilardan asal olanı bulma
    public static boolean asalmi(int sayi){
    for(int i=2 ;i<sayi;i++){
    if (sayi%i==0){
        return false;
    
    }
    
    }
    return true;
    }
    public static void main(String[] args){
    
    for (int i=2;i<2000;i++)
    {
    if(asalmi(i)){
        System.out.println(i);
    }
    }
    
    
    }
}
