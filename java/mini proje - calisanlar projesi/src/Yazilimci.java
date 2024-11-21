
import java.util.zip.Adler32;


public class Yazilimci extends Calisanlar{
    private String diller;
    
    public Yazilimci(String ad,String soyad,String alan,int id,String diller){
    super(ad, soyad, alan, id);
    this.diller=diller;
    }
    
   public void format_at(){
       System.out.println( getAd()+" isimli "+getİd()+" li oyuncu format atiyor ");
        }
   public void bilgileri_goster(){
       super.bilgileri_goster();
       System.out.println("yazilimcinin bildigi dilller" +diller);
   }

   
   
    
}
