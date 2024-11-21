public class Kitap {
    private boolean onerilen;
    private boolean populermi;
    private String adi;
    private String yazar;
    private int sayfaSayisi;

    public String getAdi() {
        return adi;
    }

    public boolean isPopulermi() {
        return populermi;
    }

    public void setPopulermi(boolean populermi) {
        this.populermi = populermi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public boolean isOnerilen() {
        return onerilen;
    }

    public void setOnerilen(boolean onerilen) {
        this.onerilen = onerilen;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public Kitap(String adi, String yazar, int sayfaSayisi) {
        this.adi = adi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;

    }

    public Kitap(boolean onerilen, boolean populermi, String adi, String yazar, int sayfaSayisi) {
        this.onerilen = onerilen;
        this.populermi = populermi;
        this.adi = adi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                ",onerilen=" + onerilen +
                ", populermi=" + populermi +
                ",adi='" + adi + '\'' +
                ", yazar='" + yazar + '\'' +
                ", sayfaSayisi=" + sayfaSayisi +

                '}';
    }
}
