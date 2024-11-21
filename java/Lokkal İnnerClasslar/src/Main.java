
public class Main {
    private static double pi=Math.PI;
    public static void main(String[] args){
    
    class Alan{
        void kare_hesapla(int kenar){
            System.out.println("karein alani: "+(kenar*kenar));
       } 
        void daire_hesapla(int yaricap){
            System.out.println("dairenin alani: "+(yaricap*yaricap*pi)); 
       }
       }
    Alan alan=new Alan();
    alan.kare_hesapla(5);
    alan.daire_hesapla(5);
    }
}
