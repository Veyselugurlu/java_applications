
public class yazilimci extends calisanlar {
    private String diller;
    
    public yazilimci(String ad,String soyad,int id,String diller){
    
    super(ad,soyad,id);
    this.diller=diller;
    
            }
    public void format_at(String isletim_sistemi){
    
        System.out.println(getAd() +""+isletim_sistemi+"ni yukluyor...");
    }

    @Override
    public void bilgileri_goster() {
       
        super.bilgileri_goster();
        System.out.println("yazilimcinin bildigi diller "+diller);
    }
    
}
