
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GrafikKullanimi extends JPanel {

    public GrafikKullanimi() { //bunu kullandiktan sorna jpaneli olusturmus oluyoruz 
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.setColor(Color.red);
        g.drawRect(100, 200, 30, 30);
        g.setColor(Color.BLUE);
        g.fill3DRect(100, 100, 20,30, true);
        
        
        g.drawOval(200, 400, 50,50);
        g.setColor(Color.yellow);
        g.fillOval(50,50,50, 50); //ici dolu
        
        g.drawLine(10, 60, 500, 500); //baslangic noktası 10'a'10 bitis noktası koordinat duzleminde 500'e 5000
    }

    
    
}
