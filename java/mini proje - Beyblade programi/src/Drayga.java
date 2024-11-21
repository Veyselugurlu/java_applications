
public class Drayga extends Beyblade{
private String kutsalcanavar;
   
public Drayga(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsal_canavar) {
        
    super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsalcanavar=kutsal_canavar;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster(); 
        System.out.println("kutsal canavar adi : "+kutsalcanavar);
    }

    @Override
    public void kutsal_canavari_ortaya_cikar() {
        System.out.println(getBeybladeci()+" nin "+kutsalcanavar+" ini "+"ortaya cikariyor..");
        System.out.println(getBeybladeci()+" nin kaplan penceleri...");
    }
}
