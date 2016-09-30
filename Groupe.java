import java.util.ArrayList;

/**
 *  28/09/2016
 * @author Raphael
 */
public class Groupe {
    //Variables
    private String nomGroupe;
    private ArrayList<Eleve> tabEleve;
    
    //Constructeurs
    public  Groupe(){
        this("Groupe X");
    }
    public Groupe(String nom, Eleve eleve){
        this(nom);
        addEleve(eleve);
    }
    public Groupe(String nom){
        setNomGroupe(nom);
    }
    
//Accesseur-Mutateurs (GET-SET)
    public String getNomGroupe() {
        return nomGroupe;
    }
    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }
    
    public ArrayList<Eleve> getTabEleve() {
        return tabEleve;
    }
    public void setTabEleve(ArrayList<Eleve> tabEleve) {
        this.tabEleve = tabEleve;
    }
//méthodes autres
    public void addEleve(Eleve eleve){
        if(getTabEleve().size()<Etablissement.ELEVES_PAR_GROUPE){
            getTabEleve().add(eleve);
        }
        else{
            Etablissement.addGroupe(eleve);
        }
    }
    
    public ArrayList<Eleve> listeEleve(){
       ArrayList<Eleve> liste = new ArrayList<Eleve>();
        for(Eleve e:tabEleve){
            liste.add(e);
        }
        return liste;
    }

}
