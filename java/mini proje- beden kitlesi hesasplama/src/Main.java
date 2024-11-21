
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
 
    Scanner scanner= new Scanner(System.in);
    
        System.out.println("kilonuz: ");
        double kilo=scanner.nextDouble();
      
        System.out.println("boyunuz orn:1,76m: ");
        double boy=scanner.nextDouble();
        
        double bki=kilo/(boy*boy);
        System.out.println("beden kitle indexiniz: "+bki);
         if(bki<18.5)
    {
            System.out.println("zayif");
    }
         else if(bki>=18.5 && bki<25)
    {
            System.out.println("normal");
    }
         else if(bki>=25 && bki<30)
    {
            System.out.println("sismanlik oncesi");
    }
         else {
            System.out.println("obez"); 
         }
    }
}
