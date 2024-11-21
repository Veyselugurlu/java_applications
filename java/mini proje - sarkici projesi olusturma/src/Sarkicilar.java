
// once şarkıcı eklemek lazım
import java.util.ArrayList;


public class Sarkicilar {
    
    private ArrayList<String> sarkici_listesi=new ArrayList<String>();
    
    
    
    public void sarkicilari_bastir(){
        System.out.println("şarkici listesinde  "+sarkici_listesi.size()+" kadar sarkici var");
        for(int i=0; i< sarkici_listesi.size() ; i++){
            
            System.out.println((i+1)+". sarkici "+sarkici_listesi.get(i));
            
            
        } 
    }
    
    public void sarkici_ekle(String isim){
        
        sarkici_listesi.add(isim);
        
            System.out.println("sarkici2 eklendi");
}
    
    public void sarkici_guncelle(int pozisyon,String yisim){
        sarkici_listesi.set(pozisyon, yisim);
        System.out.println("sarkici listesi guncellendi...");
    
    }
    
    public void sarkici_sil(int pozisyon){
        String isim=sarkici_listesi.get(pozisyon);
        
        sarkici_listesi.remove(pozisyon);
        System.out.println(isim+"sarki baasari ile silindi..");
        
    }
   
    public void sarkici_ara(String isim){
    
        int pozisyon=sarkici_listesi.indexOf(isim) ;
    
    if(pozisyon>0){
        System.out.println("sarkici bulundu");
        System.out.println(isim+" isimli sarkici "+pozisyon+1 +" .pozisyonda");
 
    }
    else{
        System.out.println("sarkici bulunmadi...");
    }
    
    
    }
    
}
   