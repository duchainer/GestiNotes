
import java.util.*;

/**
 * 28/09/2016
 *
 * @author raphael
 */
public final class Etablissement {

    static String nomEcole = "Academie de RobberVals";
    static final int ELEVES_PAR_GROUPE = 10;
    static ArrayList<Groupe> tabGroupe=new ArrayList<Groupe>();
    static String[] noms = {"Attentia", "Bonniveau", "Curviligni", "Donagan", "Erzellman", "Frenchmen", "Karato", "K'amon"};
    static String[] prenoms = {"Genghis", "Conan", "Sarmoulu", "Maurice", "Zarah", "Rolphi", "Ash", "ToutTemps"};
    static String[] dates = {"01-01-0001", "21-05-1982", "30-04-1213", "21-11-1395", "04-02-0999", "31-12-2012", "16-06-0654", "09-07-6000"};
    static Cours[] listeCours = {new Cours("Science", .2), new Cours("Math", .2), new Cours("Français", .3), new Cours("Informatique", .3)};

    public static void Etablissement() {

    }

    public static Groupe addGroupe() {
        int numero;
        if(tabGroupe==null){
           numero =0;
        }
        else{
            numero = tabGroupe.size();
        }
        Groupe groupe = new Groupe(numero);
        tabGroupe.add(groupe);
        return groupe;
    }

    public static Groupe addGroupe(Eleve eleve) {
        Groupe groupe = addGroupe();
        groupe.addEleve(eleve);
        return groupe;
    }


}

