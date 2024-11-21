
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Alan Pesaplama Programina Hosgeldiniz..\n Yapmak istediginiz islemi secin \n");
        String islemler= "1- Kare Alan Hesaplama\n "
                +"2- ucgenin alanini hesaplama\n"
                +"3- Daire Alan Hesaplama\n"
                +"cikis icin q ";
       
    Sekil sekil =null; //burdaki referensi daire ve karede kullandik ucgende ise obje olusturup alan hesapladık 
        while(true){
             System.out.println(islemler);
            System.out.println("Hangi Seklin Alanini Hesaplmak istiyorsunuz ?");
            String secim=scanner.nextLine();
           if(secim.endsWith("q")){
                   try {
                        System.out.println("Cikis Yapiliyor...");
                     Thread.sleep(2000); //cikis yaparken 2 saniye bekletiyip oyle programdan cikartmaya yariyor
                     
                 } catch (InterruptedException ex) {
                     ex.printStackTrace();
                 }
               break;
           }
           else if(secim.equals("1")){

               System.out.println("Karenin Kenari:  ");
               int kenar=scanner.nextInt();
               scanner.nextLine();
               sekil =new Kare("kare", kenar);
              sekil.alan_hesapla();
               
           }
           else if(secim.equals("2")){
               System.out.println("Ucgenin Kenarlarini Giriniz: ");
               int a=scanner.nextInt();
               int b=scanner.nextInt();
               int c =scanner.nextInt();
               scanner.nextLine();   
              Ucgen ucgen =new Ucgen("ucgen", a, b, c);
               ucgen.alan_hesapla();
               
           }
           else if(secim.equals("3")){
               System.out.println("Daire Yaricapini Giriniz: ");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                
                sekil =new Daire("Daire", yaricap);
                sekil.alan_hesapla();
           }
                
           else{
               System.out.println("Gecerli Bir islem Giriniz \n");
           }
            
            
        }
        
        
        
    }
}
