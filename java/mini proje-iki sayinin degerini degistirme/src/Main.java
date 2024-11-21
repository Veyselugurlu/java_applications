
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    int s1;
    int s2;
    System.out.print("birinci sayi: ");
    s1=scanner.nextInt();
   
    System.out.print("ikinci sayi: ");
    s2=scanner.nextInt();
        System.out.println("degistirilmeden once...");
    System.out.println("birinci sayi: "+s1+"\nikinci sayi: "+s2);
    
    int gecici=s1;
    s1=s2;
    s2=gecici;
        System.out.println("degistirildikten sonra:");
     System.out.println("birinci sayi: "+s1+
             "\nikinci sayi: "+s2);
    }
}
