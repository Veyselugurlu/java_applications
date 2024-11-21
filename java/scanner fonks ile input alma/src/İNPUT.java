
import java.util.Scanner;



public class İNPUT {
    public static void 
    main(String[] args){
    
/*    Scanner scanner=new Scanner(System.in);
    
        System.out.println("lutfen sayi giriniz :");
        
        double sayi=scanner.nextDouble();// double da int da verebilriiz burdaki scan sayiyi inpula almamızı saglar
        
    System.out.println("sayi "+ sayi);*/
    //*************************************************************
 /*   Scanner scanner= new Scanner(System.in);
    
    System.out.println("yazi giriniz:");
    
    String yazi=scanner.nextLine(); //line ve string ile yazimiz iyazidrima islemini yapiyoruz
    
    System.out.println("yazin: "+yazi);
    */
    Scanner scanner=new Scanner(System.in);
       
    if(scanner.hasNextInt()){
            int sayi=scanner.nextInt();
            System.out.println("sayi: "+sayi);
            
        }
    else
            System.out.println("lutfen bir sayi giriniz...");
    }
}
