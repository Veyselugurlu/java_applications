
public class Inek implements HayvanOzellikleri {

    @Override
    public void konustur() {
        System.out.println("Inek Konusuyor.(MOO MOO MOO!)");
    }

    @Override
    public void besle() {
        System.out.println("Inek Inek Yemi ile Besleniyor...");
    }

    @Override
    public void otur() {
        System.out.println("Inek Oturuyor...");
    }
}
