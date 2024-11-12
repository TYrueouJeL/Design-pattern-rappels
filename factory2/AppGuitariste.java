package factory2;

public class AppGuitariste {
    public static void main(String[] args) {
        GuitaristeFactory factory = new GuitaristeFactory();
        Guitariste guitariste = factory.createGuitariste();
        guitariste.jouer();
    }
}
