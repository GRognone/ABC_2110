import java.util.Scanner;

public class NombreParfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  sc = new Scanner(System.in);
		long nombre;
		long diviseur;
		boolean pasdautrequeN = false;
		long sommediviseurs = 0;

		System.out.println("Veuillez-saisir un nombre s'il vous plait");
		nombre = sc.nextLong();
		System.out.println("Les diviseurs du nombre sont les suivants");
		for (diviseur = 1;diviseur<(nombre-1);diviseur++) {
			if (nombre%diviseur==0){
				System.out.print(diviseur+ " . ");
				sommediviseurs += diviseur;
				pasdautrequeN = true;			
			}	
		}
		System.out.println("La somme des diviseur est de "+sommediviseurs);
		if (sommediviseurs==nombre){
			System.out.println(" Le nombre " +nombre + " est un nombre parfait");
		}
		else {
			System.out.println(" Le nombre " +nombre + " n' est pas un nombre parfait");
		}
		sc.close();
	}
}