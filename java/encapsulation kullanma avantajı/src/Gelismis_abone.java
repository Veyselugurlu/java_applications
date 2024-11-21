
public class Gelismis_abone {
    
    private String  isim;
    private int bakiye=120;// burda baslangic degerine 120 verdik hep o kalicak
    private String sehir;

    public Gelismis_abone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        if (bakiye>=0 && bakiye<120){this.bakiye=bakiye;}
        this.sehir = sehir;
    }
        public void dogalgaz_kullan(int miktar){
    
    if(this.bakiye-miktar<0){
        
        System.out.println("yeterli bakiye yok...");
    
    }
     
    else  if(this.bakiye<=0)
          
            { this.bakiye-=miktar;
            if(this.bakiye<0){
                System.out.println("bakiyeniz bittmistir en yakın ATM' den bakiye yukleyebilirisniz "); 
                System.out.println("kredi limiti 150 tl");
            }
            }
    else  {
            System.out.println("yeni bakiye= "+bakiye);
            
            }   
    
    }
    public void bakiye_ogren(){
        System.out.println("bakiye: "+bakiye);
    }
    
    
}
