
public class AcoountManagerr {
    private double balance;

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount){
    balance=getBalance()+amount;
    }
    public void withdraw(double amount) throws Exception{
    if(balance-amount>=0){
        balance=getBalance()-amount;
       
    }
    else{
    throw new Exception("bakiye yetersiz");
    }
    }
    
    
}
