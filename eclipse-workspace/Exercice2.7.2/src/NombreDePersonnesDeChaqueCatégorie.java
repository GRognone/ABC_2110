import java.util.Scanner;

public class NombreDePersonnesDeChaqueCatégorie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		int age[ ] = new int [20];

		int saisieAges;
		int nbAutre=0;
		int nbJeune=0;

		for (int i=0;i<age.length;i++) {
			System.out.println("Veuillez-saisir l'age de la personne "+(i+1)+" svp.");
			saisieAges=sc.nextInt();
			
			if (saisieAges<20) {
				nbJeune++;
			}
			else if (saisieAges>=20) {
				nbAutre++;
			}
		}
		if(nbJeune==20) {
			System.out.println("Toutes les personnes ont moins de 20 ans.");
		}
		else if (nbAutre==20){
			System.out.println("Toutes les personnes ont plus de 20 ans.");
		}
		else {
			System.out.println("Il y a "+nbJeune+" personnes de moins et 20 ans et "+nbAutre+" personnes de plus de 20 ans.");
		}
		sc.close();
	}
}