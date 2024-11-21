
import java.io.File;
import java.util.Scanner;


public class Main {
    private static Kart[][] kartlar = new Kart[4][4];
   
    public static void tahmin_et(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("birinci tahminleri (i ve j degerlerlerini bir bosluk birakarak) girin");
        int i1= scanner.nextInt();
        int j1= scanner.nextInt();
       
        kartlar[i1][j1].setTahmin(true);// burdda seçtiginiz ilk kartin acilmasini saglar
        
        oyun_tahtasi();
      
        System.out.println("ikinci tahminleri (i ve j degerlerlerini bir bosluk birakarak) girin");
        int i2= scanner.nextInt();
        int j2= scanner.nextInt();
        if(kartlar[i1][j1].getDeger()==kartlar[i2][j2].getDeger()){
        kartlar[i2][j2].setTahmin(true);
            System.out.println("tebrikler dogru karti sectiniz");
        }
        else
        {
             System.out.println("yanlis karti sectiniz");
        kartlar[i1][j1].setTahmin(false);// false yaparak açılan ilk kaartı kapatiriz
        }
    }
    public static boolean oyun_bittimi(){
        for(int i=0; i<4 ;i++){
            for(int j=0; j<4 ;j++ ){
            if(kartlar[i][j].isTahmin()==false){
            return false;
            }
            
            }
        }
    return true;
    
    }
    public static void oyun_tahtasi(){
    
        for(int i=0; i<4; i++){
            System.out.println("--------------------");
        
            for(int j=0; j<4 ;j++){
        
                if(kartlar[i][j].isTahmin()){
            
                    System.out.print("| "+kartlar[i][j].getDeger()+"| ");
        }
        
                else {System.out.print(" | | ");
        }
        }
            System.out.println("");
    }
        System.out.println("---------------------");
    
    }
    public static void kayittanAl(){

            File file=new File("kayit.bin");
            Scanner scanner=new Scanner(System.in);
            
            if(file.exists()){ //kayit doyasinda kaydedilmis oyun var mi onab kar varsa haber veiri kayittan lip almmamayi 
            System.out.println("kayit edilmis bir oyununuz var kayittan almak istermisiniz ? (yes yada no)");
            String cevap=scanner.nextLine();
            
            if(cevap.equals("yes")){
            kartlar=OyunKayit.kayittanAl();
             return;  
            }
                  //eger cevapa aten hayirsa ve zaten kayit edilmis oyun yoksa assagi gidicez o yuzden krtlari assagi yerlestiriyoruz 
        }    
        kartlar[0][0]=new Kart('E');
        kartlar[0][1]=new Kart('A');
        kartlar[0][2]=new Kart('B');
        kartlar[0][3]=new Kart('F');
        kartlar[1][0]=new Kart('G');
        kartlar[1][1]=new Kart('M');
        kartlar[1][2]=new Kart('A');
        kartlar[1][3]=new Kart('E');
        kartlar[2][0]=new Kart('H');
        kartlar[2][1]=new Kart('B');
        kartlar[2][2]=new Kart('F');
        kartlar[2][3]=new Kart('G');
        kartlar[3][0]=new Kart('H');
        kartlar[3][1]=new Kart('M');
        kartlar[3][2]=new Kart('D');
        kartlar[3][3]=new Kart('D');
        
    }
    
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    kayittanAl();
    
        while(oyun_bittimi()==false){
            oyun_tahtasi();
            
            System.out.print("Cikis yapmak istiyormusunuz ? (yes yada no)");
            String cikis=scanner.nextLine();
            
            if(cikis.equals("yes")){
                
                System.out.println("Oyunu kaydetmek istiyormusunuz ? (yes yada no)");
                String kayit=scanner.nextLine();
                
                if(kayit.equals("yes"))
                {
                OyunKayit.oyunKaydet(kartlar);
                }
                else 
                {
                    System.out.println("oyun kaydedilmedi...");
                }
            
                    System.out.println("cikis yapiliyor...");
            
                    break;
                }       
      
            
        tahmin_et();
       }
     
    }
    
}
