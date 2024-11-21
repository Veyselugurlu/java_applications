
import java.util.Scanner;

public class Main {
    public static void mekan_kontrol(int yas) throws ArithmeticException{
       
    if(yas < 18){ 
    throw new InvalidAgeExcepiton("yasiniz yetmiyor ");
    }
    else
    {System.out.println("mekana hosgeldiniz..."); }
   }
    
    public static void main(String[] args) {
        System.out.println("yasiniz giriniz");
        Scanner scanner=new Scanner(System.in);
        int yas=scanner.nextInt();
        
        try{
            mekan_kontrol(yas);
        }catch(InvalidAgeExcepiton e ){
        e.printStackTrace();
        }
        
        //eger ki aritmetik exceptionu kaldırıp onun yerine ıoexception koysaydık checked exception old için
        //mekn konrtolun yanına throws ıoexception atardık aşşada try catch ile yakalardı 
//try catch de kullanmasaydık pubkic static void manin yanına throıws daha atardık böylece apı kullanan kullanıcalar için hazır hale gelirdi
    }
}
