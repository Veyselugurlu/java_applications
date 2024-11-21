
import java.util.Scanner;

//polymorphism kullanarak beyblade programi olusturma
public class Test {
    public static void main(String[] args){
        
        System.out.println("beyblade rogramina hosgeldiniz...");
        System.out.println("cikis icin q'ya basiniz");
       
        Scanner scanner=new Scanner(System.in);
        
        while(true){
            
            System.out.println("hangi beyblade'i uretmek istiyorsunuz ? ");
            String islem=scanner.nextLine();
           
            if(islem.equals("q")){
                System.out.println("programdan cikis yapiliyor...");
                break;
            }
            else{ 
                Beybladefabrikasi fabrika=new Beybladefabrikasi();
                Beyblade beyblade=fabrika.beyblade_uret(islem);
            if(beyblade==null){
                System.out.println("lutfen gecerli bir islem girin...");
            }
            
                 else beyblade.bilgileri_goster();
            beyblade.saldir();
            beyblade.kutsal_canavari_ortaya_cikar();
            }
        
        }
        }
    
    }

