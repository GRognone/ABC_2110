import java.util.Scanner;

public class JalonReductionCoiffeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String etudiant;
		String mercredi;
		String jeudi;
		Scanner sc=new Scanner(System.in);

		System.out.println("Les seules personnes ayant droit à une réduction sur leur coupe de cheveux sont les etudiants");

		do
		{
			System.out.println(" Etes vous un etudiant? ouiI/non");
			etudiant = sc.next().toLowerCase();
		} while (!etudiant.equals("oui") && !etudiant.equals("non"));

		if (etudiant.equals("oui")){
			do
			{
				System.out.println("Sommes-nous mercredi aujourd'hui?oui/non");
				mercredi = sc.next().toLowerCase();
			} while (!mercredi.equals("oui") && !mercredi.equals("non"));


			if (mercredi.equals("oui")) {
				System.out.println("Vous avez doit à une réduction de 50%.");	
			}
			else {
				do
				{
					System.out.println("Autrement sommes nous jeudi? oui/non");
					jeudi = sc.next().toLowerCase();
				} while (!jeudi.equals("oui") && !jeudi.equals("non"));


				if (jeudi.equals("oui")) {
					System.out.println("Vous avez doit à une réduction de 20%.");
				}
				else {
					System.out.println("Vous n'avez droit à aucune reduction");
				}
				sc.close();
			}
		}
		else {
			System.out.println("Vous n'avez droit à aucune reduction");
		}
	}
}