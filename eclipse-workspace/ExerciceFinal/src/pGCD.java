import java.util.Scanner;

public class pGCD {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int nb1;
		int nb2;
		
		do {
			System.out.println("Veuillez saisir un 1er nombre entier superieur à 0 svp.");
			nb1 = sc.nextInt();
		}
		while
			(nb1<1);
		do {
			System.out.println("Veuillez saisir un second nombre entier superieur à 0 svp.");
			nb2 = sc.nextInt();
		}
		while
			(nb2<1);
		
		int p=Calcul_PGCD (nb1, nb2);
		
		System.out.println("Le PGCD de " +nb1+ " et de "+nb2+ " est égale à"+p);
		sc.close();
	}
	public static int Calcul_PGCD (int a, int b){
		
		 while (a != b) {
	            if (a > b) {
	                a = a - b;
	            } 
	            else {
	                b = b - a;
	            }
	        } 
		return a;
	}
	
	public static int Calcul_PGCD_Euclide(int a, int b) {
		
	}
}