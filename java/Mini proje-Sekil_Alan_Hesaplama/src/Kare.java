
public class Kare extends Sekil{
    private int kenar;
    
   public Kare(String isim,int kenar){
       super(isim);
       this.kenar=kenar;
   }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }
   
    @Override
    void alan_hesapla(){
        
        double alan=kenar*kenar;
        System.out.println(getIsim()+"'in alani "+alan+"\n");
    }
    
    
   
   
    
}
