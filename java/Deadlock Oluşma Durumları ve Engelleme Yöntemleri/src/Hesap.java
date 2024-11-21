
public class Hesap {
    private int bakiye=10000;

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void paracek(int miktar){
    bakiye-=miktar;
    }
    public void paraYatir(int miktar){
    bakiye+=miktar;
    }
    public static void paraTranferi(Hesap hesap1,Hesap hesap2 ,int miktar){
        
        hesap1.paracek(miktar);
        hesap2.paraYatir(miktar);
        
    }
    
}
