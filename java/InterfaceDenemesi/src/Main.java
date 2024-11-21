
import java.util.Scanner;

class HayvanYoneticisi
{
    public void konustur(HayvanOzellikleri hayvan)
    {
        hayvan.konustur();
    }
    
    public void besle(HayvanOzellikleri hayvan)
    {
        hayvan.besle();
    }
    
    public void otur(HayvanOzellikleri hayvan)
    {
        hayvan.otur();
    }
}



public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        HayvanOzellikleri hayvan = new Kopek();
        
        HayvanYoneticisi hy = new HayvanYoneticisi();
        
        String islemler = "1-Hayvan Konustur\n"
                + "2-Hayvan Besle\n"
                + "3-Hayvan Oturt\n"
                + "q-Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        String konustur = "1-Kopek'i Konustur\n"
                + "2-Kus'u Konustur\n"
                + "3-Inek'i Konustur\n"
                + "q-Konustur Sekmesinden Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        String besle = "1-Kopek'i Besle\n"
                + "2-Kus'u Besle\n"
                + "3-Inek'i Besle\n"
                + "q-Besle Sekmesinden Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        String oturt = "1-Kopek'i Oturt\n"
                + "2-Kus'u Oturt\n"
                + "3-Inek'i Oturt\n"
                + "q-Oturt Sekmesinden Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        while (true)
        {
            System.out.println("Hayvan Ozellikleri Programina Hos Geldiniz!!\n");
            System.out.print(islemler);
            String islem = scanner.nextLine();
            
            if(islem.equals("q"))
            {
                System.out.println("Sistemden Cikis Yapiliyor...");
                break;
            }
            else if (islem.equals("1"))
            {
                System.out.print(konustur);
                String lIslem = scanner.nextLine();
                
                if(lIslem.equals("1"))
                {
                    hy.konustur(new Kopek());
                }
                else if (lIslem.equals("2"))
                {
                    hy.konustur(new Kus());
                }
                else if (lIslem.equals("3"))
                {
                    hy.konustur(new Inek());
                }
                else if (lIslem.equals("q"))
                {
                    System.out.println("Konustur Sekmesinden Cikis Yapiliyor...");
                    break;
                }
            }
            else if (islem.equals("2"))
            {
                System.out.print(besle);
                String lIslem = scanner.nextLine();
                
                if(lIslem.equals("1"))
                {
                    hy.besle(new Kopek());
                }
                else if (lIslem.equals("2"))
                {
                    hy.besle(new Kus());
                }
                else if (lIslem.equals("3"))
                {
                    hy.besle(new Inek());
                }
                else if (lIslem.equals("q"))
                {
                    System.out.println("Besle Sekmesinden Cikis Yapiliyor...");
                    break;
                }
            }
            else if (islem.equals("3"))
            {
                System.out.print(oturt);
                String lIslem = scanner.nextLine();
                
                if(lIslem.equals("1"))
                {
                    hy.otur(new Kopek());
                }
                else if (lIslem.equals("2"))
                {
                    hy.otur(new Kus());
                }
                else if (lIslem.equals("3"))
                {
                    hy.otur(new Inek());
                }
                else if (lIslem.equals("q"))
                {
                    System.out.println("Oturt Sekmesinden Cikis Yapiliyor...");
                    break;
                }
            }
            
        }
        
    }
}
