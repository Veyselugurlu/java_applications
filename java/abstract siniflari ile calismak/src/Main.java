
public class Main {
    public static void main(String[] args) {
           CustomerManager customermanagers=new CustomerManager();//customeri diger classlara donusturur bu sayede veriyi alırız.
           customermanagers.databasemanager=new SglserverDatabaseManager();
           customermanagers.getCustomers();
    }
}
