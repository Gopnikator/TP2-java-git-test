/**
 * Décrivez votre classe Voyage ici.
 *
 * @author Besnard Corentin - Alexandre Arnaud
 * @version 26/01/18
 */

import java.util.Scanner;

public class Voyage
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    protected static int nbVoyages;
    private ReelContraint prixKm;
    private ReelContraint distance;
    private String villeD;
    private String villeA;
    private double coutVoyage;
    private int iD;
    
    /** Constructeur vide d'objet Voyage **/
    public Voyage(){
        villeD = "Lyon";
        villeA = "Paris";
        distance = new ReelContraint(1,30000,1);
        prixKm = new ReelContraint(0.05,3.2,1);
    }
    
    /** Constructeur paramétrée d'objet Voyage **/
    public Voyage(int num,String vArr, String vDep ,double dist ,double pxKm){
        nbVoyages++;
        this.iD = num;
        this.villeD = vArr;
        this.villeA = vDep;      
        this.distance = new ReelContraint(1,30000,dist);
        this.prixKm = new ReelContraint(0.05,3.2,pxKm);
        /*
        System.out.println("Nouveau voyage créé :");
        System.out.println("->Départ : "+villeD);
        System.out.println("->Arrivée : "+villeA);
        System.out.println("->Distance : "+distance.getVal());
        System.out.println("->Pris au Km : "+prixKm.getVal());
        */
    }
    
    /** Affichages **/
    public void affiche(){
        System.out.println("Le voyage n°"+iD+" entre "+villeD+" et "+villeA+"\nfait "+distance.getVal()+" Km et coûte "+prixKm.getVal()+" €/Km");
    }
    
    public void aff(){
        System.out.println("le voyage n°"+iD+" entre "+villeD+" et "+villeA);
    }
    
    public void affCout(Voyage v1){
          System.out.print(", le voyage coute "+ v1.coutV(v1.getDistance(),v1.getprixKm())+"€");
    }
    
    /** Getters **/
    public String getVilleD(){return villeD;}
    public String getVilleA(){return villeA;}
    public double getDistance(){return distance.getVal();}
    public double getprixKm(){return prixKm.getVal();}
    
    /** Méthode de comparaison de la distance de deux voyages **/
    public void compDist(Voyage v1,Voyage v2){
        if(v1.getVilleA()==v2.getVilleA() && v1.getVilleD()==v2.getVilleD()){
            if(v1.getDistance()>v2.getDistance()){
                System.out.print("Le voyage le plus court est ");
                v2.affiche();
            }else if(v1.getDistance()<v2.getDistance()){
                System.out.print("Le voyage le plus court est ");
                v1.affiche();
            }else{
                System.out.println("Les voyages sont de même longueur");
            }
        }else if(v1.getVilleA()!=v2.getVilleA() && v1.getVilleD()==v2.getVilleD()){
            System.out.println("Les voyages n'arrivent pas au même endroit");
        }else if(v1.getVilleA()==v2.getVilleA() && v1.getVilleD()!=v2.getVilleD()){
            System.out.println("Les voyages ne partent pas du même endroit");
        }else{
            System.out.println("Les voyages ne partent pas et n'arrivent pas au même endroit");
        }
    }
    
    /** Méthode de comparaison du prix de deux voyages **/
    public void compPrix(Voyage v1, Voyage v2){
        if(coutV(v1.getDistance(),v1.getprixKm()) > coutV(v2.getDistance(),v2.getprixKm())){
            System.out.print("Le voyage le moins cher est ");
            v2.aff();
            v2.affCout(v2);
        }else if(coutV(v1.getDistance(),v1.getprixKm()) < coutV(v2.getDistance(),v2.getprixKm())){
            System.out.print("Le voyage le moins cher est ");
            v1.aff();
            v1.affCout(v1);
        }else{
            System.out.println("Les voyage coutent le même prix ");
        }
    }
    
    /** Méthode renvoyant le coût total d'un voyage **/
    public double coutV(double pxKm, double dist){
        this.coutVoyage = pxKm * dist;
        return coutVoyage;
    }
    
}
