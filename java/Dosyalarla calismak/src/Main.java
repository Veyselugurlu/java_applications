
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
       createfile();
        System.out.println("-----------------------------");
       getFileİnfo();
       readFile();
        System.out.println("------------------------------");
       writeFile();
    }
    public static void createfile(){
    File file =new File("C:\\Users\\Veyse\\Documents\\JAVA\\files\\students.txt");//dosya yolunu ekledik
    try
    {
    if(file.createNewFile()){//dosya olusturu
    
        System.out.println("Dosya olusturuldu");
    }
    else
    {
        System.out.println("Dosya zaten mevcut...");
    }
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
    }
    public static void getFileİnfo(){ 
        File file =new File("C:\\Users\\Veyse\\Documents\\JAVA\\files\\students.txt");
        
    if(file.exists()){//eger varsa ismi true deger dondurur
        System.out.println("dosya adi: "+file.getName());
        System.out.println("dosya yolu: "+file.getAbsolutePath());
        System.out.println("dosya yazilabilirmi : "+file.canWrite());
        System.out.println("dosya okunabilirmi : "+file.canRead());
        
    }
    
    }
    public static void readFile(){//dosya okuma 
     File file =new File("C:\\Users\\Veyse\\Documents\\JAVA\\files\\students.txt");
    try{
    Scanner reader=new Scanner(file);
    while(reader.hasNextLine()){//eğer yeni satir varsaa oku
    String Line=reader.nextLine();
        System.out.println(Line);
    
    }
    }
    catch(FileNotFoundException e){
    e.printStackTrace();
    }
    }
    
    public static void writeFile(){
    try{
        BufferedWriter writer =new BufferedWriter(new FileWriter(("C:\\Users\\Veyse\\Documents\\JAVA\\files\\students.txt")));
        writer.newLine();
        writer.write("ahmet");
        System.out.println("dosya yazildi");
        writer.close();
    }
    catch(IOException e)
    {
    e.printStackTrace();
    }
    
    }
    
}

