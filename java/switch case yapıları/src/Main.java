
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        switch(op){
        case durum1:
        islemler
        break;
        case durum2:
        islemler
        break;
        
        defeult:
        islemler
        break; }
       
        */
        Scanner scanner=new Scanner(System.in);
        
        System.out.print(" yapmak istediginz islemi girin: ");
       
        int no=scanner.nextInt();
      
        switch(no){
        
            case 1:System.out.println("toplama");
           
            break;
           
            case 2:System.out.println("cikarma");
           
            break;
            
          
            case 3:System.out.println("carpma");
            break;
            default: System.out.println("islem bulunamadi tekrar secin...");
        }
        
        
    }
    
}
