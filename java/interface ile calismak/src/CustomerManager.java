// bu bölüm polymorphism icin acıldı ikinci bolum icin
public class CustomerManager {
    
    private ıCustomerDal customerDal;// ikinci bolumde erisimi engellemek icin private ekledik
    
    public CustomerManager(ıCustomerDal customerDal){// ikinci blum icin
    this.customerDal=customerDal;
    }
    public void add(){
    //is kodlari
       customerDal.add();
        
    }
}
