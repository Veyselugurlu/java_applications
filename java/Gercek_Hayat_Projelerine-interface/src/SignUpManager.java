
public class SignUpManager {
    private IUserCheckServices IUserCheckServices;
    
    public SignUpManager(IUserCheckServices iUserCheckServices){
    this.IUserCheckServices=iUserCheckServices;
    }
    
    public void signUp(User user){
        if(IUserCheckServices.checkservis(user)==true){
            System.out.println("kullanici kayit islemleri tamamlandi");
        }
        else
        {
            System.out.println("kullanici kayit islemi tammalandmadi yeterli olmayan bilgilerinzi var ");
        }
        
        
      
        
    }
}
