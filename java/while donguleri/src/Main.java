
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    
    // while'ın for dongulerinden farkı kosul dogru oldugu surece calisir
    
  /*  int i=5;
 
    while(i<100){
    
        System.out.println("i: "+i);
        i+=3; // besten ucer artarak 98 e kadar her defasinda i yi yazar
    }
    */
  //******faktoriyel*****
  Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz: ");
        int sayi=scanner.nextInt();
        
        int faktoriyel=1;
        
        while(sayi>0)
        {
        faktoriyel*=sayi;   // faktoriyelin alindigi asıl kisim
        sayi--;             //eger burayi yazmayi unutsaydik sonsuz donguye girerdi veya sayi ++ yapsaydik orn cözcem aşşagida
        }
        System.out.println("faktoriyel sonucu: "+faktoriyel);
    
       /* int i=0;
        while(i<10)
        {
            System.out.println("i: "+i);
            i--; // -- veya hiç birsey yazmasaydik sonsuz donguye girerdi. 
        
        }*/
    }
}
