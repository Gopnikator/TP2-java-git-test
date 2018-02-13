
/**
 * Décrivez votre classe ReelContraint ici.
 *
 * @author Besnard Corentin - Alexandre Arnaud
 * @version 26/01/18
 */


import java.util.Scanner;

public class ReelContraint
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private double val, min, max;
    Scanner sc= new Scanner(System.in); 

    /**Constructeur d'objets de classe ReelContraint*/
    public ReelContraint(double min, double max, double val){
        if(max>=min){
            this.max=max;
            this.min=min;
        }else if (min>max){
            this.min=max;
            this.max=min;
        }
        //Ici, min<=max
        if(val<min){
            this.val=this.min;
        }else if(val>max){
            this.val=this.max;
        }else{
            this.val=val;
        }
    }
    
    
    
    /**Un exemple de méthode - remplacez ce commentaire par le vôtre*/
    public void affiche(){
        System.out.println("La valeur de val est : "+ this.val+" compris entre "+this.min+" et "+this.max);
    }
    
    
    public void saisir(){
        java.util.Scanner entree = new java.util.Scanner(System.in);
        double valtmp;
        do{
            System.out.println("Saisir un nombre compris entre "+this.min+" et "+this.max);
            valtmp=sc.nextFloat();
        }while(valtmp<min && valtmp>max);
        val=valtmp;
    }
    
    public double getMin(){return min;}
    public double getMax(){return max;}
    public double getVal(){return val;}
    
    public void setVal(double newval){
        if(newval>=min && newval<=max)
            val=newval;
    }
}
