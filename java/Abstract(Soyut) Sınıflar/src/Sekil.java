
public abstract class Sekil {
    private String isim;
    
    public Sekil(String isim){
    this.isim=isim;
    }
    
    public String getisim(){
    return isim;
    }
    public void setisim(String isim){
    this.isim=isim;
    }
    
    public void ismini_soyle(){
    System.out.println("bu obje "+isim+"objesidir.");
    }
    abstract void alan_hesapla();
    
}
