
import java.util.*;

/**
 * 28/09/2016
 *
 * @author raphael
 */
public final class Etablissement {

    static String nomEcole = "Academie de RobberVals";
    static final int ELEVES_PAR_GROUPE = 10;
    static ArrayList<Groupe> tabGroupe;
    static String[] noms = {"Attentia", "Bonniveau", "Curviligni", "Donagan", "Erzellman", "Frenchmen", "Karato", "K'amon"};
    static String[] prenoms = {"Genghis", "Conan", "Sarmoulu", "Maurice", "Zarah", "Rolphi", "Ash", "ToutTemps"};
    static String[] dates = {"01-01-0001", "21-05-1982", "30-04-1213", "21-11-1395", "04-02-0999", "31-12-2012", "16-06-0654", "09-07-6000"};
    static Cours[] listeCours = {new Cours("Science", .2), new Cours("Math", .2), new Cours("Français", .3), new Cours("Informatique", .3)};

    public static void Etablissement() {
        addGroupe();
        for (int i = 0; i < 8; i++) {
            tabGroupe.get(0).addEleve(new Eleve(noms[i], prenoms[i], dates[i]));
        }
    }

    static Groupe addGroupe() {
        String nom = "groupe " + tabGroupe.size();
        Groupe groupe = new Groupe(nom);
        tabGroupe.add(groupe);
        return groupe;
    }

    static Groupe addGroupe(Eleve eleve) {
        Groupe groupe = addGroupe();
        groupe.addEleve(eleve);
        return groupe;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(Etablissement.tabGroupe);
        }

    }

}

