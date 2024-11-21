
import java.util.Scanner;

// while dongusu kullanarak hesap makinesi yapma
public class Main {
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        
        int bakiye= 3000;
        String islemler= "1.islem: bakiye goruntuleme\n"
                          +"2.islem: para cekme\n"
                          +"3.islem: para yatirma\n"
                          +"4.islem: q'a basarak cikis yapma";
        
        System.out.println("******************");
        System.out.println(islemler);
        System.out.println("******************");
        while(true)     //true olmasinin sebebi bi islem bittikten sonra islmein devam etmesidir. 
        {
            System.out.println("islem seciniz: ");
            String islem=scanner.nextLine();
            
            if(islem.equals("1"))
            {       
                System.out.print("bakiyeniz: "+bakiye);
            }
            else if(islem.equals("2"))
            {
                System.out.println("para cekme islemini sectiniz.bakiyeniz"+bakiye);
                System.out.print("cekmek istediginiz tutur: ");
                int cekim=scanner.nextInt();
                scanner.nextLine();
                
                if(bakiye-cekim < 0) 
                {
                    System.out.print("bakiye yetersiz.. bakiyeniz: "+bakiye); 
                }
               
                else
                { bakiye -=cekim;
                 System.out.println("yeni bakiyeniz: "+bakiye); 
                }
              
            }
          else if(islem.equals("3"))
          {
              System.out.println("para yatirma islemini setiniz bakiyeniz: "+bakiye);
              int tutar=scanner.nextInt();
              scanner.nextLine();
            
              System.out.println("yatirmak istediginiz tutari giriniz: "+tutar);
              bakiye+=tutar;
              System.out.println("yeni bakiyeniz: "+bakiye);
       
          } 
             
          
          
          else if(islem.equals("q"))
          {
              System.out.println("programdan cikiliyor...");
          break;
          }
        
          else{System.out.println("geçersiz islem");}    
            
        }}  
    
}
