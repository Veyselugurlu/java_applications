
public class InvalidAgeExcepiton extends ArithmeticException {    //invalid aexception olusruduk ( aritmed-tik exception oldugu için unchecked),
                                                                   //
    
    public InvalidAgeExcepiton(String message){ //invalide mesaj verdik
       super(message);
    }
    @Override
    public void printStackTrace(){   //override ettik
        System.out.println("bu bir invalid age hatasıdır");
    }
    
}
