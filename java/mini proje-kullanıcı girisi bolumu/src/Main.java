
import java.util.Scanner;


// kullanici girisi bolumu 3 giris hakkimiz olsun.

public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        int giris_hakki = 3;
        System.out.println("****************************");
        System.out.println("kullanici girisi bolumune hosgeldiniz...");
        System.out.println("****************************");
        
        String kullanici_adi="veysel ugurlu";
        String parola="12345";
        
        while(true)
        {
            System.out.println("kullanici adinizi giriniz: ");
            String kadi=scanner.nextLine();
            
            System.out.println("parola: ");
            String parol=scanner.nextLine();
            
            if(kadi.equals(kullanici_adi) && parol.equals(parola))
            {
                System.out.println("hosgeldiniz");
                break;
            }
            else if(kadi.equals(kullanici_adi) && !parol.equals(parola))
            {
                System.out.println("parola yanlis tekrar giriniz..");
                giris_hakki -=1;
                System.out.println("kalan giris hakki: "+giris_hakki);
            }
            else if(!kadi.equals(kullanici_adi) && parol.equals(parola))
            {
                System.out.println("kullanici adi yanlis tekrar giriniz..");
                giris_hakki -=1;
                System.out.println("kalan giris hakki: "+giris_hakki);
            }
            else 
            {
                System.out.println("kullanici adi ve parola yanlis tekrar giriniz..."); 
                giris_hakki -=1;
                System.out.println("kalan giris hakki: "+giris_hakki);
            }
            if(giris_hakki==0)
            {
                System.out.println("3 giris hakkiniz bitti tekrar deneyiniz !!!");
                break;
            }
        }         
    }
}
