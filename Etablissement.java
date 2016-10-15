
import java.util.*;

/**
 * 28/09/2016
 *
 * @author raphael
 */
public final class Etablissement {

    private static String nomEcole = "Academie de RobberVals";
    static final int ELEVES_PAR_GROUPE = 10;
    private static ArrayList<Groupe> tabGroupe=new ArrayList<Groupe>();
    static String[] noms = {"Attentia", "Bonniveau", "Curviligni", "Donagan", "Erzellman", "Frenchmen", "Karato", "K'amon"};
    static String[] prenoms = {"Genghis", "Conan", "Sarmoulu", "Maurice", "Zarah", "Rolphi", "Ash", "ToutTemps"};
    static String[] dates = {"01-01-0001", "21-05-1982", "30-04-1213", "21-11-1395", "04-02-0999", "31-12-2012", "16-06-0654", "09-07-6000"};
    static Evaluation[] listeCours = {new Evaluation("Science", .2), new Evaluation("Math", .2), new Evaluation("Français", .3), new Evaluation("Informatique", .3)};

//Constructeur
    public static void Etablissement() {

    }

//Accesseur-Mutateurs(GET-SET)
    public static String getNomEcole() {
        return nomEcole;
    }
    public static void setNomEcole(String aNomEcole) {
        nomEcole = aNomEcole;
    }

    public static ArrayList<Groupe> getTabGroupe() {
        return tabGroupe;
    }
    public static void setTabGroupe(ArrayList<Groupe> aTabGroupe) {
        tabGroupe = aTabGroupe;
    }

//Autres Méthodes
    public static Groupe addGroupe() {
        int numero;
        if(getTabGroupe()==null){
           numero =0;
        }
        else{
            numero = getTabGroupe().size();
        }
        Groupe groupe = new Groupe(numero);
        getTabGroupe().add(groupe);
        return groupe;
    }

    public static Groupe addGroupe(Eleve eleve) {
        Groupe groupe = addGroupe();
        groupe.addEleve(eleve);
        return groupe;
    }
    
    public static Eleve searchEleve(String code){
        Eleve eleve = null;
        for(Groupe g:getTabGroupe()){
            for(Eleve e:g.getTabEleve()){
                if(e.codePermanent().equals(code))
                    return e;
            }
        }
        return eleve;
    }

}

