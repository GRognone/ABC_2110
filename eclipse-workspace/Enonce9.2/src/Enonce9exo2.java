import java.util.Scanner;
public class Enonce9exo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION
		int nombrea;
		int nombreb;
		int nombrec;
		Scanner sc = new Scanner( System.in);//creation d'un scanner

		//SAISIE
		//ecrire (" Veuillez-saisir le nombre a")
		System.out.println("Veuillez-saisir ne nombre a");
		//lire nombrea
		nombrea=sc.nextInt();
		//ecrire ("veuillez-saisir le nombre b ")
		System.out.println("Veuillez-saisir ne nombre b");
		//lire nombreb
		nombreb=sc.nextInt();

		//ecrire ("veuillez-saisir le nombre b ")
		System.out.println("Veuillez-saisir ne nombre c");
		//lire nombreb
		nombrec=sc.nextInt();

		//TRAITEMENT
		if ((nombrea<nombreb)&&(nombreb<nombrec)){
			System.out.println("a<b<c");
		}
		else if ((nombrea<nombreb)&&(nombreb>nombrec)&&(nombrea<nombrec)){
			System.out.println("a<c<b");
		}
		else if((nombreb<nombrea)&&(nombrea<nombrec)){
			System.out.println("b<a<c");
		}
		else if ((nombreb<nombrea)&&(nombrea>nombrec)&&(nombreb<nombrec)) {
			System.out.println("b<c<a");
		}
		else if ((nombrec<nombrea)&&(nombrea<nombreb)&&(nombrec<nombreb)) {
			System.out.println("c<a<b");
		}
		else if ((nombrec<nombrea)&&(nombrea>nombreb)&&(nombrec<nombreb)) {
			System.out.println("c<b<a");
		}
		sc.close();
	}
}