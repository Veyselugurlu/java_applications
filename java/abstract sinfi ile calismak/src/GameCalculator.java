
public abstract class GameCalculator {
    
    public abstract void hesapla();// abstract kullanırken süslü parentezi kaldırıp ; koyarız +abstract diger kulalnıcılar icinde hesapa 
//metodu olmasıı sağkar override ederk 
  
    public final void gameover(){ //final sayesinde gameCaşculatoru kullanırken override edilmez 
        System.out.println("oyun bitti..");
    }    
    
    public final void seviyeatla(){
        System.out.println("Tebrikler seviye atladiniz...");
    }    
        
    
}
