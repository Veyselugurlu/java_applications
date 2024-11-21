
import java.util.Scanner;


public class Matematik {
        private double pi=Math.PI;

    public class factorial{
        public void faktoriyel(){
            Scanner scanner =new Scanner(System.in);

            int sayi=scanner.nextInt();
            int fakt=1;
            for(int i =2;i<=sayi;i++){
            fakt*=i;

            }
            System.out.println("sonuc: "+fakt);
        }
        }
           
    public class Asal{
        public boolean asal_mi(int sayi){
        int i =2;
        while(i<sayi){
        if(sayi%i==0){
        return false;
        }
        i++;
        }
        return true;
        }
        }
   public class Alan{
        public void daire_alan(int yaricap){
            System.out.println("dairenin alani: "+(yaricap*yaricap*pi));
        }
        }
    
}
