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
		System.out.println("Vous avez saisi la somme initiale"+sommeinitiales);
		//ecrire "Veuillez-saisir le taux d'interets annuel"
		System.out.println("Veuillez saisir le taux d'interets annuel");
		//lire interesi
		interesi = sc.nextFloat();
		System.out.println("Vous avez saisi le taux d'interets annuel"+interesi);
		//ecrire " Veulliez saisir le nombre d'année"
		System.out.println("Veuillez-saisir le nombre d'annee");
		//lire nombreanneesn
		nombreanneesn = sc.nextFloat();
		System.out.println("Vous avez saisie le nombre d'annee"+nombreanneesn);
		
		//TRAITEMENT
		// valeuracquisesimple <- - sommeinitiales*(1+nombreanneesn*interesi)
			valeuracquisesimple = (double) (sommeinitiales*(1+nombreanneesn*interesi));
		//valeuracquisecomposee < - - sommeinitiales*(Math.pow((1+interesi),nombreanneesn))
			valeuracquisecomposee = (double)(sommeinitiales*(Math.pow((1+interesi),nombreanneesn)));
			
		//AFFICHAGE
			
		//ecrire "La valeur acquise simple est de :"
		System.out.println("La valeur acquise simple est de :"+valeuracquisesimple);	
		//ecrire "La valeur acquise composée est de :"
		System.out.println("La valeur acquise composée est de :"+valeuracquisecomposee);
		
		
	}
		
}
