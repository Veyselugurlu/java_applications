
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
   class Player implements Comparable<Player>{ // interface i kullanir kullnamaz bir override etme soz konusu olucak cunku inteface :) 
    private String isim;
    private int ID;
    
    public Player(String isim, int ID){
    this.isim=isim;
    this.ID=ID;
    }

        @Override
        public String toString() {
            return "Player{" +ID+ "isim=" + isim + '}';
        }

        @Override
        public int compareTo(Player player) { //kucukten buyuge ayrladik siralamyi
        if(this.ID<player.ID){ //
            return -1;
        }
        else if(this.ID>player.ID){
        return 1;
        }
return 0;
        }
    
    
    }

public class Main {
    
 
    
    public static void main(String[] args){
 /*  List<String> list_String=new ArrayList<String>(); //burda yanı calsın icinden oldugu icin sıralam yapıp karsilastirma islemi rahat rahat
   //yapabidik ancak kendi clasından olmayan playeri aldigmizda kod hata verir sebebi ise baska clasin icinde olup compare metodunu kullanmamiz 
    
    list_String.add("veysel");
    list_String.add("ugurlu");
    list_String.add("ali");
    list_String.add("emre");
            Collections.sort(list_String);
            for(String s: list_String){
                System.out.println(s);
            }
            */ 
   /*    List<Player> list_player=new ArrayList<Player>(); //kendi olusturdugumuz objeyi siralama
        list_player.add(new Player("murat", 3));
        list_player.add(new Player("veysel", 1)); 
        list_player.add(new Player("emre", 5));
        list_player.add(new Player("mehmet", 8));
    
       
        Player p1=new Player("murat",3);
        Player p2 =new Player("veysel", 1);
        Collections.sort(list_player);
        System.out.println(p1.compareTo(p2)); //p1 ve p2 yi karsilastirma islemi yukardaki if e atar this. id butyukse 1 degilse -1 dondurur
        for(Player p : list_player){ // id e gore siralama
            System.out.println(p); //siralama
            System.out.println("*********"); */ 
            Set<Player> treeset=new TreeSet<Player>(); //treeset olarak siralama
            treeset.add(new Player("veysel", 4));
            treeset.add(new Player("emre", 5));
            treeset.add(new Player("mehmet", 8));
                for (Player tree: treeset){
                    System.out.println(tree);
            }
        }
    }

