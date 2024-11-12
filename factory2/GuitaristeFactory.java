package factory2;

public class GuitaristeFactory {
    public Guitariste createGuitariste() {
        Guitare guitare = new Guitare();
        Ukulele ukulele = new Ukulele();
        return new Guitariste(guitare, ukulele);
    }
}
