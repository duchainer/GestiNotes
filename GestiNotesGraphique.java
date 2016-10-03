
import javax.swing.JOptionPane;


//Classe de démarrage
public class GestiNotesGraphique {

    public static void main(String[] args) {
        try{
        Etablissement.addGroupe();
        for (int i = 0; i < 8; i++) {
            Etablissement.getTabGroupe().get(0).addEleve(
                    new Eleve(Etablissement.noms[i],
                            Etablissement.prenoms[i],
                            Etablissement.dates[i],
                            Etablissement.listeCours));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        PrincipaleFrame frame = new PrincipaleFrame(); 			 // Creation objet Frame
        frame.setVisible(true);                					 // Visibilite
    }

}
