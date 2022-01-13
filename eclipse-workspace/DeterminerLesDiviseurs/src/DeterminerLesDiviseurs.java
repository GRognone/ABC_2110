import java.util.Scanner;

public class DeterminerLesDiviseurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombreN;
		int diviseur;
		boolean pasdautreque1etN = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisisez un nombre entier");
		nombreN=sc.nextInt();

		System.out.println("Les diviseurs sont les suivants :");

		for (diviseur = 2;diviseur<=(nombreN-1);diviseur++) {
			if (nombreN%diviseur==0){
				System.out.print(diviseur+ " . ");
				pasdautreque1etN = true;
			}
			sc.close();
		}
		if (!pasdautreque1etN) {
			System.out.println("Il n'y a pas d'autre diviseurs que 1 et N.");
		}
		sc.close();
	}
}

