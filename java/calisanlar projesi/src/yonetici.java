
public class yonetici extends calisanlar {
    private int sorumlu_kisisayisi;

  
        public yonetici(String ad,String soyad,int id,int sorumlu_kisi_sayisi){
            super(ad, soyad, id);
        this.sorumlu_kisisayisi = sorumlu_kisisayisi;
        
    
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster(); 
        System.out.println("yoneticinin sorumlu oldugu kisi sayisi: "+sorumlu_kisisayisi);
    }
        public void zamyap(int zam_miktari){
        
            System.out.println(getAd()+"calisanlara "+zam_miktari+" tl zam yapıyor");
        }
           
}
