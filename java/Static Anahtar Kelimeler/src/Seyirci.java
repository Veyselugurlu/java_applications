
public class Seyirci {
    private String isim;
    public static int seyirci_sayisi= 0;
    
    public Seyirci(String isim){
    this.isim=isim;
    
    seyirci_sayisi++;
    }
    
    public String getisim(){
    return isim;
    }
  
    public static int getseyirci_sayisi(){
    return seyirci_sayisi;
    }
    
    public void setisim(String isim){
    this.isim=isim;
    }
    public void oyun_seyret(){
        System.out.println(getisim()+"oyunu seyrediyor...");
    }

}
