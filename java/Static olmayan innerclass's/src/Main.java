
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    
    Matematik.Alan alan=new Matematik().new Alan();
    Matematik.factorial faktoriyel=new Matematik().new factorial();
    Matematik.Asal asal =new Matematik().new Asal();
  
    Scanner scanner=new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz.");
        int sayi=scanner.nextInt();
        if(asal.asal_mi(sayi)){
            System.out.println("bu sayi asaldir");        
        }
        else{
            System.out.println("bu sayi asal degildir.");
        }
    
    faktoriyel.faktoriyel(); 
    alan.daire_alan(5);
    }}