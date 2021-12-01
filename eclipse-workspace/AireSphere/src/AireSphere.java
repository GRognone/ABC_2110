import java.util.Scanner;

public class AireSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercice calcul aire sphere
		//DECLARATION DES VARIABLES
		
		//Reel rayonr
		float rayonr;
		//Reel aire
		double aire;
		//Reel volume
		double volume;
		
		//Saisie
		
		//ecrire "Veuillez-saisir le rayon :"
		System.out.println("Veuillez-saisir le rayon:");
		//lire rayonr
		Scanner sc = new Scanner(System.in);//creer un scanner
		rayonr = sc.nextFloat();
		System.out.println("Vous avez saisie le rayon :"+rayonr);
		
		// TRAITEMENT
		// aire < - - 4*Math.PI*Math.pow(5,2)
		aire =  (double)(4*Math.PI*Math.pow (10,2));
		// volume < - - 4*Math.PI*Math.pow(5,3)/3 
		volume = (double)(4*Math.PI*Math.pow(10,3)/3);
		//AFFICHAGE
		//ecrire "L'aire de la sphere est de :",aire
		System.out.println("L'aire de la sphere est de:"+aire);
		//ecrire "Le volume de la sphere est de :"volume
		System.out.println("Le volume de la sphere est de:"+volume);
		
				
	}

}
