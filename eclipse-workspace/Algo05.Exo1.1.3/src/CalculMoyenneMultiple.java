import java.util.Scanner;

public class CalculMoyenneMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String [ ] tableauStockageNombres;
		String nombres ;
		boolean resultat=false;
		int index=0;

		tableauStockageNombres = new String [100];

		do {
			System.out.println("Veuillez les nombre svp.");
			nombres = sc.nextLine();

			if (nombres.equals("calcul")) {
				resultat=true;
			}
			else {
				tableauStockageNombres [index] = nombres;
				index ++;
			}
		}
		while (resultat=false) ;

		for (int i = 0; i< tableauStockageNombres.length; i++) {
			String sommes =tableauStockageNombres[ i ];
			sommeDesNombres (sommes);
			
		}
		System.out.println( "Programme termine.");
		sc.close();
	}
	public static void sommeDesNombres (String sommes) {

		String [ ] sommeDesNombres = sommes.split(";");

		
			//	System.out.println(sommes +" = " "La moyenne des nombres saisis "+  + "est de "+moyenne);

	}
}

