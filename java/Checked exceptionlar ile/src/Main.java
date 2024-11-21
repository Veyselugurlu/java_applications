
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    
     public static void main(String[] args) throws IOException{ //**throws IOException{//klasor atama yapmazsa finally'nin içine try daha atamamız lazım
         System.out.println("********** txt package secilecek");
         BufferedReader reader=null;
     
         int total=0;
        
     try{
    
         reader =new BufferedReader(new FileReader("C:\\Users\\Veyse\\Documents\\JAVA\\Checked exceptionlar ile\\test\\folder.txt"));
     
         String line = null;
    
     while((line=reader.readLine()) !=null){//burda thows ıoexpectionu ekliyoruz
     total+=Integer.valueOf(line);//stringin içindeki sayıları integere donusturup toplammamız saglar
     }
         System.out.println("toplam : "+total);
     }
     
     catch(FileNotFoundException e){

         e.printStackTrace();     
     }
     catch(NumberFormatException e){
     
         e.printStackTrace();
     }
     finally{
    try{
    
        reader.close();
    }
    catch( Exception expection){
        System.out.println(expection);
    }
    
     
             
     }     
     }

}