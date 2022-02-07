import java.util.Scanner;

public class Exercice212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		float distanceAConvertir;
		double distanceConvertieEnKm;
		double distanceConvertieEnMiles;
		
		String[] uniteDeMesure = new String[4];
		uniteDeMesure[0] = distanceAConvertir;
		uniteDeMesure[1] = "km";
		uniteDeMesure[2] = null;
		uniteDeMesure[3]= "mi";

		System.out.println("Veuillez saisir la distance et son unite de mesure à convertir mi pour Miles ou km pour Kilometres svp");
		distanceAConvertir = sc.nextFloat();

		if (uniteDeMesure.equals("mi")){
			distanceConvertieEnKm = distanceAConvertir * 1.609;
			System.out.println("La distance "+distanceAConvertir+" miles convertie est de " +distanceConvertieEnKm+" Km");
		}
		else  {
			uniteDeMesure.equals("km");
			distanceConvertieEnMiles = distanceAConvertir / 1.609;
			System.out.println("La distance "+distanceAConvertir+" Km convertie est de" +distanceConvertieEnMiles+" Miles");
		}
		sc.close();
	}
}