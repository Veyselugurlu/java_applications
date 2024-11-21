
public class Kare extends Sekil{
    private int kenar;
    
    public Kare(String isim,int kenar){
    super(isim);
    this.kenar=kenar;
    }
    void alan_hesapla(){
        System.out.println(getisim()+" nin alani: "+(kenar*kenar)+" dir");
    }
    
    public void cevre_hesapla(){
        System.out.println(getisim()+"in cevvresi: "+4*kenar+" dir");
    }
}
