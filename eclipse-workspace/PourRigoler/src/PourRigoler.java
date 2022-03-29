import java.util.Scanner;

public class PourRigoler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String prenom;
		String nomAnimal;
		System.out.println(" Veuillez saisir votre deuxieme prénom ou votre prenom si vous n'en n'avez qu'un seul svp .");
		prenom= sc.nextLine();
		System.out.println("Veuillez saisir le nom de votre premier animal de compagnie svp.");
		nomAnimal = sc.nextLine();
		System.out.println("Votre nom de star du x est : "+prenom+" "+nomAnimal);
		sc.close();
	}
}