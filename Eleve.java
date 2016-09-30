
import java.util.*;

/**
 * 28/09/2016
 * @author raphael
 */
class Eleve {
//variables
    private String nom, prenom,dateNaissance;
    private ArrayList<Cours> cours= new ArrayList<Cours>();
    
//Constructeur
    Eleve(){
       this("Etychen","Paul","01-04-1999");
    }
    
    Eleve(String nom,String prenom,String dateNaissance){
        setNom(nom);
        setPrenom(prenom);
        setDateNaissance(dateNaissance);
        for(int i =0;i<getNbrCours();i++){
            addCours(Etablissement.listeCours[i]);
        }
    }
    
//Accesseur-Mutateurs (GET-SET)
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getNbrCours() {
        return Etablissement.listeCours.length;
    }

    public ArrayList<Cours> getCours() {
        return cours;
    }
    public void setCours(ArrayList<Cours> cours) {
        this.cours = cours;
    }
    public void addCours(Cours cours) {
        this.cours.add(cours);
    }
    
//Autres méthodes
    public String codePermanent(){
        //DUchaine Raphael 29-04-1998 DR1998
        return getNom().substring(0,1)+getPrenom().substring(0, 1)+getDateNaissance().substring(6, 9);
    }

    double calculerNoteFinale() {
        double somme =0;
        for (int i=4;i<cours.size();i++){
            Cours my_cours = cours.get(i);
            somme +=(my_cours.getNote()*my_cours.getValeurCours());
        }
        return somme;
    }
    
}
