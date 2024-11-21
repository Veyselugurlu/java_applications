
public class AgeUserCheckServices implements IUserCheckServices{
    //intterface i burda kulnnadigimiz da neseleri soyutlayarak is dah klay hale gelir 
    //eger interface kullnamasak gerçek haytatta karsilasacagimiz bir sırun da mesealaa age user check servis bolumnde kullandigimiz 
    //objeleri tek tek degistirmek zorunda kalicaktk isin daha kolay halden tek bir yerden devamliliginiz sağlamak icin interface kullandik
   ; 
   
    @Override
    public boolean checkservis(User user) {
        if(user.getAge()>18){
            return true;
        }
        else{
            return false;
        }
    }
}
