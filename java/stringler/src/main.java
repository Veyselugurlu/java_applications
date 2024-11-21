
public class main {
    public static void main(String[] args) {
       
       String a="merhaba\t";
 
    System.out.println(a+" hosgeldiniz...\n");
        String b="java";
        String c="\t programlamaya \n";   //** \t tab akadar bosluk birakir.
        String d="basliyoruz..";
        String toplam=a+b+c+d;
        System.out.println("<--> "+toplam +"<-->");
  //**************************************************
    String x="merhaba";
    int y=5;
    byte z=6;
    double v=21.23;
            
     x = x+y+z+v;    //burdaki x yeni atama artık x=merhaba degil merhaba5621.23 oldu
    System.out.println(x);
    //***********************************
    char w='?';
    String f="merhaba "
            + "nasilsiniz\n"
            +w;
     System.out.println(f);
            
    
    
    
    }
}
