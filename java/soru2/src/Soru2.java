import java.util.Arrays;

public class Soru2 {
    private int[] elemanlar;

    public int[] getElemanlar() {
        return elemanlar;
    }

    public void setElemanlar(int[] elemanlar) {
        this.elemanlar = elemanlar;
    }
    

    public Soru2(int[] elemanlar) {   
        this.elemanlar = elemanlar;
    }

    public int maksAciklik() {
        // Dizinin sıralanmış biçimdee farkını bulammız için bu metodu kullanırız.
        Arrays.sort(elemanlar);

        // Maksimum farkı bulur
        int maxFark = 0;
        for (int i = 1; i < elemanlar.length; i++) {
            int fark = elemanlar[i] - elemanlar[i - 1];
            if (fark > maxFark) {
                maxFark = fark;
            }
        }

// Maksimum farkı döndürür
        return maxFark;
    }


    public static void main(String[] args) {
      
        // obje oluşumu
        Soru2 maxFark = new Soru2(new int[]{21, 22, 10, 11});
        
        System.out.println("Dizimizin maximum farki: "+maxFark.maksAciklik());
       
    }
}