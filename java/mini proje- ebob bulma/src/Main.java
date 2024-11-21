
import java.util.Scanner;

//ebob en buyuk ortak bolen
// kulanicidan alinan iki sayinin ebbunu bulma
public class Main {
    public static int ebobbulma(int a,int b){
    int ebob=1;
    for(int i=1;i<a && i<b;i++ ){
    if (a%i==0 && b%i==0){
        ebob=i;
    }
    }
       return ebob;
    }
    
        public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
    
        System.out.println("ilk sayiyi girin: ");
        int a=scanner.nextInt();
        
        System.out.println("ikinci sayiyi girin: ");
        int b=scanner.nextInt();
           
        System.out.println("iki sayinin ebobu: "+ebobbulma(a,b));
    }
}
