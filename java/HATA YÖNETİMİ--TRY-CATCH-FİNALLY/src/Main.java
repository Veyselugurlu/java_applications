
public class Main {
    public static void main(String[] args){
    try{//kodda hata varmı yok mu diye kontrol eder.
        int[] sayilar=new int[]{1,2,3,4};
        
        System.out.println(sayilar[5]);
    }
    catch(Exception exception)//kodda hata varsa buaya yonlendirilir .
    
    {
        System.out.println("hatalı");
    }
    finally{//ya try ya catch calisacagi icin finally her turlu calisir.
        System.out.println("ben her turlu calisirim");
    }
        }
}
