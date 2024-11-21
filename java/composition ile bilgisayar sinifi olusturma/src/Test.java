
public class Test {
    public static void main(String[] args){
    
        Resolution resolution=new Resolution(1920,1080);
        Monitor monitor =new Monitor("VS197DE", "ASUS", "15.6", resolution); //1920v1080'i yukardaki objeyle aliyor
        Kasa kasa =new Kasa("shadow blade", "shadow", "temel cam");
        Anakart anakart=new Anakart("B250-pro","japon", "ubuntu", 5);
       
        Bilgisayar pc=new Bilgisayar(anakart, kasa, monitor);
        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().isletim_sistemi_yukle("ubuntu 17.4");
        
    }
}
