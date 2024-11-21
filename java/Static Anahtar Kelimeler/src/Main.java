
public class Main {
    public static void main(String[] args){
    
        Seyirci seyirci=new Seyirci("ali ");
        Seyirci seyirci2 =new Seyirci("veysel ");
        seyirci2.oyun_seyret();
        seyirci.oyun_seyret();
        System.out.println(Seyirci.getseyirci_sayisi());    //static olmsaydı erisemezdik 
        System.out.println(seyirci.getseyirci_sayisi());    //statice gerek yok cunkü zatem objesi olursturulmus.
        System.out.println(seyirci2.seyirci_sayisi);
        selamla();
    }
    
        //mesela buraya void li bi fonksiyon acip onu cagirirsak hata verir static olmadaan cagiramayiz.
    public static void selamla(){
        System.out.println("selamin aleykum...");
    }
}
