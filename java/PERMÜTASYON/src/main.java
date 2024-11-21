
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class main {
    public static int[] arrayi_doldur(int sayi){
        System.out.println("dizi uzunlugunu giriniz:");
        Scanner scanner=new Scanner(System.in);
        int[] çıktı=new int[sayi];
        
        for(int i=0;i<sayi;i++){
        çıktı[i]=scanner.nextInt();
        
        }
        return çıktı;
    }
    public static void arrayi_bastir(int[] array){
    for(int i=0;i<array.length;i++){
        System.out.println("elmenet "+(i+1)+" giriniz:"+array[i]);
        
        
        
    }
    }
    public static void array_sort(int[] array){
        Arrays.sort(array);
        arrayi_bastir(array);
    
    }
 
    public static void main(String[] args){
        int toplam = 1;
        int[] a=arrayi_doldur(5);
        if(a==a)
        {arrayi_bastir(a);
            for(int i=1;i<=a.length;i++){
             toplam*=i;
             
            }
            System.out.println("permutoasyon:"+toplam);
           
        }
        else
        { 
           
            System.out.println("farkli tam sayi giriniz:"); 
            
        }
        
   
      
    } 
}
