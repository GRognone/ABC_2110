import java.util.Random;
import java.util.Scanner;

public class devineLeNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random  random= new Random();

		int nombreUtilisateur;
		int nombreOrdinateur;
		int fourchetteMin;
		int fourchetteMax;
		nombreOrdinateur = random.nextInt(101);

		System.out.println(nombreOrdinateur);


		System.out.println("Essayez de trouver le nombre choisi par l'ordinateur, vous avez 5 essais");
		nombreUtilisateur=sc.nextInt();

		if (nombreUtilisateur<nombreOrdinateur){
			System.out.println("Perdu!!!  Retentez votre chance!!!");
			fourchetteMin=(0+nombreUtilisateur);
			System.out.println("Le chiffre que vous rechercher est compris entre "+fourchetteMin+" et 100");
		}
		else if (nombreUtilisateur > nombreOrdinateur){
			System.out.println("Perdu!!!  Retentez votre chance!!!");
			fourchetteMax=(100-nombreUtilisateur);
			System.out.println("Le chiffre que vous rechercher est compris entre "+fourchetteMax+" et 0");
		}
		else 
		{
			System.out.println("Bravo vous avez trouvé le bon chiffre!!!");
			System.out.println("Partie termine");
			sc.close();
		}
	}
}