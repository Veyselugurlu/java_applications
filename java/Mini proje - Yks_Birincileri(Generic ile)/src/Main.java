
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
  /*  Sayisal sayisal1=new Sayisal("Veysel", 40, 35, 10, 15);
    Sayisal sayisal2=new Sayisal("ali osman",30,35,20,15);
    
    Sayisal birinci=birinci(sayisal1,sayisal2);
    
    Esit_Agirlik  ea1=new Esit_Agirlik("Veysel", 45, 30, 0, 10);
    Esit_Agirlik ea2=new Esit_Agirlik("alios",35,35,20,20);
    
      Esit_Agirlik birinci2=birinci(ea1,ea2);
      
      
        System.out.println("Sayisal Birincisi puani: "+birinci.puanHesapla());
        System.out.println("Esit Agirlik Birincisi puani: "+birinci2.puanHesapla());
        
        
    }
*/
        System.out.println("YKS Birincileri :");
         String islemler="1- Sayisal Ogrencileri Birincisi"
                    +"2- Esit Agirlik Ogrencileri Birincisi";
                    
        System.out.println(islemler);
  
    while(true){
        System.out.println("Cikis icin q Basin");
        String cevap=scanner.nextLine();
        if(cevap.equals("q")){
            System.out.println("cikis yapiliyor...");
            break;
        }
        
        System.out.print("Birinci Ogrenci İsmi: ");
        String isim1=scanner.nextLine();
        System.out.println("Netler:(edebiyat,mat,inkilap,fen) ");
        int edebiyat1=scanner.nextInt();
        int mat1=scanner.nextInt();
        int inkilap1=scanner.nextInt();
        int fen1=scanner.nextInt();
        scanner.nextLine();

        System.out.print("İkinci Ogrenci İsmi: ");
        String isim2=scanner.nextLine();
        System.out.println("Netler:(edebiyat,mat,inkilap,fen) ");
        int edebiyat2=scanner.nextInt();
        int mat2=scanner.nextInt();
        int inkilap2=scanner.nextInt();
        int fen2=scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Ucuncu Ogrenci İsmi: ");
        String isim3=scanner.nextLine();
        System.out.println("Netler:(edebiyat,mat,inkilap,fen) ");
        int edebiyat3=scanner.nextInt();
        int mat3=scanner.nextInt();
        int inkilap3=scanner.nextInt();
        int fen3=scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("islem secin: (ea -2mi sayisalmı-1)  "); //cikis tusunu cevap olarak ayri bir stringde almamiz dongunun icinde kalıp diasari cikamamsindan dolayi
        String islem=scanner.nextLine();
        if(islem.equals("1")){
               Sayisal ogrenci1= new Sayisal(isim1, edebiyat1, mat1, inkilap1, fen1);
               Sayisal ogrenci2= new Sayisal(isim2, edebiyat2, mat2, inkilap2, fen2);
               Sayisal ogrenci3= new Sayisal(isim3, edebiyat3, mat3, inkilap3, fen3);
                Sayisal birinci=birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("sayisal birinci ogrenci : "+birinci.getIsim());
                System.out.println("puani: "+birinci.puanHesapla());
                
                }
        else if (islem.equals("2")){
                Esit_Agirlik ogrenci1=new Esit_Agirlik(isim1, edebiyat1, mat1, inkilap1, fen1);
                Esit_Agirlik ogrenci2= new Esit_Agirlik(isim2, edebiyat2, mat2, inkilap2, fen2);
                Esit_Agirlik ogrenci3= new Esit_Agirlik(isim3, edebiyat3, mat3, inkilap3, fen3);

                Esit_Agirlik birinci=birinci(ogrenci1, ogrenci2, ogrenci3);
                    System.out.println("esit agirlik birincisi "+birinci.getIsim());
                    System.out.println("puani . "+birinci.puanHesapla());
                }
        
    }

         }
       public static <E extends Aday> E birinci(E e1,E e2,E e3){    //generic metod olusturduk puani en yksek ogrencşyi dnodurcek puan hespalmayı almak icin extends ettik adau dan
   if(e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla()>e3.puanHesapla()){       
       return e1;
   }
   else if(e2.puanHesapla()>e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()){
       return e2;
       
   }
   else if(e3.puanHesapla() >e1.puanHesapla() && e3.puanHesapla() > e2.puanHesapla() )
   {
   return e3;
   }
   else{
   return e1;
   }
       }
       
}
   
 
   