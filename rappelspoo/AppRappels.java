package rappelspoo;

import java.util.ArrayList;
import java.util.List;

public class AppRappels {
    public static void main(String[] args) {
        Chat albert = new Chat("Albert");
        Chien roberto = new Chien("Roberto");
        Souris rosie = new Souris("Rosie");

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

        // roberto.dormir();
        // roberto.manger();

        List<Animal> animaux = new ArrayList<>();
        List<Chasseur> chasseurs = new ArrayList<>();
        List<Proie> proies = new ArrayList<>();

        animaux.add(albert);
        animaux.add(roberto);
        animaux.add(new Chien("Norbert"));
        animaux.add(rosie);

        chasseurs.add(albert);
        chasseurs.add(roberto);

        proies.add(albert);
        proies.add(rosie);

        for (Animal animal : animaux) {
            System.out.println(animal.getNom());
            animal.dormir();
            animal.manger();
        }

        for (Chasseur chasseur : chasseurs) {
            chasseur.chasser();
        }

        for (Proie proie : proies) {
            proie.mourir();
        }
    }
}
