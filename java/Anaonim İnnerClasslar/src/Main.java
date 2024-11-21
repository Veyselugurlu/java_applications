
public class Main {
    
    public static void main(String[] args){
    
        Ogrenci ogrenci =new Ogrenci() {
        public void ders_calis(){
            System.out.println("ders calisiyor...");
        }
        public void derse_gir(){
            System.out.println("derse giriliyor...");
        }
        };
           ogrenci.ders_calis();
           ogrenci.derse_gir();
           System.out.println("*****************************************");
           
           Aogrenci ogrenci2=new Aogrenci("veysel",1210505001){
               void kayit_yaptir(){
                   System.out.println(getIsim()+" adli "+getNo()+ " no'lu ogrencinin kaydi yapiliyor");
                   
               }
          
           };
           ogrenci2.kayit_yaptir();
    }
     public static abstract class Aogrenci{
         private String isim;
         private int no;

        public Aogrenci(String isim, int no) {
            this.isim = isim;
            this.no = no;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }
         
        abstract void kayit_yaptir();
        public void selamla()
        {
            System.out.println("selamin aleykum");
        }
    }
    
    
        public interface Ogrenci{
            void ders_calis();
            void derse_gir(); 
        }

}
