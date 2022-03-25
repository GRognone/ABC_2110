import java.util.Random;
import java.util.Scanner;

public class nawak {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [ ] allNames = {"raphael","rodolphe","yacine","veronique","julian","jose","mathieu","nicolas","gerard","willy"};
		int userNameNumber=0;
		int vie=3;
		boolean[ ] wordFound;
		boolean win=false;
		String [ ] chosenNames;
		String randomName;
		String mixedName;
		String userGuess;
		
		// Combien de prenom on melange?
		do {
			try {
				System.out.println("Entrez le nombre 2 ou 3 svp.");
				userNameNumber= sc.nextInt();
			}
			catch(Exception e) {
				System.out.println("Vous avez saisi n'importe quoi un chiffre n'est pas une lettre,pffff !!!");
				userNameNumber=0;
				sc.next();// vidage de la valeur du scanner.
			}
		}
		while(userNameNumber !=2 && userNameNumber !=3);

		// creer un tableau qui stock le nombre de prenom à melanger

		chosenNames=new String [userNameNumber];

		// mettre les nom choisis aleatoirement selon nombre choisi par l'utilisateur dans le tableau.

for (int i=0; i<chosenNames.length;i++) {
	chosenNames[i] = allNames[genererAleatoire(allNames.length, 0)];
	// à la valeur "i" de mon tableau chosenNames, je copie la valeur du tableau allNames à l'indice 
	//generer aléatoirement par ma méthode "genererAleatoire" qui a pour limite, un chiffre compris entre 0 et la longueur du tableau.
}
		sc.close();
	}
	public static void nameFound() {

	}
	public static int genererAleatoire(int min, int max) {
		Random rnd = new Random();
		return rnd.nextInt((max+1)-min)+min;
	}
}