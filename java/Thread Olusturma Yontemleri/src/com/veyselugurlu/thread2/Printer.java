
package com.veyselugurlu.thread2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Printer implements Runnable{  //extends ten faarki runnable interface i
//Runnable iterface 'ini implemente edersek ve run metodunu overrideedersek printer clasini  thread olarak kullnaablirz
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println("run metodu override edildi");
          System.out.println(isim+" calisiyor...");
        for (int i=1;i<10;i++){
        
            System.out.println(isim + " Sayiyor... "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread kesintiye ugradi...");
                }
        }
    }
    
    
    
}
