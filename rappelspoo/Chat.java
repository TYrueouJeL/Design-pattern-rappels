package rappelspoo;

public class Chat extends Animal implements Chasseur, Proie {
    public Chat(String nom) {
        super(nom);
        System.out.println("CREATION DU CHAT " + nom);
    }

    public Chat() {
        super("- PAS DE NOM -");
        System.out.println("CREATION D'UN CHAT SANS NOM");
    }

    @Override
    public void dormir() {
        // super.dormir();
        System.out.println("Le chat dort ...");
    }

    @Override
    public void manger() {
        System.out.println("Le chat mange ...");
        
    }

    @Override
    public void chasser() {
        System.out.println("Le chat chasse ...");
    }

    @Override
    public void mourir() {
        System.out.println("Le chat meurt ... (gg ez skill issue)");
    }
}
