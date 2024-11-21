//calisanlar programi
//calisanlar seklinde bir üst sinif
//calisanlardan tureyen yazilimci bir aşt sinif
//calisan sinifindan tureyen yonetici bir alt sinif
import java.util.Scanner;


public class main  {
    public static void main(){
        Scanner scanner =new Scanner(System.in);    


        System.out.println("calisanlar programina hosgeldiniz");
        String islemler="islemler...\n"+
                "1.yazilimci islemleri\n"
                +"2.yonetici islemleri\n"
                +"cikis icin q\n";
        System.out.println("***********************");
        System.out.println(islemler);
        System.out.println("***********************");
        
        while(true){
            System.out.println("islem seciniz : ");
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("cikis yapiliyor...");
            
            }
            else if(islem.equals("1")){
            
                yazilimci yazilimci1=new yazilimci("veysel","ugurlu", 123, "c,c++,java");
           
                String yazilimci_islem="1.format at\n"
                                    +"2.bilgilerigoster\n"
                                    +"3.cikis icin q";
                                    System.out.println(yazilimci_islem);
                while(true){
                     
                    System.out.println("islemi seciniz : ");
                    String yislem=scanner.nextLine();
                    if(islem.equals("q"))
                    {
                        System.out.println("yazilimci silemlerden cikiyor...");
                        break;
                    }
                    else if(islem.equals("1")){
                        System.out.println("isletim sistemi: ");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci1.format_at(isletim_sistemi);      //ad soyad id hepsini yazilimci 1'e atadık
                        
                        
                    }
                    else if(islem.equals("2")){yazilimci1.bilgileri_goster();}
                    else{System.out.println("gecersiz yazilimci islemi sectiniz");}
                }
                
            }
            else if(islem.equals("2")){
            yonetici yonetici1=new yonetici("ali", "osman", 1234, 10);
            String yonetici_islmleri="islemler\n"
                                      +"1.zam yap\n"
                                      +"2.bilgileri goster\n"
                                      +"cikis icin q'a basin";
                System.out.println(yonetici_islmleri);
            while(true){
                System.out.println("islem seciniz: ");
                String y_islem=scanner.nextLine();
            
                if(y_islem.equals("q")){System.out.println("yonetici islemlerinden cikis yapiliyor ");
                break;
                }
                else if(y_islem.equals("1")){
                    System.out.println("yoneticiden zam beklentiniz kac tl'dir ?");
                    int zam_miktari=scanner.nextInt();
                    scanner.nextLine();
                    yonetici1.zamyap(zam_miktari);
                
                }
                else if(islem.equals("2")){
                yonetici1.bilgileri_goster();
                }
                else {System.out.println("gecersiz yonetici islemi...");}
                
                
            }
                
            }
            
            else{System.out.println("gecersiz islem ");
            break;
            }
        
        }
    }
}
