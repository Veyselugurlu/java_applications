
public class veri_tipleri {
    public static void main(String[] args) {
        //byte-->int-->short-->long
        //byte 8 bit
        //int 32 bit/ 4 byte
        //short 16 bit 3 byte
        //long yüksek
       int a=5;
        long b=5;
         System.out.println(Long.MAX_VALUE);
         System.out.println(Long.MIN_VALUE);
         System.out.println(Integer.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE);
         byte c=6;
         byte d=(byte)(c/2);//paarntez icinde byte yazmamizin sebebi byte donusturmek icin intgereri (2 bizim int deger)
         System.out.println(d);
         
         
    }
}
