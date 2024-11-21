
public class calisan {      //superclas baseclass
    
    private String isim;
    private int maas;
    private String departman;
    private String konum;
    
    public calisan(String isim,int maas,String departman,String konum){
    
    this.isim=isim;
    this.maas=maas;
    this.departman=departman;
    this.konum=konum;
      
    }
   public void calis(){
   
       System.out.println("calisan calisiyor..");
   }
   public void bilgilerigoster(){
   
       System.out.println("isim: "+isim);
       System.out.println("maas: "+maas );
       System.out.println("depatman: "+departman);
       System.out.println("konum: "+konum);
   
   } 

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }
   public void departmandegistir(String yenidepartman){
       System.out.println("depatman degistiriliyor");
       this.departman=yenidepartman;
       System.out.println("yeni departman => "+this.departman);
       
       
   }
   
   
}
