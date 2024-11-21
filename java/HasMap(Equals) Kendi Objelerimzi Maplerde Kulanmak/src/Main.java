

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
 class Player{ //public eklemeyiz cunkuasıl clasimizin ismi main zaten public eklersek hata verir bir classta iki sinif olmaz public 
  
    private String isim;
    private int id;
    
    public Player(String isim,int id){
    this.isim=isim;
    this.id=id;
    }

    @Override
    public String toString() {
        return "|| id: "+id+ " isim "+isim;
    }

    @Override
    public int hashCode() {  
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.isim);
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.isim, other.isim);
    }
    
    
    
}

public class Main {
  
    
    public static void main(String[] args)
    {
   Set<Player> hashSet=new HashSet<Player>(); //player dememizizn sbebi baska bir  cplayer calsınna ulasmak icin
    /*  Set<String> hashSet=new HashSet<String>(); //set inteface inden bir hash map olustırduk 
    
    hashSet.add("veyso");
    hashSet.add("ali");   
    hashSet.add("veyso");
    for (String h: hashSet){
       System.out.println(h); //ikinci veysıyu yazmamasini nendini objenin oldugu class ta equals calisir ve ikisinin ayni oldugu dutumda yazmaz.
          
      }
        */
      Player player1=new Player("veysel",1);
      Player player2=new Player("ugurlu",3);
      Player player3=new Player("ali osman",2);
      
      
       Player player4=new Player("veysel",1);  
      
     hashSet.add(player1); //iceri player atadik cunku kendi olusturdugumuz objeyi kulanicaz 
     hashSet.add(player2);
     hashSet.add(player3);
     hashSet.add(player4);
     
     for(Player e: hashSet){ //hassetin paremetsesi olan playeri kullandik
         System.out.println(e); //sonucta ikiyane  id e ismi aynı olani yazdircak sebebi player clkasında bizim equals ve hashcode muz yok
         //bundan dıayi ikisiniz ayni oldugunuz anlamaz bu yuzden de bizm kendi hash kodumuzu ve equalsimizi olusrumamuz gerekiyoru 
    
     //!! euqals ve hash odu override ettikten sonra id ve ismi ayni olan veriyi almaz.. 
     }
    }
            }
