package rappelspoo;

import java.util.ArrayList;
import java.util.List;

public class AppRappels {
    public static void main(String[] args) {
        Animal albert = new Chat("Albert");
        Chat felix = new Chat();
        Chien roberto = new Chien("Roberto");
        Animal kevin = new Chien();

        // ((Chat)albert).setNom("Albert");
        
        // if (albert instanceof Chat) {
        //     Chat chat = (Chat)albert;

        //     chat.setNom("Albert");
        //     System.out.println("Le chat s'appelle " + chat.getNom());
            
        //     // ((Chat)albert).setNom("Albert");
        //     // System.out.println("Le chat s'appelle " + ((Chat)albert).getNom());
        // }

        // if (albert instanceof Chat chat) {
        //     chat.setNom("Albert");
        //     System.out.println("Le chat s'appelle " + chat.getNom());
        // }

        // albert.dormir();
        // albert.manger();

        // felix.dormir();
        // felix.manger();

        // roberto.dormir();
        // roberto.manger();

        // kevin.dormir();
        // kevin.manger();

        List<Animal> animaux = new ArrayList<>();

        animaux.add(albert);
        animaux.add(felix);
        animaux.add(roberto);
        animaux.add(kevin);
        animaux.add(new Chien("Norbert"));

        for (Animal animal : animaux) {
            System.out.println(animal.getNom());
            animal.dormir();
            animal.manger();
        }
    }
}
