
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("calisanlar programina hosgeldiniz...");
        Scanner scannner=new Scanner(System.in);
        Yonetici yonetici=new Yonetici("veysel","ugurlu","mobil",4,5);
        Yazilimci yaz=new Yazilimci("veysel","ugurlu","web",4,"java");
        yaz.bilgileri_goster();
        yaz.format_at();
        yonetici.setSorumlu_kisi_sayisi(5);
        yonetici.zam_yap(100);
        
    }
}
