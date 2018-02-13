/**
 * Décrivez votre classe Test ici.
 *
 * @author Besnard Corentin - Alexandre Arnaud
 * @version 26/01/18
 */


import java.util.Scanner;


public class Test
{
    private static String vDep;
    private static String vArr;
    private static boolean bool=false;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        /* Voyages enregistrés */
        Voyage v41 = new Voyage(0041,"Lyon","Paris",400,1.5); 
        Voyage v45 = new Voyage(0045,"Lyon","Paris",350,2); 
        Voyage v43 = new Voyage(0043,"Bordeaux","Paris",350,1.7);
        Voyage v46 = new Voyage(0046,"Bordeaux","Paris",350,1.7);
        
        System.out.println("Il y a "+Voyage.nbVoyages+" voyages enregistrés");
        
        do{
            /* Saisie ville départ par utilisateur*/
            do{
                System.out.println("Veuillez saisir une ville de départ :");
                vDep = sc.nextLine();
            }while(vDep!="Paris"||vDep!="Lyon"||vDep!="Bordeaux"||vDep!="Nantes");
            
            /* Saisie ville arrivée par utilisateur*/
            do{
                System.out.println("Veuillez saisir une ville de départ :");
                vArr = sc.nextLine();
            }while(vArr!="Paris"||vArr!="Lyon"||vArr!="Bordeaux"||vArr!="Nantes");
            
            for(int i=0;i>Voyage.nbVoyages;i++){
                
            }
            
        }while(bool==false);
        
        v41.compDist(v41,v45);
        v43.compDist(v43,v46);
        v41.compDist(v41,v43);
        
        System.out.println(".");
        System.out.println(".");
        
        v41.compPrix(v41,v45);
        v43.compPrix(v43,v46);
        v41.compPrix(v41,v43);
        
        
    }
    
    
    
}
