
public class calisanlar {
    private String ad;
    private String soyad;
    private int id;

    public calisanlar(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }
    public void bilgileri_goster(){
        System.out.println("calisan bilgileri...");
        System.out.println("ad: "+ad);
        System.out.println("soyad: "+soyad);
        System.out.println("id: "+id);
    
    }
    

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
