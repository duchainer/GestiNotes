import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 28/09/2016
 *
 * @author Patrick Domingues
 * 28/9/2016
 */
public class PrincipaleFrame extends JFrame implements ActionListener {

	//Attributs

	Etablissement etablissement = new Etablissement();

	//Attributs graphiques
	JPanel simplePanel;
	JRadioButton radio1,radio2;
	ButtonGroup group;
	ArrayList<JButton> boutons= new ArrayList<JButton>();
	ArrayList<JTextField> champs= new ArrayList<JTextField>();

	//Constructeurs
	public PrincipaleFrame () {
		setTitle ("GestiNotes");    		       		// Titre
		setSize (255,350); 								// Dimensions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fermeture par x
		setLocationRelativeTo(null);					// Fenetre centree
		setResizable (false);

		simplePanel = new  JPanel (); 					//Cree le panneau

		GridLayout gl = new GridLayout(5, 0, 0, 25);	//Cree GridLayout
		simplePanel.setLayout(gl);


		addBouton("Inscrire un élèves");
		boutons.get(boutons.size()-1).setForeground(Color.blue);
		addBouton("Gérer les notes");
		boutons.get(boutons.size()-1).setForeground(Color.green);
		addBouton("Afficher les élèves d'un groupe");
		boutons.get(boutons.size()-1).setForeground(Color.yellow);
		addBouton("Afficher les statistiques d'un groupe");
		boutons.get(boutons.size()-1).setForeground(Color.orange);
		addBouton("Quitter");
		boutons.get(boutons.size()-1).setForeground(Color.red);

		add(simplePanel);

	}

	//méthodes supplémentaires
	private void addEspace() {
		simplePanel.add(new  JLabel (""));
	}

	public void addBouton(String label) {
		boutons.add(new JButton(label));						//Cree le bouton et le met dans boutons
		simplePanel.add( boutons.get(boutons.size()-1)); 		//Ajoute bouton au panneau
		boutons.get(boutons.size()-1).addActionListener(this);	//Rend le bouton interactif
	}


	@Override
	public void actionPerformed(ActionEvent event) {
			if(event.getSource()==boutons.get(0)){
				//Création d'un élève dans un croupe (crée un autre groupe si le groupe présent à 10 élèves)

				String nom = JOptionPane.showInputDialog(null,"Entrer le nom de l'élève:","Enregistrer un élève", JOptionPane.QUESTION_MESSAGE);
				String prenom = JOptionPane.showInputDialog(null,"Entrer le prénom de l'élève:","Enregistrer un élève", JOptionPane.QUESTION_MESSAGE);
				String date = JOptionPane.showInputDialog(null,"Entrer la date de naissance de l'élève (JJ-MM-AAAA):","Enregistrer un élève", JOptionPane.QUESTION_MESSAGE);
				Eleve eleve = new Eleve(nom, prenom, date);

				etablissement.addGroupe(eleve);

				/*etablissement.tabGroupe.get(0).addEleve(eleve);*/

				/*if (etablissement.tabGroupe.get(0).getTabEleve().size()<etablissement.ELEVES_PAR_GROUPE)
					etablissement.tabGroupe.get(0).addEleve(eleve);

				else etablissement.addGroupe(eleve);*/

				//System.out.println(etablissement.tabGroupe);
				//Groupe groupe = new Groupe("Groupe ", eleve);

				//getTabEleve().addEleve(eleve);
			}


			if(event.getSource()==boutons.get(1)){
				//Enregistrement (ou modification) d'une note d'un élève d'un groupe

			}


			if(event.getSource()==boutons.get(2)){
				//Affichage de la liste d'éleves d'un groupe, avec leurs notes

				etablissement.tabGroupe.get(Integer.parseInt(JOptionPane.showInputDialog(null,"Quel groupe voulez-vous voir?",
				"Liste de classe", JOptionPane.QUESTION_MESSAGE))).listeEleve();

			}


			if(event.getSource()==boutons.get(3)){
				//Affichage des statistiques d'un groupe (moyenne, variance, écart-type)

				etablissement.tabGroupe.get(Integer.parseInt(JOptionPane.showInputDialog(null,"Vous voulez consulter les statistiques de quel groupe?",
				"Statistiques de classe", JOptionPane.QUESTION_MESSAGE))).listeEleve();

				//etablissement.calculerMoyenne(0);

			}


			if(event.getSource()==boutons.get(4)){
				//Permet l'arrêt du programme
				int reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous vraîment quitter?",
				"Quitter", JOptionPane.YES_NO_OPTION);
				if (reponse == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
	}
}

