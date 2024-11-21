
public class main {
    public static void main(String[] args)
    {
    /* 
        -->+toplama operatörü
        -->-cıkarma operatörü
        -->%kalan   operatörü
        -->/bolme  operatörü
        -->*carpma  operatörü
      */
       /*System.out.println(3+2);
       System.out.println(3-2);
       System.out.println(3*2);
       System.out.println(3f/2);
       System.out.println(3%2);*/
       
  //    int a=1;
    //        a=a+3; artirma isleminin yapısisi.
        int a=3;
        a+=1;   //artirma operatoru
        a--;
        a--;  //buda azaltma operatoru
        a++;   //buda arttirma operatoru
        System.out.println(a++); //posfx gosterimidir guncellemez yani boyle kullandıgimiz icin direkt arttirmaz
        System.out.println(--a); //burda prefx gösterimi olarak adlandirilir
       int b=3;
       b=b*2;  
       b--;
       b*=2; 
       
       System.out.println(--b);  //burda prefx gösterimi olarak adlandirilir    
       System.out.println(3f/4+5);
    }
}
