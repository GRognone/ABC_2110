import java.util.Scanner;

public class Listerlesnombresparfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int combien;
		long nombreparfait;


		long nombre=0;
		long diviseur;
		boolean pasdautrequeN = false;
		long sommediviseurs = 0;


		System.out.println("Combien de nombre parfait souhaitez-vous  afficher s'il vous plait?");
		combien=sc.nextInt();
		for (int i=0;i<combien;i++) {


			// calcul des nombres parfait


			for (diviseur = 1;diviseur<(nombre-1);diviseur++) {
				if (nombre%diviseur==0){
					sommediviseurs += diviseur;
					pasdautrequeN = true;			
				}	
			}

			if (sommediviseurs==diviseur){
			}
			System.out.println(" Les "+combien+" nombres parfait sont:");
			System.out.println(/*nombreparfait+*/ " " );
		}
		sc.close();
	}
}

