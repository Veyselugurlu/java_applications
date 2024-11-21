
public class ComplexUserCheckServices implements IUserCheckServices{
    
    @Override
    public boolean checkservis(User user){
        if(user.getAge()>18 &&user.getName().startsWith("ve")){
       return true;
    }
        else{
      return false;
    }
    }
}
