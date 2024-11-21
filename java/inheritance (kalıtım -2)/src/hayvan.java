
public class hayvan {
 
    private int bacaksayisi;
    private String ismi;
    private int kilo;
    private int boy;
   
    
    public hayvan(String ismi,int bacaksayisi,int kilo,int boy){
    this.ismi=ismi;
    this.bacaksayisi=bacaksayisi;
    this.boy=boy;
    this.kilo=kilo;
  }

    public void yemekye(){
    
        System.out.println("su anda yemek yiyor..");
    }
    public void hareketegec(int hiz){
    
        System.out.println("havan "+hiz +" ile hateket ediyor");
    }
    
    public int getBacaksayisi() {
        return bacaksayisi;
    }

    /**
     * @param bacaksayisi the bacaksayisi to set
     */
    public void setBacaksayisi(int bacaksayisi) {
        this.bacaksayisi = bacaksayisi;
    }

    /**
     * @return the ismi
     */
    public String getIsmi() {
        return ismi;
    }

    /**
     * @param ismi the ismi to set
     */
    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    /**
     * @return the kilo
     */
    public int getKilo() {
        return kilo;
    }

    /**
     * @param kilo the kilo to set
     */
    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    /**
     * @return the boy
     */
    public int getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(int boy) {
        this.boy = boy;
    }
    
    
}
