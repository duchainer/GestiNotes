/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usager
 */
class Professeur {
//Variables
    private String nom;
//Constructeurs
    Professeur()throws Exception {
        setNom("McGonagan");
    }
    Professeur(String nom)throws Exception {
        setNom(nom);
    }
//Accesseur-Mutateur(GET-SET)
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) throws Exception{
        if (nom.equals("")) {
            throw new Exception("Aucun nom n'a ete enregistre");
        } else {
            this.nom = nom;
        }
    }
//Autres méthodes
    
}
