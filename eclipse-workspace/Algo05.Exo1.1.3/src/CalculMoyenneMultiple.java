import java.util.Scanner;

public class CalculMoyenneMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String [ ] tableauStockageNombres;
		String nombres ;
		
		float recupSaisies=0;
		float moyenne;

			System.out.println("Veuillez saisir les nombre en les separants par un espace , valider � la fin de votre saisie par ' ok ' svp.");
			nombres = sc.nextLine();
			
				tableauStockageNombres=nombres.split(" ");

		for (int i = 0; i<tableauStockageNombres.length; i++) {

			String sommeDesNombre = tableauStockageNombres[ i ];
			recupSaisies = recupSaisies +Float.valueOf(sommeDesNombre);
		}

		moyenne =recupSaisies/tableauStockageNombres.length;

		System.out.println("La moyenne des nombres saisi est de "+moyenne);
		System.out.println( "Programme termine.");
		sc.close();
	}
}