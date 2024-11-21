package com.klu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class labexam0801s {

    public static int division (int numerator,int denomiantor) throws ArithmeticException{


        return numerator/denomiantor;
    }

    public static  void throwException() throws Exception{
        try {
            System.out.println("Method throwexception");
            throw new Exception();
        }
        catch (Exception ex){
            System.err.printf("\n Exception 2 %s\n",ex);
            throw new Exception();

        }
        finally {
            System.out.println("Finally blok throwex method");
        }

    }
    public static  void notthrowException() {
        try {
            System.out.println("Method notthrowexception");
            ;
        }
        catch (Exception ex){
            System.err.printf("\n Exception at notthrow %s\n",ex);
        }
        finally {
            System.out.println("Finally blok notthrowex method");
        }
        System.err.println("Test notthrow");
    }

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);

            try
            {
                throwException();
            }
            catch (Exception ex){

                System.out.println("Exception handling in main " + ex.getMessage() + " " + ex.getStackTrace());
            }
            notthrowException();
        /*
        boolean loop=true;
        do {
            try {
                System.out.println("Lütfen payda değerini giriniz");
                int payda = klavye.nextInt();

                System.out.println("Lütfen pay değerini giriniz");
                int pay = klavye.nextInt();


                int sonuc = division(payda, pay);
                System.out.printf("\n Sonuç %d / %d = %d\n", payda, pay, sonuc);
                loop = false;
            }
            catch (InputMismatchException iex){
                System.out.printf("\n Hata : %s",iex);
                klavye.nextLine();
                System.out.println("Lütfen tekrar teneyin");
            }
            catch (ArithmeticException aex){
                System.out.printf("\n Hata : %s",aex);
                klavye.nextLine();
                System.out.println("Lütfen tekrar teneyin");
            }
            finally {
                System.out.println("Finally block performed");
            }
        }
        while(loop);
*/
    }
}
