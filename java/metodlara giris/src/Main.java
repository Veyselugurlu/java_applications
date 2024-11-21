
import java.util.Scanner;


// c deki void fonks. gibi metodlarda hemen hemen ayni 
// mesela faktoriyeli bir çok yerde kullanıcagimiz zaman metodlarda direk yukardan cagirip bir cok kez faktoriyel 
// kodu yazmamizi önler zamandan kar
public class Main {
    public static void selamlama(){
        System.out.println("merhaba hosgeldiniz..");
    }
    public static void faktoriyel()
    {       Scanner scanner = new Scanner(System.in);       
    int faktoriyel=1;
      
    System.out.print("bir sayi giriniz: ");
        int sayi=scanner.nextInt();
      
        while(sayi>0)
        {
        faktoriyel*=sayi;
        sayi--;
        }      
        System.out.println("faktoriyel: "+faktoriyel);
    }
   public static void main(String[] args)
   {
   
   selamlama();
   faktoriyel();
           
   } 
}
