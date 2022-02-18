import java.util.Scanner;

public class compterLesJeunesSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner sc= new Scanner(System.in);

		int age;
		int nbJeunes=0;

		for (int i=1;i<21;i++) {
			System.out.println("Veuillez-saisir l'age de la personne "+i+" svp.");
			age=sc.nextInt();

			if (age<20) {
				nbJeunes++;
			}
		}
		System.out.println("Il y a en tout "+nbJeunes+" Jeunes");
		sc.close();
	}
}