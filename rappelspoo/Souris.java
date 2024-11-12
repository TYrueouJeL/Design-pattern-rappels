package rappelspoo;

public class Souris extends Animal implements Proie {
    public Souris(String nom) {
        super(nom);
        System.out.println("CREATION DE LA SOURIS " + nom);
    }

    public Souris() {
        super("- PAS DE NOM -");
        System.out.println("CREATION D'UN SOURIS SANS NOM");
    }

    @Override
    public void dormir() {
        // super.dormir();
        System.out.println("La Souris dort ...");
    }

    @Override
    public void manger() {
        System.out.println("La Souris mange ...");
        
    }

    @Override
    public void mourir() {
        System.out.println("La souris ... (gg ez skill issue)");
    }
}
