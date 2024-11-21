
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class AnaEkran extends JFrame{

    public AnaEkran(String title) throws HeadlessException {
        super(title);
    }
    
    public static void main(String[] args){
    GrafikKullanimi grafik =new GrafikKullanimi(); //jpanel
     
    AnaEkran ekran = new AnaEkran(" Grafik Kullanımı "); //kendi jframe'mizi olusrturduk
    ekran.setVisible(true);  
    ekran.setResizable(true); //genisletilebilir ekran
    ekran.setSize(800,600); 
    ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    
    ekran.add(grafik);
    }
}
