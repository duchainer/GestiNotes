/**
 * 28/09/2016
 * @author raphael
 */
class Cours {
//variables
    private Professeur prof;
    private Double valeurCours;
    private Double note=-1.;
//Constructeur
    Cours(){
        setProf(new Professeur());
        setValeurCours(.2);
        
    }
    Cours(String nom,Double valeurCours){
        setProf(new Professeur(nom));
        setValeurCours(valeurCours);
        
    }
//Accesseur-Mutateurs (GET-SET)
    public Professeur getProf() {
        return prof;
    }
    public void setProf(Professeur prof) {
        this.prof = prof;
    }

    public Double getValeurCours() {
        return valeurCours;
    }
    public void setValeurCours(Double valeurCours) {
        this.valeurCours = valeurCours;
    }
    
    public Double getNote() {
        return note;
    }
    public void setNote(Double note) {
        this.note = note;
    }
    
//méthodes autres


    
}
