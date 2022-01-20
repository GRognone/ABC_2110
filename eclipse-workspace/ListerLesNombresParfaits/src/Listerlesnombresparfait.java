import java.util.Scanner;

public class Listerlesnombresparfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int combien;
		long nombre;
		long diviseur;
		boolean pasdautrequeN = false;
		long sommediviseurs = 0;

		System.out.println("Combien de nombre parfait souhaitez-vous  afficher s'il vous plait?");
		combien=sc.nextInt();


		nombre = sc.nextLong();
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

		sc.close();
	}
}
