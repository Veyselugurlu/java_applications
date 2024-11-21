
import java.util.Scanner;


public class ATM {
    public void calis(Hesap hesap){
    
    Login login =new Login();
    Scanner scanner =new Scanner(System.in);
        System.out.println("*** bankamiza hosgeldiniz ***");
    
        System.out.println("***kullanici girisi***");
       int girishakki=3;
        
        while(true){
        if(login.login(hesap)){
            System.out.println("giris basarili");
            break;
     
        }
        else System.out.println("giris basarisiz");
        girishakki-=1;
            System.out.println("kalan giris hakkiniz: "+girishakki);
         if(girishakki==0){System.out.println("giris hakkiniz bitti.");
         return;
         }
        }
        
        System.out.println("*****************");
        
        String islemler= "1.bakiye goruntuleme\n"
                          +"2.para yatirma\n"
                          +"3.para cekme\n"
                          +"q cikis";
        System.out.println("islemler: "+islemler);
        System.out.println("*****************");
        while(true){
            System.out.println("islem seciniz:");
            String islem=scanner.nextLine();
            
            if(islem.equals("q"))
            {
            break;
            }
            else if(islem.equals("1")){     // stringli ifade kullandigimizda "1"  yazmamiz lazim
                System.out.println("bakiye: "+hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("yatirmak istedigini tutari giriniz:");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.parayatirma(tutar);
                
            }
            else if(islem.equals("3")){
                System.out.println("cekmek istediginiz tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paracekme(tutar);
            }
            else System.out.println("geceersiz islem...");
            
        }
        
    }
}
