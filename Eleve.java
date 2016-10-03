
import java.util.*;

/**
 * 28/09/2016
 * @author raphael
 */
final class Eleve {
//variables
    private String nom, prenom,dateNaissance;
    private ArrayList<Cours> cours= new ArrayList<Cours>();
    
//Constructeur
    Eleve() throws Exception{
       this("Etychen","Paul","01-04-1999");
    }
    
    Eleve(String nom,String prenom,String dateNaissance) throws Exception{
        setNom(nom);
        setPrenom(prenom);
        setDateNaissance(dateNaissance);
        for(int i =0;i<getNbrCours();i++){
            addCours(Etablissement.listeCours[i]);
        }
    }

    Eleve(String nom, String prenom, String date, Cours[] listeCours) throws Exception{
        this(nom,prenom,date);
        for (int i =0; i<listeCours.length;i++){
            cours.add(listeCours[i]);
        }
    }
    
//Accesseur-Mutateurs (GET-SET)
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) throws Exception {
        if (nom.equals("")) {
            throw new Exception("Aucun nom n'a ete enregistre");
        } else {
            this.nom = nom;
        }
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) throws Exception {
        if (prenom.equals("")) {
            throw new Exception("Aucun prenom n'a ete enregistre");
        } else {
            this.prenom = prenom;
        }
        
    }

    public String getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(String dateNaissance) throws Exception{
        if (dateNaissance.length() == 8) {
            for (int i = 0; i < dateNaissance.length(); i++) {
                //Si le charactere est un chiffre, alors on ignore, sinon on lance une exception
                if (!Character.isDigit(dateNaissance.charAt(i))) {
                    throw new Exception("La date ne doit etre compose que de chiffres");
                }
            }
            this.dateNaissance = dateNaissance;

        } else {
            throw new Exception("Le format JJMMAAAA n'a pas ete respecte");
        }
        
        
        
        
    }

    public int getNbrCours() {
        return Etablissement.listeCours.length;
    }

    public ArrayList<Cours> getTabCours() {
        return cours;
    }
    public void setTabCours(ArrayList<Cours> cours) {
        this.cours = cours;
    }
    public void addCours(Cours cours) {
        this.cours.add(cours);
    }
    
//Autres méthodes
    public String codePermanent(){
        //DUchaine Raphael 29-04-1998 DR1998
        return getNom().substring(0,1)+getPrenom().substring(0, 1)+getDateNaissance().substring(6, 10);
    }

    double calculerNoteFinale() {
        double somme =0;
        for (int i=4;i<cours.size();i++){
            Cours my_cours = cours.get(i);
            somme +=(my_cours.getNote()*my_cours.getValeurCours());
        }
        return somme;
    }
    @Override
    public String toString(){ 
       return (nom+", "+prenom+", "+dateNaissance+", "+calculerNoteFinale()+"% "+codePermanent());
    }
    
}
