import java.util.Scanner;

public class rechercherunelettredansunechainedecaractères {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String tableauCaractere[ ];
		String saisie;
		Boolean  vide =false;
		String caractereRecherche;
		int compteur=0;


		// Saisie du tableau

		System.out.println("veuillez saisir une chaine de caractere et finir la saisie par un point");
		saisie=sc.nextLine();
		tableauCaractere = saisie.split (" ");

		if  (saisie.equals(".")) {
			vide=true;
			System.out.println("Chaine vide");
		}
		else {
			// Rechercher et comptabiliser un caractere 

			System.out.println("Veuillez saisir le caractère à rechercher svp");
			caractereRecherche=sc.nextLine();
			for (int i=0; i<tableauCaractere.length;i++){
				if (caractereRecherche.equals(tableauCaractere[i])) {
					compteur++;
				}
			}
			if (compteur==0) {
				System.out.println("Le caractère recherché n'existe pas");
			}
			else {
				System.out.println("Le caractere recherche "+caractereRecherche+" est disponible "+compteur+ " fois dans le tableau java");
			}
		}
		sc.close();
	}
}

/*package character_manipulation;

public class DeclareCharArray {
    public static void main(String[] args) {
        String s1 = "First String";
        char[] charArray = s1.toCharArray();
        for (char c : charArray) {
            System.out.print(" " + c);
        }
    }
}*/