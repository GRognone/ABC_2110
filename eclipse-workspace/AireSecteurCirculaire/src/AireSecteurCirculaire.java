import java.util.Scanner;

public class AireSecteurCirculaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercice calcul aire secteur circulaire
		//DECLARATION DES VARIABLES
		
		//Reel rayonr
		float rayonr;
		//Reel anglea
		float anglea;
		//Reel aire
		double aire;

			//SAISIE
		//ecrire " Veuillez-saisir le rayon :"
		System.out.println("Veuillez-saisir le rayon:");
		//lire rayonr
		Scanner sc = new Scanner(System.in);//creer un scanner
		rayonr = sc.nextFloat();
		System.out.println("Vous avez saisie le rayon:"+rayonr);
		//ecrire"Veuillez-saisir l'angle"
		System.out.println("Veuillez-saisir l'angle");
		//lire anglea
		anglea = sc.nextFloat();
		System.out.println("Vous avez saisi l'angle"+anglea);		
		//TRAITEMENT
		//aire< - - Math.PI*Math.pow(rayonr,2)*anglea/360
		aire = (double)((Math.PI*Math.pow(rayonr,2)*anglea)/	360);
		
		//AFFICHAGE
		//ecrire"L'aire su secteur circulaire est de",aire
		System.out.println("L'aire du secteur circulaire est de :"+aire);
		
		
		
	}

}
