import java.util.Scanner;

public class ClassementNombre1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION

		//reel = nombrea
		//reel = nombreb
		int nombrea;
		int nombreb;
		Scanner sc= new Scanner (System.in);// creation d'un scanner

		//SAISIE 
		//ecrire (" Veuillez-saisir le nombre a")
		System.out.println("Veuillez-saisir ne nombre a");
		//lire nombrea
		nombrea=sc.nextInt();

		//ecrire ("veuillez-saisir le nombre b ")
		System.out.println("Veuillez-saisir ne nombre b");
		//lire nombreb
		nombreb=sc.nextInt();

		//TRAITEMENT
		if(nombrea >nombreb){
			System.out.println("a>b");
		}
		else if(nombrea<nombreb){
			System.out.println("a<b");
		}
		else {
			System.out.println("a=b");
		}
		
		sc.close();
	}

}