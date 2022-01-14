import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureDeLeau {

	static Scanner sc  = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float temperature=0;
		boolean estUnFormatFloat=true;

		do {
			System.out.println("Saisissez la temperature exterieur.");
			estUnFormatFloat=true;
			try {
				sc= new Scanner(System.in);
				temperature=sc.nextFloat();
			}
			catch(InputMismatchException e)
			{
				estUnFormatFloat=false;
			}
		}
		while ( (estUnFormatFloat==false));

		if (temperature<=0) {
			System.out.println("L'eau est a l'etat de glace");
		}
		else if ( temperature>0 && temperature<100 ) {
			System.out.println("L'eau est à l'etat liquide.");
		}
		else if (temperature>=100 ) {
			System.out.println("L'eau est à l'etat de vapeur.");

		}
	}

}















