
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    
   /* int i=0;
    while(i<20)
    
    {
    if(i==10)   //i = 10'a kadar gidicek sonra break kullanidimiz icin durucak.*dongu icinde dongu
    {  break;  }
        System.out.println("i: "+i);
        i++;
    }
    */
   
   
   // islemi buraya alirsak sonsuz dongu olur cunku her defasında İLK GİRDİGİMİZ SAYİDAN DEVAAM EDER.
   /*
   while(true){
       
       int islem=scanner.nextInt();         //islemi while in içine yazmamizin sebebi donguden ciktiktan sonra tekrar
                                            //islem icin sayi almasini saglamak
      
       if(islem==-1)
   {
       System.out.println("donguden cikiliyor..");
       break;
       
   }
        System.out.println("islem: "+islem);
     
   } */
 
   /* for (int i=0; i<10; i++)      //i++ islemimiz olmazsaydi 2 de sabt kalip sonsuz donguye girerdi
   {
   if(i==2 ||i==5 || i==7)
   { continue;     }  // dongunun basina geri dondurur geri kalan islemleri yapmadan
       System.out.println("i: "+i);
   }
   */
            int i=0;
            while(i<10) 
            {
            if(i==3 || i==5)
            {  
                i++;            // bunu kullanmazsak 0 da kalıp sonsuz donguye girerdi
                continue;    
            
            }
                System.out.println("i: "+i);
                i++;
            }
  
    }
}
