
public class idman {
    private int burpeesayisi;
    private int pushupsayisi;
    private int situpsayisi;
    private int squatsayisi;

    public idman(int burpeesayisi, int pushupsayisi, int situpsayisi, int squatsayisi) {
        this.burpeesayisi = burpeesayisi;
        this.pushupsayisi = pushupsayisi;
        this.situpsayisi = situpsayisi;
        this.squatsayisi = squatsayisi;
    }

    public int getBurpeesayisi() {
        return burpeesayisi;
    }

    public void setBurpeesayisi(int burpeesayisi) {
        this.burpeesayisi = burpeesayisi;
    }

    public int getPushupsayisi() {
        return pushupsayisi;
    }

    public void setPushupsayisi(int pushupsayisi) {
        this.pushupsayisi = pushupsayisi;
    }

    public int getSitupsayisi() {
        return situpsayisi;
    }

    public void setSitupsayisi(int situpsayisi) {
        this.situpsayisi = situpsayisi;
    }

    public int getSquatsayisi() {
        return squatsayisi;
    }

    public void setSquatsayisi(int squatsayisi) {
        this.squatsayisi = squatsayisi;
    }
    
    public void hareketyap(String hareketTuru,int sayi){
    
    if(hareketTuru.equals("Burpee")){
    Burpeeyap(sayi);
    
    }
    else if(hareketTuru.equals("Pushup")){
    
    Pushupyap(sayi);
    }
    else if(hareketTuru.equals("Situp")){
    
    Situpyap(sayi);
    
    }
    else if(hareketTuru.equals("Squat")){
    
    Squatyap(sayi);
    }  
}
     public void Burpeeyap(int sayi){
        if(burpeesayisi==0)
        {
             System.out.println("yapıcak burpee hareketi kalmadi... ");}
             if(burpeesayisi-sayi<0){
             System.out.println("hedeflenen burpee sayisini gectiniz Tebrikler");
             burpeesayisi=0;
             System.out.println("kalan burpee sayisi: "+burpeesayisi);
     }
         else {
             burpeesayisi-=sayi;
             System.out.println("kalan burpee sayisi: "+burpeesayisi);
                 }
     }
     
      public void Pushupyap(int sayi){
             if(pushupsayisi==0){System.out.println("yapılacak pushup hareketi kalmadı tebrikler..");}
             if(pushupsayisi-sayi<0){
             System.out.println("hedeflenen pushup sayisini gectiniz Tebrikler");
             pushupsayisi=0;
              System.out.println("kalan pushup sayisi: "+pushupsayisi);
     }
         else {
             pushupsayisi-=sayi;
             System.out.println("kalan pushup sayisi: "+pushupsayisi);
                 }
     }
       public void Situpyap(int sayi){
             if(situpsayisi==0){System.out.println("yapılacak situp hareketi kalmadı tebrikler..");}
             if(situpsayisi-sayi<0){
             System.out.println("hedeflenen situp sayisini gectiniz Tebrikler");
             situpsayisi=0;
             System.out.println("kalan situp sayisi: "+situpsayisi);
     }
         else {
             situpsayisi-=sayi;
             System.out.println("kalan situp sayisi: "+situpsayisi);
                 }
     }
        public void Squatyap(int sayi){
             if(squatsayisi==0){System.out.println("yapılacak squat hareketi kalmadi");}
             if(squatsayisi-sayi<0){
             System.out.println("hedeflenen squat sayisini gectiniz Tebrikler");
             squatsayisi=0;
             System.out.println("kalan squat sayisi: "+squatsayisi);
     }
         else {
             squatsayisi-=sayi;
             System.out.println("kalan squat sayisi: "+squatsayisi);
                 }
     }
        
       public boolean idmanbittimi(){
       
       return(burpeesayisi==0) && (pushupsayisi==0) && (situpsayisi==0) && (squatsayisi==0);
       }
     
}