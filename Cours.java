/**
 * 28/09/2016
 * @author raphael
 */
class Cours {
//variables
    private String nom;
    private Professeur prof;
    private Double valeurCours;
    private Double note=-1.;
//Constructeurs
    Cours() throws Exception  {
        this("cours",.2);
    }
    Cours(String nom,Double valeurCours) throws Exception  {
        setNom(nom);
        setProf(new Professeur());
        setValeurCours(valeurCours);
    }
    Cours(String nom,Double valeurCours,Double note) throws Exception  {
        this(nom, valeurCours);
        setNote(note);
    }
    Cours(String nom,String nomProf,Double valeurCours) throws Exception  {
        this (nom,valeurCours);
        setProf(new Professeur(nomProf));
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
    
    public Professeur getProf() {
        return prof;
    }
    public void setProf(Professeur prof) throws Exception {
        if (nom.equals("")) {
            throw new Exception("Aucun professeur n'a ete enregistre");
        } else {
            this.prof = prof;
        }
        
    }

    public Double getValeurCours() {
        return valeurCours;
    }
    public void setValeurCours(Double valeurCours) throws Exception  {
        if (0 <= valeurCours && valeurCours <= 1) {
            this.valeurCours = valeurCours;
        } else {
            throw new Exception("La ponderation du cours est invalide (il n'est pas entre 0 et 1)");
        }
    }
        
    
    public Double getNote() {
        return note;
    }
    public void setNote(Double note) throws Exception  {
        if (0 <= note && note <= 100) {
            this.note = note;
        } else {
            throw new Exception("La note du cours est invalide (il n'est pas entre 0 et 100)");
        }
    }
    
//méthodes autres

    /**
     * @return the nomCours
     */
    


    
}
