import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class permutasyon
{
    static void permutasyonHesaplama(ArrayList<Integer> SayiDizisi, int ikinciIndex)
    {
        for(int birinciIndex = ikinciIndex; birinciIndex < SayiDizisi.size(); birinciIndex++)
        {
            //swap fonksiyonu listedeki belirtilen elemanlarin yerini degistiriir.
            java.util.Collections.swap(SayiDizisi, birinciIndex, ikinciIndex);
            //Burada ikinci indexi 1 arttirarak ve fonksiyonu uygulayarak yine degistirme islemi
            //gerceklestiriyoruz ve ayrica 1 arttirdigimizdaki olusacak degisimleride yazdiriyouz
            permutasyonHesaplama(SayiDizisi, ikinciIndex+1);
            java.util.Collections.swap(SayiDizisi, ikinciIndex, birinciIndex);
        }
        if (ikinciIndex == SayiDizisi.size() -1)
        {
            //Burada ikinci index sayi dizimizin son indeksine esit oldugunda dizi elemanlari yazdiriyor.
            //Buradaki Arrays.toString fonksiyonu diziye ait elemanları toplu bir şekilde string olarak geri döndürür.
            System.out.println(java.util.Arrays.toString(SayiDizisi.toArray()));
        }   
    }
    
}


public class Soru1 extends permutasyon{
    
    //Burada assagida kullanacagim ozelliklerimi belirttim.
    public static ArrayList<Integer> Dizi = new ArrayList<Integer>();
    public static Scanner input = new Scanner(System.in);
    public static boolean devam = true;
    public static Soru1 menu = new Soru1();
    
    public static void main(String[] args) throws InterruptedException {
        
        
        while(devam)
        {
            //Kullanicidan sayi listemizin dizimizin boyutunu istiyoruz.
            System.out.print("Permutasyonunu Hesaplayacaginiz Dizinin Boyutunu Giriniz= ");
            int boyut = input.nextInt();

            int [] elements = new int [boyut];
            //Dizinin boyutu 1'den buyuk olmali ki siralama islemi gerceklestirilsin.
            if(boyut > 1)
            {
                //Kullanicidan dizinin elemanlarini aliyoruz.
                for(int i=0;i<boyut;i++)
                {
                    System.out.print((i+1) + ".Sayiyi Giriniz= ");
                    elements[i] = input.nextInt();
                }

                //Girilen Sayi dizisini yazdirma islemi.
                System.out.println("Girilen Sayi Dizisi :");
                for(int i=0;i<boyut;i++)
                {
                    System.out.print(elements[i] + " ");
                }

                System.out.println("\nDizinin Permutasyonlari Hesaplaniyor...");
                Thread.sleep(1000);
                
                //Dizinin elemanlarini Array List'e aktariyorum.
                for(int i=0;i<boyut;i++)
                {
                    Dizi.add(elements[i]);
                }

                permutasyon.permutasyonHesaplama(Dizi, 0);
                break;
          
            }
            else
            {
                
                {
                    System.out.println("dizi boyutu 1 den buyuk olamlidir");
                }

            }
        }
        
    }


 

}