
import java.util.Scanner;

// do while ın whileden farki en basta kosul yanlis bile olsa bir kere kodu calistirmasıdır(garanti).
public class Main {
    public static void main(String[] args)
    {
    Scanner scanner= new Scanner(System.in);
    
    /*
        int i=0;
        
            do{
                System.out.println("merhabalar");
                i++;
            
            }while(i<5);    */
    //***sayinin rakamlarini tolama***
        System.out.println("sayi giriniz: ");
        int sayi= scanner.nextInt();
        int toplam=0;
        
        do
        {
        toplam +=sayi%10;       //sayiyinin 10 ile bolumunden kalani yazıp 
                                // rakamların basamaklarınının kac oldugunu buluruz
        
        sayi/=10;      //burdaysa mesela 14'ü 10 bolup 1 kalmasını saglarız isleme aldgimiz basamagi eleriz 
        
        }while(sayi>0);
        System.out.println("toplam: "+toplam);
    }
}
