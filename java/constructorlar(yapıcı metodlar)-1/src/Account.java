
public class Account {
    private String ad;
    private String hesapno;
    private String telno;
    private double bakiye;
    private String email;
       public Account(String ad,String hesapno,String telno){
    this(ad,hesapno,telno,0.0,"bilgiyok");
    
    }

  public Account(String ad, String hesapno, String telno,double bakiye, String email){
    this.ad=ad;
    this.bakiye=bakiye;
    this.telno=telno;
    this.hesapno=hesapno;
    this.email=email;
    }
    
    public void setad(String ad){
    this.ad=ad;
}
    public String getad(){
    
    return ad;
    }
    public void sethesapno(String hesapno){
    this.hesapno=hesapno;
    }
    public String gethesapno(){
        return hesapno;
    }
    public void settelno(String telno){
    this.telno=telno;
    }
    public String gettelno(){
    return telno; 
    }
    public void parayatir(double miktar){
    bakiye+=miktar;
        System.out.println("yeni bakiye : "+bakiye);
    
    }
    public void paracekme(double miktar){
    bakiye-=miktar;
    if(miktar>1500){ System.out.println("gunluk 1500'tlden fazla cekemezsiz "); }
    else if(bakiye-miktar<0){
        System.out.println("bakiye yetersiz ,bakiye: "+bakiye); 
    }
    
    
    else{
    bakiye-=miktar;
        System.out.println("guncel bakiye: "+bakiye);
}
}
    public void setemail(String email){
    this.email=email;
}
    public String getemail(){
    return email;
      
}
public void bilgigoster(){

    System.out.println("hesap no: "+this.hesapno);
    System.out.println("bakiye: "+this.bakiye);
    System.out.println("ad: "+this.ad);
    System.out.println("telno: : "+this.telno);
    System.out.println("email: : "+this.email);
}
    
    }
