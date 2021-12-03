import java.text.DecimalFormat;
import java.util.Scanner;

public class InversiondeBloc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exercice Inversion De Bloc
		
		//DECLARATION DES VARIABLES
		
		//Reel nombrea
		float nombrea;
		//Reel nombreb
		float nombreb;
		//Reel temp
		float temp;
		
		//SAISIE
		
		//ecrire "Veuillez saisir le nombre a"
		System.out.println("Veuillez-saisir le nombre a");
		//lire nombrea
		Scanner sc = new Scanner(System.in);//creer un outil scanner
		nombrea = sc.nextFloat();
		
		//ecrire "Veuillez saisire le nombre b"
		System.out.println("Veuillez-saisir le nombre b");
		//lire nombreb
		nombreb = sc.nextFloat();
		
		//TRAITEMENT
		//temp < - - nombrea
		temp = nombrea;
		//nombrea < - - nombreb
		nombrea = nombreb;
		//nombreb < - -temp
		nombreb = temp;
		
		//AFFICHAGE
		DecimalFormat df = new DecimalFormat("0.00");
		//ecrire " Le nombre a est :"
		System.out.println("Le nombre a est :"+df.format(nombrea));
		//ecrire "Le nombre b est :"
		System.out.println("le nombre b est :"+df.format(nombreb));
	}

}
