import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		String distanceAConvertir;
		String [ ] tableauDeConversion;
		int valeur;
		String uniteDeMesure;

		System.out.println("Entrez une valeur à convertir suivi de mi ou km");
		distanceAConvertir = sc.nextLine();// "12 mi"

		tableauDeConversion = distanceAConvertir.split (" ");

		valeur = Integer.valueOf(tableauDeConversion[0]); // transformation et recuperation valeur texte  "12 " en int

		/*if (tableauDeConversion.length > 1) {
			uniteDeMesure = tableauDeConversion[1];
		}
		else {
			uniteDeMesure = "km";
		}

		uniteDeMesure = uniteDeMesure.toLowerCase();

		if (uniteDeMesure.equals("km")){
			double distance = (valeur /1.609);
			System.out.println("La distance " +valeur+ "en Km vaut "+distance+" Miles");

		}
		else {
			uniteDeMesure.equals("mi");
			double distance1 = (valeur *1.609); 
			System.out.println("La distance "+valeur+" en Miles vaut"+distance1+"Km");
		}*/
		sc.close();
	}

}
