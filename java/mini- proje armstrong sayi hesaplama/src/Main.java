
import java.util.Scanner;
// armstrong sayi-->basamak degeri^^basamak sayisi = sayının degerineyse olur

public class Main {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        System.out.println("sayi girin: ");
        int sayi=scanner.nextInt(); 
        
        System.out.println("basamak sayisi: ");
        int bsayisi=scanner.nextInt();
       
        int gecici=sayi
                ;
        int toplam =0;
        
        do{
        int bdegeri=gecici%10;
      
        gecici/=10;
       
        toplam+=Math.pow(bdegeri, bsayisi);


        }while(gecici>0);
        
        if(sayi==toplam) { System.out.println("sayi armstrong bir sayidir.."); }
            else
         {
         System.out.println("armstrong bir sayi degildir: ");
         }
    }
}
