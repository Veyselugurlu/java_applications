
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static int[] arrayi_doldur(int sayi){
   
    Scanner scanner=new Scanner(System.in);
    int[] cikti=new int[sayi];
    for(int i=0; i<sayi ;i++){
    cikti[i]=scanner.nextInt();// sayiya ulasana kadar klaveyden giricez 
    }
    return cikti;
     }
    
    public static void arrayi_bastir(int[] array){
    
        for(int i=0;i<array.length;i++){
        System.out.println("element: "+(i+1)+" : "+array[i]);
    }
    }
    
    public static void array_sort(int[] array){// siralama icin kullanilir
    
        Arrays.sort(array);
        arrayi_bastir(array);
    }
    public static void main(String[] args){
      
        int[] a=arrayi_doldur(5);
        //arrayi_bastir(a);
        array_sort(a);
  
        
        
        /*  int[] a=new int[5];    // javada dizi olusturduk 10 karakterli
    
    for(int i=0; i<5; i++){
        a[i]= i*5+4;
       
}
    for(int i=0; i<5; i++){
    
    System.out.println(a[i]);
    }*/
   
  /*int[] b={1,2,3,4,5};
      
        System.out.println("array uzunlugu: "+b.length); //b.lenght array uzunlugunu verir.
    */
    
    
    
    }
    
}
