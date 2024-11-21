
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//klavyeden girilen iki sayının basit hesap makinesi
class carpmaException extends Exception{
public void printStackTrace(){
    System.out.println("iki sayida cok buyuk lutfen daha kücük sayi girin");
}
    
}
public class Main {
  public static void main(String[] args){
    System.out.println("*************************");
        String islemler = "1. toplama islemi\n"
                      +"2. cikarma islemi\n"
                      +"3. bolme islemi\n"
                      +"4. carpma islemi";
        Scanner scanner =new Scanner(System.in);
        System.out.println(islemler);
        System.out.println("*************************");
        System.out.println("islemi seciniz ");
    
      String islem=scanner.nextLine();
         try{
       switch(islem)
       {
           case "1": 
               System.out.println("toplama islemini sectiniz: ");  //1'in üstünde tırnak isareti 
                                                                   //olmasinin sebebi stringtir
                      
               System.out.println("birinci sayiyi girin: ");
               double a=scanner.nextDouble();
               
               System.out.println("ikinci sayiyi girin: ");
               double b=scanner.nextDouble();                
           

               System.out.println("toplam: "+(a+b));
               break;
           case "2": System.out.println("cikarma islemini sectiniz: ");
          
               System.out.println("birinci sayiyi girin: ");
               a=scanner.nextDouble();
          
               System.out.println("ikinci sayiyi girin: ");
               b=scanner.nextDouble(); 
           
                System.out.println("sonuc: "+ (a-b));
                 break;
           case "3": System.out.println("bolme islemini sectiniz: ");
             
               System.out.println("birinci sayiyi girin: ");
               a=scanner.nextDouble();
          
               System.out.println("ikinci sayiyi girin: ");
               b=scanner.nextDouble(); 
           
           
                 System.out.println("sonuc: "+(a/b));
                 break;
           case "4":System.out.println("carpma islemini sectiniz: ");
             
                    System.out.println("birinci sayiyi girin: ");
                    a=scanner.nextDouble();
          
                    System.out.println("ikinci sayiyi girin: ");
                    b=scanner.nextDouble(); 
                    if(a>10000 && b>10000){
                   throw new carpmaException();
                    }
                  System.out.println("sonuc: "+a*b);
                  break;
               
           default:System.out.println("gecersiz islem sectiniz hesaplanamiyor lutfen tekrar secin...");  
       }
         }
         catch(ArithmeticException ex){
             System.out.println("bu sayi sifira bolunemez");
         }
        
         catch(InputMismatchException ex){
             System.out.println("lutfen inputları dogru formatta girin");
         } catch (carpmaException ex) {
          ex.printStackTrace();
      }
       
           
           
  }  
}
