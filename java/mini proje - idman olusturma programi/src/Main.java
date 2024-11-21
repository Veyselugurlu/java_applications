
import java.awt.BorderLayout;
import java.util.Scanner;


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
        
        idman Idman=new idman(Burpee, Pushup, Situp, Squat);
        System.out.println("idmaniniz basliyor......");
        
        while(Idman.idmanbittimi()==false){
            System.out.print("hareket turleri(Burpee,Pushup,Situp,Squat)");
            String tur=scanner.nextLine();
            System.out.print("bu hareketten kac tane yapicaksiniz ? ");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            
            Idman.hareketyap(tur, sayi);
        }
        
        System.out.println("idmaninizi basariyla tamamladiniz TEBRİKLER");
    }
    
}
