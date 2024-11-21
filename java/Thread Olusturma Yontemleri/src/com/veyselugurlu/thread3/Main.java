/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veyselugurlu.thread3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        
    
    
    Thread printer1=new Thread(new Runnable(){ //anonim thread olusturma yontemi 
        @Override
        public void run() {
            System.out.println("Thread calisiyor....");
            for (int i=1;i<5;i++){
                System.out.println("yaziyor "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Thread kesintiye ugradi");
                }
            }

        }
    
        });
    printer1.start();
        System.out.println("main thread calisiyor");
            }
}
