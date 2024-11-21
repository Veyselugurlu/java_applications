
public class yonetici extends calisan {//subclass is a
   
    private int sorumlu_kisi;          // EKSTRA OZELLİK
    private int zam_yap;        
    
    
    public yonetici(String isim,int maas,String departman,String konum,int sorumlu_kisi){
    
    super(isim,maas,departman,konum);
    this.sorumlu_kisi=sorumlu_kisi;
    
    }
    public void zam_yap(int zam_miktari){
    
        System.out.println("calisanlara "+zam_miktari+" tl zam yapildi");
    }
    
    public void bilgilerigoster(){
        /*
       System.out.println("isim: "+getIsim());
       System.out.println("maas: "+getMaas() );
       System.out.println("depatman: "+getDepartman());
       System.out.println("konum: "+getKonum());*/
       //üst kısmı almasak da super.bilgilerigoster yazarak da cagirabilrdik
         super.bilgilerigoster(); //superclass'tan bilgileri gostererek almammızı sağlar
        System.out.println("sorumlu kisi sayisi :"+this.sorumlu_kisi);
    }
    
    }

