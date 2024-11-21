
package com.veyselugurlu.thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Printer extends Thread{ //thread clasından extend edersel thread clası elde ederiz!!!!
  
   // printer clasımızın thread gibi davranmasi icin thread classıdan bir metod override etmemiz gerekiyor.
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() { //override ettigimiz run metopdu ayri bir thread gibi calisiyor
        System.out.println(isim+" calisiyor...");  
        
        for (int i=1;i<10;i++){
            System.out.println(isim+ " yaziyor. " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread Kesintiye Ugradi...");
                
            }
        }
        System.out.println(isim+" isini bitirdi.."); 
        
        
         /* birde implement iken ki kullanim seklini gorelim */
    }
    
}
    
