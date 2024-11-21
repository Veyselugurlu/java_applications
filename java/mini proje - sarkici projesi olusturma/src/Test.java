  
import java.util.Scanner;


public class Test {
    
    private static Sarkicilar sarkicilar=new Sarkicilar();
    private static Scanner scanner=new Scanner(System.in);
    
    public static void sarkici_goruntule(){
    sarkicilar.sarkicilari_bastir();
    
    }
    
    public static void sarkici_ekle()
    {
        
        System.out.println("eklemek istediginiz sarkicinin ismi: ");
        String isim=scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    
    }
    
    public static void sarkici_guncelle(){
        System.out.println("guncellemek istediginz pozisyon: ");
        int pozisyon=scanner.nextInt();
        scanner.nextLine();
        String yisim=scanner.nextLine();
        sarkicilar.sarkici_guncelle(pozisyon - 1, yisim);
    }
    public static void sil(){
        System.out.println("silmek istediginiz pozisyon:(1,2,3) ");
         
        int pozisyon=scanner.nextInt();
        scanner.nextLine();
        
        sarkicilar.sarkici_sil(pozisyon-1);
        
    }
    
    public static void ara(){
        System.out.println("aramak istediginiz sarkiciyi giriniz: ");
        String isim=scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    
    }
    
    public static void islemleri_bastir(){
        System.out.println("\t 0-islemleri goruntule");
        System.out.println("\t 1-sarkicilari goruntule");
        System.out.println("\t 2-sarkici ekle");
        System.out.println("\t 3-sarkici guncelle");
        System.out.println("\t 4-sarkici sil");
        System.out.println("\t 5-sarkici ara");
        System.out.println("\t 6-uygulamadan cik");
        
    
    }
    public static void main(String[] args){
        System.out.println("\t sarki uygulamasina hosgeldiniz...");
        islemleri_bastir();
    
        boolean cikis = false;
        
        int islem;
        
        while(!cikis){
        
           System.out.println("bir islem seciniz: ");
            
           
           islem=scanner.nextInt();
           scanner.nextLine();
           
           switch(islem){
               
               case 0:
                   islemleri_bastir();
                   break;
               case 1:
                   sarkici_goruntule();
                   break;
               case 2: 
                   sarkici_ekle();
                   break;
               case 3: 
                   sarkici_guncelle();
                   break;
               case 4: 
                   sil();
                   break;
               case 5:
                   ara();
                   break;
               case 6: 
                   cikis=true;
                   System.out.println("uygulamadan cikiliyor...");
                   break;
                   
           }
           
        }
    }
    
}
