
public class Sayisal extends Aday{

public Sayisal(String isim, int edebiyat, int matematik, int inkilap, int fen){
super(isim, edebiyat, matematik, inkilap, fen);

}
       @Override
  public int puanHesapla() {
       
    return getEdebiyat()*3+getFen()*5+getInkılap()*5+getMatematik()*3;  //int oldu icin virgül kullanmıyoruz
       
    }

    
}
