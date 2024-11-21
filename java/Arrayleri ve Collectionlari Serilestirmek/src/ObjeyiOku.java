
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku {
    public static void main(String[] args){
    try(ObjectInputStream in =new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){ 
        Ogrenci[] ogrenci_array=(Ogrenci[])in.readObject(); //objeyi ogrenci arrayine donsuturduk 
        ArrayList<Ogrenci> liste=(ArrayList<Ogrenci>)in.readObject();  //objeyi ogrenciliste donsuturduk
           
        for(Ogrenci o: ogrenci_array){  
            System.out.println(o);
              System.out.println("----------------------------------");
        }
     
        for(Ogrenci o:liste){
            System.out.println(o);
               System.out.println("---------------------------------");
        }
     
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(ObjeyiOku.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObjeyiOku.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjeyiOku.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
