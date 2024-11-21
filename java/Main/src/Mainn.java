//aynini yazmamin sebebi balance insuffcent Exception kullanmamiz .
public class Mainn {
    public static void main(String[] args) throws Exception{
    
        AcoountManagerr manager=new AcoountManagerr();
            System.out.println("hesap: "+manager.getBalance());
            manager.deposit(100);
            System.out.println( manager.getBalance());
        try{
            manager.withdraw(5);
         
        }
        catch(BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
          System.out.println(" guncel hesap : "+manager.getBalance());
        try{
            manager.withdraw(15);         
   }
        catch(BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
   }  
        System.out.println("guncel hesap: "+manager.getBalance() );
    }
}
