
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException{
    
        System.out.println("Ramazan Pidesi Programinaa Hosgeldiniz");
        Scanner scanner=new Scanner(System.in);
        System.out.println("cikarilicak pide sayisini giriniz ");
        int pide_sayisi=scanner.nextInt(); //1 ile 10 arasi pide cikarilcak
        
        Queue<String> queue=new LinkedList<String>();
        queue.offer("Veysel");
        queue.offer("Ugurlu");
        queue.offer("Mehmet");
        queue.offer("Ali");
        queue.offer("Ersin");
        queue.offer("Tekinel");
        queue.offer("Hasan");
        queue.offer("Emre");
        queue.offer("Ferhat");
        queue.offer("Salih");
        System.out.println("pideler cikiyor...");
        System.out.println("Cikan pide sayisi "+pide_sayisi);
        Thread.sleep(2000);
        
        while(pide_sayisi!=0){
            System.out.println(queue.poll()+" aldi cikiyor...");  //en bastaki alicak cikicak 
            Thread.sleep(1000);
       pide_sayisi--;
        }
        System.out.println("pide kalmadi...");
        
}}
