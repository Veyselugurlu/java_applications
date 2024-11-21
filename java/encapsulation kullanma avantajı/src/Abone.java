
public class Abone {
    
    
    public String isim;//mesela burda abone yerine aboneismi yazsak diğer class tada siism degistirmemiz gerekir
                        //bu yüzden private kullanmak daha iyi olabilr
    public int bakiye;
    public String sehir;
    
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
