
import java.util.Scanner;


public class Main {
    public static void main (String[] args){
    
        Scanner scanner=new Scanner(System.in);
        int ebob=1;
       
        System.out.println("birinci sayiyi giriniz: ");
        int sayi1=scanner.nextInt();
       
        System.out.println("ikinci sayiyi giriniz: ");
        int sayi2=scanner.nextInt();
        
        for(int i=1;i<sayi1;i++)
        {
        if(sayi1 %i ==0 && sayi2 %i==0){
        
           ebob=i;
        }
        
        }
        System.out.print("ebob: "+ebob);
    }
    
    
}
