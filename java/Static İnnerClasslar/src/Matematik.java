
public class Matematik {
    private static double pi=Math.PI;   //baska sınıfta kuklanacagimiz iciin static metodunu kullandık 
    
    public static class Alan{
        
    public static void kare_alan(int kenar){
        System.out.println("karenin alani: "+(kenar*kenar));   
    }
    public static void daire_alan(int yaricap){
        System.out.println("daire alani: "+(yaricap*yaricap*pi));
    }
    } 
    }
