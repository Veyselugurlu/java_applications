
import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args){
    
    Scanner scanner =new Scanner(System.in);
        System.out.println("Cumle Giriniz: ");
        String cumle=scanner.nextLine();
        
        Stack<Character> stack=new Stack<Character>();
        
        for(int i=0;i<cumle.length()/2;i++){
        stack.push(cumle.charAt(i));
        }
        if(isPolindrome(cumle, stack)){ 
            System.out.println("bu cumle polindromdur");
        }
        else{System.out.println("bu cumle polindrom degildir !!!");}
    
    }
     public static boolean isPolindrome(String cumle,Stack<Character> stack){
    for(int i=(cumle.length()/2) +1;i<cumle.length();i++ ){ 
    if(cumle.charAt(i)!=stack.pop()){
    return false;
    }
    }
    return true;
}
}
