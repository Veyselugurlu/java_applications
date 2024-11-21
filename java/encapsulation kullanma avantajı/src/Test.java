
public class Test {
    public static void main(String[] args){
        
  /*  Abone abone= new Abone();
    abone.isim="mutafa";
    abone.bakiye=157;
    abone.sehir="istanbul";
    abone.dogalgaz_kullan(158);
    */
  Gelismis_abone abone=new Gelismis_abone("veysel ugurlu", 157, "sehir");//bir diger farkı burda objeye degerr verme isim olur bakiye burda veriyoruz
  abone.bakiye_ogren();
  abone.dogalgaz_kullan(100);
}
}