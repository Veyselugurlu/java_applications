/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veyselugurlu.thread2;

public class Main {
    public static void main(String[] args) {
        
          
    Thread printer1=new Thread(new Printer("Printer1")); //imolemente edilen runnable metodunun kullanim sekli  
    Thread printer22=new Thread(new Printer("Printer22"));
    printer1.start();
    printer22.start();
    
    }
}
