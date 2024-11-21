
import java.util.Scanner;


public class Main {
   public static void main(String[] args){
   
   Scanner scanner=new Scanner(System.in);
   int a;
   int b;
       System.out.print("birinci kenar: ");
       a=scanner.nextInt();
      
       System.out.print("ikinci kenar: ");
       b=scanner.nextInt();
   
       double h=Math.sqrt(a*a+b*b);
   System.out.print("hipotenus: " + h);
   } 
}
