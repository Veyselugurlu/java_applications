
public class Problemler {
    public static class Matematik{
        
        public static void Daire_alan(int yaricap){
                System.out.println("daireni alani: "+(Math.PI*yaricap * yaricap ));
            }
            public static void Ucgen_cevre(int kenar1,int kenar2,int kenar3){
                System.out.println("ucgenin cevresi : "+(kenar1+kenar2+kenar3));
            }
        
        }
    
    public static class Fizik{
        
        public static void vektor(Vec vek1,Vec vek2){
          int icCarpim= (vek1.getI()*vek2.getJ()+ vek1.getJ()*vek2.getJ()+vek1.getK()*vek2.getK() );
            System.out.println(vek1.getIsim()+ " ile "+vek2.getIsim() + " in ic carpimi "+  icCarpim);
        }
        
        }
    
}
