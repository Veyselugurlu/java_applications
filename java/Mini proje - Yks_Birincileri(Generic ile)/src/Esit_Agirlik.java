
public class Esit_Agirlik extends Aday{

    public Esit_Agirlik(String isim, int edebiyat, int matematik, int inkilap, int fen) {
        super(isim, edebiyat, matematik, inkilap, fen);
    }

    @Override
    int puanHesapla() {
         return getEdebiyat()*5+getFen()*2+getInkılap()*4+getMatematik()*5;  //int oldu icin virgül kullanmıyoruz
    }
    
}
