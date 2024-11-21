// burda librarus e sağ clickk yaparız ordan add java folder diyip belgelerden java dosylarımının icine ordan daalmak istedigimiz
//projenin icine atariz (yolunu bulup) ondan sornada paket 2 icindeki matematik ve ımat ı main icinde ulasip kullnabiliriz 
//ve  kullanacagimiz paketi ekleyip kullnairiz!
import com.veyselugurlu.matematik.*; //boylece matematik paketindeki ı matematik ve matematik classlarini kullanabiliriz.

public class Main {
    public static void main(String[] args){
    
    Matematik matematik =new Matematik();
    matematik.bolme(10, 4);
    matematik.carpma(22, 2);
    matematik.cikarma(10, 5);
    matematik.toplama(5,5);
    }
}
