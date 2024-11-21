
public class Yonetici extends Calisanlar{
    private int sorumlu_kisi_sayisi;
    public Yonetici(String ad,String soyad,String alan,int id,int sorumlu_kisi_sayisi){
     super(ad, soyad, alan, id);
     this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }

    public int getSorumlu_kisi_sayisi() {
        return sorumlu_kisi_sayisi;
    }

    public void setSorumlu_kisi_sayisi(int sorumlu_kisi_sayisi) {
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }
    
    public void zam_yap(int zam){
        System.out.println(ad+" li yonetici tarafindan " +zam+ " tl yapıldı");
    }

}
