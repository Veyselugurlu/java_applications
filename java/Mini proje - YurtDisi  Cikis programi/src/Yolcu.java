
import java.util.Scanner;
class SiyasiException extends Exception{
@Override
    public void printStackTrace(){
    System.out.println("siyasi yasaginiz bulunmaktadir");
    }
    
}
class VizeException extends Exception{
public void printStackTrace(){
    System.out.println("vizeniz bulunmamaktadir");
}}
class HarcException extends Exception{
public void printStackTrace(){
    System.out.println("lutfen harcinizi tam yatirin.");
}}

public class Yolcu {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu(){
    Scanner scanner =new Scanner(System.in);
        System.out.println("yatirdiginiz harc bedelini giriniz:");
        this.harc=scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("herhangi bir siyasi yasaginiz bulunuyor mu?");
        String cevap=scanner.nextLine();
        if(cevap.equals("evet"))
        { this.siyasiYasak=true; } 
        else
        {this.siyasiYasak=false; }
        
        System.out.println("vizeniz bulunuyor mu? (evet ya da hayir)");
        String cevap2=scanner.nextLine();
        if(cevap2.equals("evet")){
        this.vizeDurumu=true;
        }
        else
        {
        this.vizeDurumu=false;    
        }
              
    }
    
  
    public void yurtdisiHarciKontrol() throws HarcException{
    if(harc<15){
        throw new HarcException();
    }
    else{
        System.out.println("harc işlemi tamamlandi");

    }
    
    }
    
    public void siyasiYasakKontrol() throws SiyasiException{
    if(this.siyasiYasak==true){
       throw new SiyasiException();
        
    }
    else {
        System.out.println("herhangi bir yasaginiz bulunmamaktadir."); 
    
    }
    }
    public void vizeDurumuKontrol() throws VizeException{
    if(this.vizeDurumu ==true){
        System.out.println("vize islemleri tamam");
    }
    else{
        throw new VizeException();  
    }
    
    }
}
