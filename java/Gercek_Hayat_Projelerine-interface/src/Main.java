
public class Main {
    public static void main(String[] args){
    SignUpManager signupmanager=new SignUpManager(new AgeUserCheckServices());//sign up manager bizden bir tane ı user manager sevis istiyor.
    User user=new User(1, "veysel ugurlu",19 );
    signupmanager.signUp(user);
    
    }
}
