
import java.awt.BorderLayout;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    
    /*for(int i=0;i<5;i++)   //sifirdan bese kadar i'yi birer birer artirarak merhaba for yazdirmak
    {
        System.out.println("merhaba for");
    }
    */
   /* int i;
    for(i=0;i<5;i++)
    {
        System.out.println("i: "+i);
    }*/
    
 /*  for(int i=10;i>=0;i--)
   {
       System.out.println("i: "+i);
   }   
   */
 /*int i=0;
   for ( ; i<5; i++ ){System.out.println("merhabalar");}
 
   */
      /*    int i=0;
        int j=10;
        for( ; i<10 && j>0; i++,j--)   //burdaki boslukhem i hem j yerine gecer zaten yukarda tanimladigimiz için 
                                      // tekrar yazmayip bosluk biraksak olur.
      {
            System.out.println("i: "+i);
            System.out.println("j: "+j);
        }
         */
      
   /*   for (int i=1; i<100; i*=2){       //i*2 1'in 2 ile carpilmasi sartini sagliyor
          System.out.println("i: "+i);
      }
     */
   
   //*****faktoriyel hesaplama*****
        System.out.println("bir sayi giriniz: ");
        int sayi=scanner.nextInt();
        int i,faktoriyel=1;
        for(i=1;i<=sayi;i++)    //i ye 0 veremeyiz cunku faktoriyel sonucunu sıfır yapar
        {
        faktoriyel *=i;
            System.out.println("faktoriyel: "+faktoriyel + " i: "+i);  //donguyle beraber fakt ve i nin degerini yazdık.
        }
        System.out.println("sonuc: "+faktoriyel);
    }
}
