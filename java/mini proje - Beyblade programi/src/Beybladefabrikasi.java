
public class Beybladefabrikasi {
    public Beyblade beyblade_uret(String beyblade_turu){
    
    if(beyblade_turu.equals("Dragon")){
        
        return new Dragon("takao", 800, 300, "mavi ejderha",  "kutsal canavarla konusma");
    }
    else if(beyblade_turu.equals("Dranza")){
       
        return new Dranza("kai", 600, 400,"kirmizi anka kusu");
    }
    else if(beyblade_turu.equals("Draciel")){
        
        return new Draciel("max", 800, 200, "kara kaplumbaga");
    }
    else if(beyblade_turu.equals("Drayga")){
        
        return new Drayga("rei", 800, 250, "beyaz kaplan");
    }
    else {return null;}
    }
}
