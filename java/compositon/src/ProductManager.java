
public class ProductManager {
    public static void add(Product product){
    
    //ProductValidator validator=new ProductValidator();//bunu kullanmaıp ststic kullamrak yapabilirz
    if(ProductValidator.isValid(product)){//validator silip  yerine static kullanarak pruduct validator.
        //isvalid kullanılabilir static sayesinde
        //ststic kullanırken örneğin web programlamada bütün kullanıcılar bir 
        //kere kullanır ststic program sıdfırlanana kadar uyguşlamadan atılmaz
        //staticler classs ismi ile cagirilir
        System.out.println("eklendi...");    
    }
    else {
        System.out.println("ürün bilgileri gecersizdir...");
    }
    ProductValidator productValidator=new ProductValidator();
    productValidator.bisey();
    }
}
