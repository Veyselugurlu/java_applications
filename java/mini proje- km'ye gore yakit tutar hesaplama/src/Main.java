
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    
    Scanner scanner=new Scanner(System.in);
    
    System.out.print("araciniz km'de kac kurus yakiyor(orn=1,99) ?: ");
    double kurus=scanner.nextDouble();
    System.out.print("kac km yol gittiniz ?: ");
    double km=scanner.nextDouble();
    
    System.out.println("tutar= "+(kurus*km)+" tl'dir..");
    
    }
    
}
