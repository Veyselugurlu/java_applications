
public class test {
    public static void main(String[] args){
    
    Araba araba=new Araba();
    
        araba.setmodel("volvoo");
        System.out.println("arac modeli: "+araba.getmodel());
        
        araba.setmotor("1,6v");
        System.out.println("arac motoru: "+araba.getmotor());
        
        araba.setrenk("siyah");
        System.out.println("arac rengi: "+araba.getrenk());
        
        araba.settekerlek(4);
        System.out.println("tekerlek  sayisi: "+araba.gettekerlek());
        
        araba.setkapi(4);
        System.out.println("kapi sayisi: "+araba.getkapi());
        
    }
}
