
public class Main {
    public static void main(String[] args) {
        
       /*ıCustomerDal customerdal=new MySqlCustomerDal();
        customerdal.add();
        // burası ilk bolum du burdan osnraso interface ile ppolymorphisme geciyoruz
        ıCustomerDal customerDal2 = new OracleCustomerDal();// CUSTOMERDAL İLE AYNI İSİM KOYUNCA CALİSMAZ
        customerDal2.add();
        */
       
     //  CustomerManager customerManager=new CustomerManager();// bu birinci yol ikinci yol ise constructor ile yapılır
       //customerManager.customerDal = new MySqlCustomerDal();
       //customerManager.add();
       
        System.out.println("---- ikinci yol ----");
        
       CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());//parametre gidip constructorın oldugu customer dala esitler
       customerManager.add();
       
    }
    
}
