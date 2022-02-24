import java.util.Scanner;

public class rechercherunelettredansunechainedecaractères {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String caractere[ ];
		String saisie;
		Boolean  vide =false;
		
			
		
		System.out.println("veuillez saisir une chaine de caractere et finir la saisie par un point");
		saisie=sc.next();
		if  (saisie.equals(".")) {
		vide=true;
		System.out.println("Chaine vide");
		}
		else {
			System.out.println(saisie);
		}
		
		sc.close();
	}
}