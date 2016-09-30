import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 *
 *
 * @author Patrick Domingues + 28/9/2016
 */
public class PrincipaleFrame extends JFrame implements ActionListener {

	//Attributs

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
				
				JDialog dialog = new JDialog (this,"Inscription d'un élève", true);
				dialog.setLocationRelativeTo(null);
				dialog.setSize(400,200);
				dialog.setResizable (false);
				
				GridLayout gl2 = new GridLayout(4, 0, 0, 25);	//Cree GridLayout
				dialog.setLayout(gl2);
				
				JLabel label1 = new JLabel("Nom de l'étudiant");
				dialog.getContentPane().add(label1);
				JTextField textField1 = new JTextField(30);
				dialog.getContentPane().add(textField1);
				
				JLabel label2 = new JLabel("Prénom de l'étudiant");
				dialog.getContentPane().add(label2);
				JTextField textField2 = new JTextField(30);
				dialog.getContentPane().add(textField2);
				
				JLabel label3 = new JLabel("date de naissance (JJ-MM-AAAA)");
				dialog.getContentPane().add(label3);
				JTextField textField3 = new JTextField(30);
				dialog.getContentPane().add(textField3);
				
				JButton button1 = new JButton("Confirmer");
				dialog.getContentPane().add(new JButton("Confirmer"));
				button1.addActionListener(this);
				
				JButton button2 = new JButton("Quitter");
				dialog.getContentPane().add(new JButton("Quitter"));
				button2.addActionListener(this);
				
/*								
				if(event.getSource()==button1){
					
				}
				if(event.getSource()==button2){	
					dialog.setVisible(false);
				}
						
À COMPLETER*/				
				dialog.setVisible(true);
				
				
			}
			if(event.getSource()==boutons.get(1)){
				//Enregistrement (ou modification) d'une note d'un élève d'un groupe
				JDialog dialog = new JDialog (this,"Gestionnaire des notes", true);
				dialog.setSize(400,200);
				dialog.setResizable (false);				
				GridLayout gl2 = new GridLayout(4, 0, 0, 25);	//Cree GridLayout
				dialog.setLayout(gl2);
				
				dialog.getContentPane().add(new JButton("OK"));
				dialog.setVisible(true);
				
			}
			if(event.getSource()==boutons.get(2)){
				//Affichage de la liste d'éleves d'un groupe, avec leurs notes
				JDialog dialog = new JDialog (this,"Gestionnaire des notes", true);
				dialog.setSize(400,200);
				dialog.setResizable (false);				
				GridLayout gl2 = new GridLayout(4, 0, 0, 25);	//Cree GridLayout
				dialog.setLayout(gl2);
				
			}
			if(event.getSource()==boutons.get(3)){
				//Affichage des statistiques d'un groupe (moyenne, variance, écart-type)
				JDialog dialog = new JDialog (this,"Gestionnaire des notes", true);
				dialog.setSize(400,200);
				dialog.setResizable (false);				
				GridLayout gl2 = new GridLayout(4, 0, 0, 25);	//Cree GridLayout
				dialog.setLayout(gl2);
				
			}
			if(event.getSource()==boutons.get(4)){
				int reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous vraîment quitter?",
				"Quitter", JOptionPane.YES_NO_OPTION);
				if (reponse == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
	}
}

