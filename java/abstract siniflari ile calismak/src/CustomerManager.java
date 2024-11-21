
public class CustomerManager {

  BaseDataBaseManager databasemanager;// bu atamanın sebebi extendlerden dataya ulasmak
    
    public void getCustomers(){
    databasemanager.getData();
    }
    
    
}
