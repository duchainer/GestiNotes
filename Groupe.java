import java.util.ArrayList;
/**
 *  28/09/2016
 * @author Raphael
 */
public class Groupe {
    //Variables
    private int numero;
    private ArrayList<Eleve> tabEleve = new ArrayList<Eleve>();
    
    //Constructeurs
    public  Groupe() throws Exception{
        this(-1);
    }
    public Groupe(int numero, Eleve eleve) throws Exception{
        this(numero);
        addEleve(eleve);
    }
    public Groupe(int numero) throws Exception{
        setNumero(numero);
    }
    
//Accesseur-Mutateurs (GET-SET)
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) throws Exception{
        if (0 < numero) {
            throw new Exception("Choisissez un numéro de groupe supérieur à 1");
        } else {
            this.numero = numero; 
        }
        this.numero = numero;
    }
    
    public ArrayList<Eleve> getTabEleve() {
        return tabEleve;
    }
    public void setTabEleve(ArrayList<Eleve> tabEleve) {
        this.tabEleve = tabEleve;
    }
//méthodes autres
    public void addEleve(Eleve eleve) throws Exception{
        if(getTabEleve().size()<Etablissement.ELEVES_PAR_GROUPE){
            getTabEleve().add(eleve);
        }
        else{
            Etablissement.addGroupe(eleve);
        }
    }
    
    public String listeEleve(){
       String liste = "";
        for(Eleve e:tabEleve){
            liste+=e.toString()+"\n";
        }
        //System.out.println(liste);
        return liste;
        
    }

}
