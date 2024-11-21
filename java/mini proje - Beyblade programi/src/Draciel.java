
public class Draciel extends Beyblade{
        private String kutsal_canavar;
        
    public Draciel(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsal_canavar) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsal_canavar=kutsal_canavar;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster(); 
        System.out.println("kutsal canavarin adi : "+kutsal_canavar);
    }

    @Override
    public void kutsal_canavari_ortaya_cikar() {
        System.out.println(getBeybladeci()+" i "+kutsal_canavar+" ini ortaya cikariyor...");
        System.out.println(getBeybladeci()+" nin saldirisi: kale savunmasi");
    }
    
    
}
