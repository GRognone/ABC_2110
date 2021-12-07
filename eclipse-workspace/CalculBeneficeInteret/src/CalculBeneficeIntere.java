import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculBeneficeIntere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercice Calcul Benefice Interets
		
		//Declaration des variables
		
		//Reel sommeinitiales
		float sommeinitiales;
		//Reel interetsi
		float interesi;
		//Reel nombreanneesn
		float nombreanneesn;
		//Reel valeuracquisesimple
		double valeuracquisesimple;
		//Reel valeuracquisecomposee
		double valeuracquisecomposee;
		
		//Saisie
		//ecrire  "Veuillez-saisir la somme initiale"
		System.out.println("Veuillez saisir la somme initiale");
		//lire sommeinitiales
		Scanner  sc= new Scanner(System.in);//creer un scanner
		sommeinitiales = sc.nextFloat();
		System.out.println("Vous avez saisi la somme initiale "+sommeinitiales+" €");
		//ecrire "Veuillez-saisir le taux d'interets annuel"
		System.out.println("Veuillez saisir le taux d'interets annuel");
		//lire interesi
		interesi = sc.nextFloat();
		System.out.println("Vous avez saisi le taux d'interets annuel "+interesi+" %");
		//ecrire " Veulliez saisir le nombre d'annee"
		System.out.println("Veuillez-saisir le nombre d'annee");
		//lire nombreanneesn
		nombreanneesn = sc.nextFloat();
		System.out.println("Vous avez saisie le nombre d'annee "+nombreanneesn);
		
		//TRAITEMENT
		// valeuracquisesimple <- - sommeinitiales*(1+nombreanneesn*interesi)
			valeuracquisesimple = (double) (sommeinitiales*(1+nombreanneesn*interesi/100));
		//valeuracquisecomposee < - - sommeinitiales*(Math.pow((1+interesi),nombreanneesn))
			valeuracquisecomposee = (double)(sommeinitiales*(Math.pow((1+interesi/100),nombreanneesn)));
			
		//AFFICHAGE
			DecimalFormat df = new DecimalFormat("0.00");
			
		//ecrire "La valeur acquise simple est de :"
		System.out.println("La valeur acquise simple est de :"+df.format(valeuracquisesimple)+" €");	
		//ecrire "La valeur acquise composee est de :"
		System.out.println("La valeur acquise composee est de :"+df.format(valeuracquisecomposee)+" €");
		
		//FIN
	}
		
}
