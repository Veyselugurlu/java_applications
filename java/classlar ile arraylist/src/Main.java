
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
     ArrayList<Customer> customers=new ArrayList<Customer>();//dizi oluturduk 
     
    Customer engin=new Customer(1,"engin","altan");//engini silebilmek için engin adında objeye cevirdik açtık 
    customers.add(engin);
   
    customers.add(new Customer(2,"veysel","ugurlu"));
    customers.add(new Customer(3,"veysoo","vey"));
    customers.remove(engin);
    
    for(Customer customer:customers){
        
        System.out.println(customer.firtsname);
               System.out.println(customer.id);
        
    }
    
    }
}
