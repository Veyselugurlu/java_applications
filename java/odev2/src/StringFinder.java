import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StringFinder {
    public static void main(String[] args) {
        HashMap<String, Integer> kelimeSayac = new HashMap<>();
        ArrayList<String> arananKelimeler = new ArrayList<>();
        Scanner dosyaOkuyucu;
        Scanner klavyeOkuyucu = new Scanner(System.in);

        // Dosya okuma
        try {
            dosyaOkuyucu = new Scanner(new File("alice_in_wonderland.txt"));
            while (dosyaOkuyucu.hasNext()) {
                String kelime = dosyaOkuyucu.next().toLowerCase().replaceAll("[^\\p{L}\\p{Nd}]+", "");
                if (!kelime.isEmpty()) {
                    kelimeSayac.put(kelime, kelimeSayac.getOrDefault(kelime, 0) + 1);
                }
            }
            dosyaOkuyucu.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi.");
            e.printStackTrace();
            System.exit(0);
        }

        // Aranan kelime listesi alma
        System.out.print("Aranacak kelimeleri giriniz (virgülle ayırın): ");
        String arananKelimelerStr = klavyeOkuyucu.nextLine();
        for (String kelime : arananKelimelerStr.split(",")) {
            arananKelimeler.add(kelime.trim().toLowerCase());
        }

        // Kelime sayılarını bulma
        for (String kelime : arananKelimeler) {
            int sayi = kelimeSayac.getOrDefault(kelime, 0);
            System.out.println("'" + kelime + "' kelimesi " + sayi + " kez tekrar etti.");
        }

        klavyeOkuyucu.close();
    }
}
