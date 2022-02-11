import java.util.Scanner;

public class CalculMoyenneMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String nombre ;
		float moyenne;
		String [ ] moyenneACalculer;
		Boolean resultat=false;
		int index=0;


		do {
			System.out.println("Veuillez les nombre svp.");
			nombre = sc.nextLine();
			if (nombre.equals("resultat")) {
				resultat=true;
			}
			else {
				moyenneACalculer [ index ]=nombre;
				index ++;
			}
		}
		while (resultat=false) ;

		for (int i = 0; i< index; i++) {
			String valeur= moyenneACalculer[ i ];
			calculerMoyenne(valeur);
		}
		System.out.println( "Programme termine.");
		sc.close();
	}
	public static void calculerMoyenne(String valeur) {
String [ ] valeurEtUnite = valeur.split(" ");
		
		String nombre;
		float conversion;
		
		
		if (valeur.length >1) {
			unite = valeur[1];
		}
		else {
			unite= "km";
		}
		
		conversion = Double.parseDouble(valeurEtUnite[0]);
		
		if (unite.equals("km")){
			
		conversion = (conversion /1.609);
		uniteResultat = "mi";
	}
	else {
		conversion = (conversion *1.609); 
		uniteResultat = "km";
	}
System.out.println(valeur+ " = " + conversion +" "+uniteResultat);


	}
}