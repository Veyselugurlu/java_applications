
import java.util.Scanner;

//! not operatoru
//|| yada veya
//&& ve
//== eşit ise
public class Main {
    public static void main(String[] args){
    
    Scanner scanner =new Scanner(System.in);
        System.out.print("lutfen sayi girin: ");
    double sayi=scanner.nextDouble();
if(sayi<0){

    System.out.println("negatif");
}
else{
    System.out.println("pozitif veya sifir");
}

//  ****************************************
   
                System.out.print("notunuzu girin: ");
double not=scanner.nextDouble();
if(not>90){
            System.out.println("AA");
}
else if(not>80)
        {
            System.out.println("BA");
        }
else if(not>70)
{
            System.out.println("BB");
}
else if(not>60)
{
            System.out.println("CC");
}
else if(not>50)
{
            System.out.println("DD");
}
else{
            System.out.println("dersten kaldiniz...");
}

    }
}
