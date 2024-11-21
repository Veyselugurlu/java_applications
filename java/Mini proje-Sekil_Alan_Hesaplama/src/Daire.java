
public class Daire extends Sekil{ //override etmezsek daire de hata verir cunku sekil clasınıın ozellikleriniz dairede kullanıyoruz extend etmemmiz gerek
    private int yaricap;
    
    public Daire(String isim,int yaricap){
        super(isim);
        this.yaricap=yaricap;
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }
    
    void alan_hesapla(){
        System.out.println(getIsim()+ "'in alanı "+(Math.PI*yaricap*yaricap));
    }

}
