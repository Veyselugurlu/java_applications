public  class Main {
    public static void main(String[] args){
   
    
   GameCalculator mangamecalculator=new ManGameCalculator(); //newden sonra kullandığımız clasx base classınkini yazdık(10)
  
   mangamecalculator.hesapla();
   System.out.println("----------------");
   
   GameCalculator womengamecalculator=new WomenGameCalculator();
   womengamecalculator.hesapla();
   womengamecalculator.gameover();
   
   System.out.println("----------------");
   OlderGameCalculator oldergamecalculator=new OlderGameCalculator();
      
   oldergamecalculator.gameover();
   
   
    }
}
