
public class Dragon extends Beyblade{
    private String gizli_yetenek;
    private String kutsal_canavar;
    public Dragon(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsal_canavar,String gizli_yetenek) {
        super(beybladeci, donus_hizi, saldiri_gucu);
        this.kutsal_canavar=kutsal_canavar;
        this.gizli_yetenek=gizli_yetenek;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("kutsal canavar adi: "+kutsal_canavar);
        System.out.println("gizli yetenek: "+gizli_yetenek);
    }

    @Override
    public void kutsal_canavari_ortaya_cikar() {
         System.out.println(getBeybladeci()+" i "+kutsal_canavar+" i ırtaya cikariyor...");
         System.out.println(getBeybladeci()+" nin gizli saldirisi : Hayalet kasirga");
    }
    
}
