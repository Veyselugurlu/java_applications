
public abstract class Aday {
    private String isim;
    private int edebiyat;
    private int matematik;
    private int inkilap;
    private int fen;

    public Aday(String isim, int edebiyat, int matematik, int inkilap, int fen) {
        this.isim = isim;
        this.edebiyat = edebiyat;
        this.matematik = matematik;
        this.inkilap = inkilap;
        this.fen = fen;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getInkılap() {
        return inkilap;
    }

    public void setInkılap(int ınkılap) {
        this.inkilap = inkilap;
    }

    public int getFen() {
        return fen;
    }

    public void setFen(int fen) {
        this.fen = fen;
    }
    
    abstract int puanHesapla();
    
    
}
