
public class Hasta implements Comparable<Hasta>{
    private String isim;
    private int oncelik_sirasi;
    private String sikayet;

    public Hasta(String isim,  String sikayet) {
        this.isim = isim;
   
        this.sikayet = sikayet;
        if(sikayet.equals("Yanik")){
        this.oncelik_sirasi=2;
        }
        else if(sikayet.equals("Apandisit")){
        this.oncelik_sirasi=1;
        }
        else   {
        this.oncelik_sirasi=3;
        }      
        
    }

    @Override
    public String toString() { //YAZDİRMA İSLEMİ
        return "Hasta{" + "isim=" + isim + ", oncelik_sirasi=" + oncelik_sirasi + ", sikayet=" + sikayet + '}';
    }

    @Override
    public int compareTo(Hasta hasta) { //siralama islemi
        if(this.oncelik_sirasi<hasta.oncelik_sirasi){
        return -1;
        }
        else if(this.oncelik_sirasi>hasta.oncelik_sirasi){
        return 1;
        }
        return 0;
        
    }
    
    
}
