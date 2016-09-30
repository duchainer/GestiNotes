
import java.util.*;

/**
 * 30/09/2016
 * @author raphael
 */
class Statistique {
    
    
    //Méthode pour calculer la moyenne
    public double calculerMoyenne(Groupe groupe){
        double somme=0;
        for(int count=0;count<=groupe.getTabEleve().size();count++){
            somme+=groupe.getTabEleve().get(count).calculerNoteFinale();
        }
        return somme/groupe.getTabEleve().size();
    }
    //Méthode pour calculer l'écart-type 
    public double calculerEcartType(Groupe groupe){
        double ecart = Math.sqrt(this.calculerVariance(groupe));
        return ecart;
    }
    
    //Méthode calculer variance 
    public double calculerVariance(Groupe groupe){
        double variance = 0;
        ArrayList<Eleve> tab = groupe.getTabEleve();
        for(int count=0;count<=groupe.getTabEleve().size();count++){
            variance += Math.pow((tab.get(count).calculerNoteFinale())-(this.calculerMoyenne(groupe)),2.) / tab.size();
        }
        return variance;
    }
    
}