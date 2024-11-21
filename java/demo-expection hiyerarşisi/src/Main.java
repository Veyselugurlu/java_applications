
public class Main {
    
    public static void main(String[] args ){
    try{
   
        int[] sayilar=new int[]{2,3,4};
        
        System.out.println(sayilar[3]);   
    }
    
    catch(StringIndexOutOfBoundsException exception){//buna gitmiyor direl array index out of bounds'a gidiyor alakalı olömadigi için  
        System.out.println(exception);
    }
    
    catch(ArrayIndexOutOfBoundsException exception){ 
        
        System.out.println(exception);
    
    }
    
    catch(Exception exception){// array index out of bounds exceptions olmazsa bu çalısır ve loglar veri tababnı dan hatayi bulur.
        //array index out of bounds u kaldırdığımızda bu kod calisir.
        System.out.println("loglandi : "+exception);
    }
    
    finally{
        System.out.println("ben her turlu calisirim.");
    }  
    }
}
