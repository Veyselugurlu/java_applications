
public class Araba {
    private String model ;
    private String motor;
    private String renk;
    private int tekerlek;
    private int kapi;
    
         public void setmodel(String model){
    
         this.model=model; 
    }
   
            public String getmodel(){
            return this.model; 
    }
   
             public void setmotor(String motor){
             this.motor=motor;    
    } 
             public String getmotor(){
             return this.motor; 
   }
  
             public void setrenk(String renk){
                 this.renk=renk;
   }
             public String getrenk(){
             return this.renk;
             }
            
             public void settekerlek(int tekerlek){
             this.tekerlek=tekerlek; 
             }
             public int gettekerlek(){
             return this.tekerlek;
             }
             
             public void setkapi(int kapi){
                 if(kapi<0){System.out.println("kapi sayisi 0'dan kucuk olamaz");}
                 else
                 {this.kapi=kapi;}
             }
             public int getkapi(){
             return this.kapi;
             }
    }

