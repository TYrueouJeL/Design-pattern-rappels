package rappelspoo;

public class Chien extends Animal {
    public Chien(String nom) {
        super(nom);
        System.out.println("CREATION DU CHIEN " + nom);
    }

    public Chien() {
        super("- PAS DE NOM -");
        System.out.println("CREATION D'UN CHIEN SANS NOM");
    }

    @Override
    public void dormir() {
        // super.dormir();
        System.out.println("Le Chien dort ...");
    }

    @Override
    public void manger() {
        System.out.println("Le chien mange ...");
        
    }
}
