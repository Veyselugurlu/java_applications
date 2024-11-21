class Hayvan{
private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

     public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
public String konus(){

    return "hayvan konusuyor...";
}
}
    class kedi extends Hayvan{
    
        public kedi(String isim)
{
        super(isim);  // superclass tan ismi aldık
}

        @Override           // *** burda override etmeseydik kedi miyavlıyor yerie hayvan miyavliyor derdi
        public String konus() {
            return this.getIsim() + " miyavliyor...";
        }
    }
    class kopek extends Hayvan{

        public kopek(String isim) {
            super(isim);
        }
        public String konus(){
       
            return this.getIsim() +" havliyor...";
        }
        
        }
    class at extends Hayvan{
        public at(String isim){
        super(isim);
    }
        public String konus(){
        return this.getIsim() +" kisniyor...";
    }
    }
    class ykedi extends Hayvan{
        public ykedi(String isim){
        super(isim);
    }
        public String konus(){
        return this.getIsim() +" miyavliyor";
    }
    

}

public class Main {
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    
    public static void main(String[] args){
    /*    Hayvan hayvan = new kedi("lemon");// iste buna polimorphism denir hayvan uyerine kedi objesini yerlesitrebiliyoruz
        System.out.println(hayvan.konus());
       
        Hayvan hayvan1 =new kopek("karabas");
        System.out.println(hayvan1.konus());
        
        Hayvan At =new at("dragon"); 
        System.out.println(At.konus());
        
        Hayvan hayvan3=new ykedi("baloc");
        System.out.println(hayvan3.konus());
      */
    
    //polimorphsim asıl burda birden fazla nesneyi bir fonksiyona sıgdirirken kullaniyotruz
    
        konustur(new kedi("tekir"));
        konustur(new kopek("karabass"));
        konustur(new at("sahbatur"));
    }
    
}
       
   

