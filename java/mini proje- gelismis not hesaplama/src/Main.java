
import java.util.Scanner;
/*
vize1 vize2 final toplam notunu hesaplama etkilerini kendimiz belirleyip ortalaması 2.50 nin altındaysa tavsye verilecek
program
toplam not>90-->AA
toplam not>85-->BA
toplam not>80 -->BB
toplam not>75-->CB
toplam not>70-->CC
toplam not>65-->DC
toplam not>60-->DD
toplam not>=55-->FD
toplam not<55-->KALDİ
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("vize1 notunu girin: ");
        float vize1=scanner.nextFloat();
        System.out.println("vize2 notunu girin: ");
        float vize2=scanner.nextFloat();
        System.out.println("final notunu girin: ");
        float finalnot=scanner.nextFloat();
        double topnot=vize1*0.3+vize2*0.3+finalnot*0.4;
        
        System.out.println("ortalamamizi giriniz: ");
        double ort=scanner.nextDouble();
        if(topnot>90){
            System.out.println("AA");
        }
        else if(topnot>85) {
        
            System.out.println("BA");
        }
         else if(topnot>80) {
        
            System.out.println("BB");
        }
         else if(topnot>75) {
        
            System.out.println("CB");
        }
        else if(topnot>70) {
        
            System.out.println("CC");
        }
        else if(topnot>65) {
        
            System.out.println("DD");
            if(ort<2.50)
            {
                System.out.println("DD aldiniz ve ortalamaniz dusuk yukseltmek icin tekrar girebilirsiniz");
            }
        }
        else if(topnot>60) 
            {
        
            System.out.println("DC");
             if(ort<2.50)
            {
                System.out.println("Dc aldiniz ve ortalamaniz dusuk yukseltmek icin tekrar girebilirsiniz");
            }
        }
        else if(topnot>=55) 
        {
        
            System.out.println("FD aldiniz ve kaldiniz");
        }
        else 
        {
        
            System.out.println("FF aldiniz ve kaldiniz ");
        }

    }
}
