import java.util.Scanner;

public class AireDeLaSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// calcul 4pi R2
		float rayon;
		double aire;
		double volume;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le rayon de la sphère svp");
		rayon=sc.nextFloat();
		aire=4*Math.PI*Math.pow(rayon, 2);
		volume=4*Math.PI*Math.pow(rayon,3)/3;
		
		System.out.println("l'aire de la sphere est "+aire);
		System.out.println("le volume de la sphère est "+volume);
		
		
		sc.close();
	}

}
