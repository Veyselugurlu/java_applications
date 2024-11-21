
import java.util.Scanner;

public class Yolcu implements YurtDisiKuralari{
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
    
  
    public boolean yurtdisiHarciKontrol(){
    if(harc<15){
        System.out.println("lutfen harci tam yatirin");
        return false;
    }
    else{
        System.out.println("harc işlemi tamamlandi");
        return true;
    }
    
    }
    
    public boolean siyasiYasakKontrol(){
    if(this.siyasiYasak==true){
        System.out.println("siyasi yasaginiz bulunmaktadır. Yurt disina cikamazsiniz.");
        return false;
    }
    else {
        System.out.println("herhangi bir yasaginiz bulunmamaktadir."); 
    return true;
    }
    }
    public boolean vizeDurumuKontrol(){
    if(this.vizeDurumu ==true){
        System.out.println("vizeniz bulunmaktadir.");
    return true;
    }
    else{
        System.out.println("vize islemleriniz tamamlanmamistir");
        return false;
    }
    
    }
}
