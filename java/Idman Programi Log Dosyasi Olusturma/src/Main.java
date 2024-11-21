
import java.awt.BorderLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("idman programina hosgeldiniz...");
        
        String idmanlar ="gecerli hareketler..\n"
                          +"1.burpee\n"
                          +"2.pushup(sinav)\n"
                          +"3.situp(mekik)\n"
                          +"4.squat\n";
    
        System.out.println(idmanlar);
    
        System.out.println("bir idman olusturun");
        
        System.out.print("Burpee sayisi: ");
        int Burpee =scanner.nextInt();
        System.out.print("Pushup sayisi: ");
        int Pushup =scanner.nextInt();
        System.out.print("Situp sayisi: ");
        int Situp=scanner.nextInt();
        System.out.print("Squat sayisi: ");
        int Squat=scanner.nextInt();
        scanner.nextLine();
        
        Idman idman=new Idman(Burpee, Pushup, Situp, Squat);
                
        System.out.println("idmaniniz basliyor......");
        int i=1;
        
       try(FileWriter writer = new FileWriter("Log.txt")){
       writer.write("idman programi...\n");
       writer.write("Burpee sayisi: "+idman.getBurpeesayisi()+"\n");
       writer.write("Pushup sayisi: "+idman.getPushupsayisi()+"\n");
       writer.write("Situp sayisi: "+idman.getSitupsayisi()+"\n");
       writer.write("Squat sayisi: "+idman.getSquatsayisi()+"\n");
       
       while(idman.idmanbittimi()==false){
            System.out.print("hareket turleri(Burpee,Pushup,Situp,Squat)");
            String tur=scanner.nextLine();
            System.out.print("bu hareketten kac tane yapicaksiniz ? ");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            
            idman.hareketyap(tur, sayi);   
            
            System.out.println("islem -->"+i+".ci  tur : "+tur+"  sayi  : "+sayi);
            i++;
        }
        }
       catch (IOException ex) 
       {
           System.out.println("IOExcepiton hatasi verildi");
       }
        
        System.out.println("idmaninizi basariyla tamamladiniz Tebrikler");
    }
    
}
