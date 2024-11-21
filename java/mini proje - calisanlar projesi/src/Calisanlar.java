
public class Calisanlar {
    String ad;
    private String soyad;
    private String alan;
    private int id;
    
    public String getAd(){
    return ad;
    }
    public void setAd(String ad){
    this.ad=ad;
    }
    public String getSoyad(){
    return soyad;
    }
    public void setSoyad(String soyad){
    this.soyad=soyad;
    }
    public String getAlan(){
    return alan;
    }
    public void setAlan(String alan){
    this.alan=alan;
    }
    public int getİd(){
    return id;
    }
    public void setİd(int id){
    this.id=id;
    }

    public Calisanlar(String ad, String soyad, String alan, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.alan = alan;
        this.id = id;
    }
    public void bilgileri_goster(){
        System.out.println("ad: "+ad);
        System.out.println("soyad: "+soyad);
        System.out.println("alan: "+alan);
        System.out.println("id: " +id);
    }
    
}   