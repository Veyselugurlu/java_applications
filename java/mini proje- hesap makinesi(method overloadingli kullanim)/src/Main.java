
import java.util.Scanner;


public class Main {
    public static int cikarma(int a,int b)
    {
        
    return(a-b);
    }
    public static int toplama(int a,int b)
    {
    return(a+b);
    }
    public static int toplama(int a,int b,int c)
    {
    return(a+b+c);
    }
    public static double bolme(double a,double b)
    {
    return ((double)a/b);
    }
    public static int carpma(int a,int b)
    {
    return(a*b);
    }
    public static int carpma(int a,int b,int c)
    {
    return(a*b*c);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("****************");
    String islemler=   "1.cikarma\n"
                        +"2.toplama\n"
                        +"3.bolme\n"
                        +"4.carpma\n"
                        +"q cikis\n";
        System.out.println(islemler);
        System.out.println("****************");
        while(true)
        {
            System.out.print("\nislem seciniz: ");
            String islem = scanner.nextLine();
        if(islem.equals("1"))
        {   
            System.out.print("cikarma islemini sectiniz ");
            System.out.print("a: ");
            int a=scanner.nextInt();
            System.out.print("b: ");
            int b=scanner.nextInt();
            scanner.nextLine();
            System.out.println("sonuc"+cikarma(a,b));
        }
        else if(islem.equals("2"))
        {    System.out.print("toplama islemini sectiniz ");
            System.out.print("kac deger toplayacaksiniz ?(2 veya 3) ");
            int kacsayi=scanner.nextInt();
            
            if(kacsayi==2)
            {
               
            System.out.print("a: ");
            int a=scanner.nextInt();
            System.out.print("b: ");
            int b=scanner.nextInt();
            scanner.nextLine();
            System.out.print("sonuc: "+toplama(a,b));
            
            }
            else if(kacsayi==3)
            {
                
            System.out.print("a: ");
            int a=scanner.nextInt();
            System.out.print("b: ");
            int b=scanner.nextInt();
            System.out.print("b: ");
            int c=scanner.nextInt();
            scanner.nextLine();
            System.out.print("sonuc: "+toplama(a,b,c));
            
            }
            else {System.out.println("bu deger icin metod bulunmuyor :");}
            
     }
             else if(islem.equals("3"))
                    {
                        System.out.print("bolme islemini sectiniz");
                        System.out.print("a: ");
                        double a=scanner.nextDouble();
                        System.out.print("b: ");
                        double b=scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("sonuc: "+bolme(a,b));
                    }
             else if(islem.equals("4"))
             {
                 System.out.println("carpma islemini sectiniz \nkac islem yapmak istersiniz?(2 veya 3)");
                 int kacislem=scanner.nextInt();
                 if (kacislem==2)
                 {
                     System.out.print("a: ");
                     int a=scanner.nextInt();
                     System.out.print("b: ");
                     int b=scanner.nextInt();
                     scanner.nextLine();
                     System.out.println("sonuc: "+carpma(a,b));
                 }
                 else if(kacislem==3)
                 {
                     System.out.print("a: ");
                     int a=scanner.nextInt();
                     System.out.print("b: ");
                     int b=scanner.nextInt();
                     System.out.print("c: ");
                     int c=scanner.nextInt();
                     scanner.nextLine();
                     System.out.print("sonuc: "+carpma(a,b,c));    
                 }
                 else { System.out.println("bu deger icin metod bulunmuyor : ");}
                 
             }
             else if(islem.equals("q"))
                     {
                         System.out.println("programdan cikis yapiliyor..");
                         break;
                     }
        }
    
    
    }
}
