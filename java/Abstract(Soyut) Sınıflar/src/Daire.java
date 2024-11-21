
public class Daire extends Sekil{
    private int yaricap;
    
    public Daire(String isim,int yaricap){
    super(isim);
    this.yaricap=yaricap;
    }
    void alan_hesapla(){
        System.out.println(getisim()+" nin alani: "+(Math.PI*yaricap*yaricap+" dir"));
    }
    public void cevre_hesapla(){
        System.out.println(getisim()+" in cevresi: "+(2*Math.PI*yaricap*yaricap)+" dir");
    }
}
