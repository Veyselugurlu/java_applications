
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
      
    
    //** vucut kitle index hesaplama **
    //kilo/ (boy*boy) *boy metre cinsinden*
    
  Scanner scanner=new Scanner(System.in);
        System.out.print("kilonuzu girin: ");
        int kilo=scanner.nextInt();
        System.out.print("boyunuzu girin:(orn=1,72m) ");
        double boy=scanner.nextDouble();
       
        double vki=kilo/(boy*boy);
        System.out.println("vucut kitle indexiniz: "+vki);
        
    }
 
}
