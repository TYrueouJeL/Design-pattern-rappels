package factory2;

public class Guitariste {
    private Guitare guitare;
    private Ukulele ukulele;

    public Guitariste(Guitare guitare, Ukulele ukulele) {
        this.guitare = guitare;
        this.ukulele = ukulele;
    }

    public void jouer() {
        System.out.println("Je suis un guitariste");
        guitare.son();
        ukulele.son();
    }
}
