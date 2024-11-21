//bizim calisanimiz
public class Worker implements IWorkable,IEatble,IPayable{
    public void work(){
        System.out.println("calisanlar calisiyor");
       
    }
    public void Robot(){
        System.out.println("robotlar calisiyor");
    }
    
    public void eat(){
        System.out.println("sirket calisanlari yemek yiyiyor...");
               
    }
    public void odeme(){
        System.out.println("odeme islemleri tamamlandi..");
       
    }
}
