//oop ile ATM programi
//hesap classı hesap işlemlerini yapacak
//login girisi kullanici girisini kontrol edicek 
//ATM ise atmmizi calistiracak

public class Hesap {
    
    private String kullanici_adi;
    private String parola;
    private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye) { //sağ click insert code
                                                                   //tusuna bas constructor dan oto çıkar
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paracekme(int tutar){
    if(bakiye-tutar<0)
    {
        System.out.println("yetersiz bakiye...");
    }
    else 
        bakiye-=tutar;
        System.out.println("isleminiz basari ile gerceklesmistir \n guncel bakiye: "+bakiye);
    }
    public void parayatirma(int tutar){
    bakiye+=tutar;
        System.out.println("islemiiz basari ile gerceklesmistir \n guncel bakiye: "+bakiye);
    
    }
}
