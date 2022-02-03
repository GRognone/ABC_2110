import java.util.Scanner;

public class Exercice212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double distanceAconvertir;
		double distanceConvertieEnKm;
		double distanceConvertieEnMiles;
		String uniteDeMesure;

		System.out.println("Veuillez saisir la distance et son unite de mesure à convertir mi pour Miles ou km pour Kilometres svp");
		distanceAconvertir = sc.nextDouble();
		uniteDeMesure = sc.next().toLowerCase();

		if (uniteDeMesure.equals("mi")){
			distanceConvertieEnKm = distanceAconvertir * 1.609;
			System.out.println("La distance "+distanceAconvertir+" miles convertie est de" +distanceConvertieEnKm+" Km");
		}
		else if ((uniteDeMesure.equals("km"))) {
			distanceConvertieEnMiles = distanceAconvertir / 1.609;
			System.out.println("La distance "+distanceAconvertir+" Km convertie est de" +distanceConvertieEnMiles+" Miles");
		}
		else  {
			distanceConvertieEnMiles = distanceAconvertir / 1.609;
			System.out.println("La distance "+distanceAconvertir+" Km convertie est de" +distanceConvertieEnMiles+" Miles");
		}
		sc.close();
	}
}