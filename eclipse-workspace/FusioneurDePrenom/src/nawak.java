import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class nawak {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [ ] allNames = {"claire","raphael","rodolphe","yacine","veronique","julian","jose","mathieu","nicolas","gerard","willy","stephanie","btissame","sophie","mickael","paul","franck"};
		int userNameNumber=0;
		int vie=3;
		int nameFound = 0;
		boolean win=false;
		String [ ] chosenNames;
		char[ ] randomName;
		String userGuess;

		// Combien de prenoms souhaitez vous melanger?
		do {
			try {
				System.out.println("Entrez le nombre 2 ou 3 svp.");
				userNameNumber= Integer.parseInt(sc.nextLine());
			}
			catch(Exception e) {
				System.out.println("Vous avez saisi n'importe quoi un chiffre n'est pas une lettre,pffff !!!");
				userNameNumber=0;
				sc.next();// reinitialisation de la valeur du scanner.
			}
		}
		while(userNameNumber !=2 && userNameNumber !=3);

		// creer un tableau qui stock le nombre de prenoms à melanger

		/*chosenNames=new String [userNameNumber];*/
		ArrayList<String> chosenName = new ArrayList<String>();
		

		// mettre les nom choisis aleatoirement selon nombre choisi par l'utilisateur dans le tableau.
		boolean isOnList;
		int j;
		String tempName="";
		for (int i=0; i<userNameNumber;i++) {
			isOnList = true;
			while (isOnList) {
				isOnList = false;
				tempName = allNames[genererAleatoire(0, allNames.length)];
				j=0;
				while (j < chosenName.size() && !isOnList) {
					if (chosenName.get(j).equals(tempName)) {
						isOnList = true;
					}
					j++;
				}
			}
			chosenName.add(tempName);
			// à la valeur "i" de mon tableau chosenNames, je copie la valeur du tableau allNames à l'indice 
			//genere aléatoirement par ma méthode "genererAleatoire" qui a pour limite, un chiffre compris entre 0 et la longueur du tableau.
		}
		
		//mélange les lettres dans une string
		randomName = cryptedName(chosenName);
		System.out.println(randomName);

		ArrayList<String> namesLeftToGuess = new ArrayList<String>();
		namesLeftToGuess.addAll(Arrays.asList("claire","raphael","rodolphe","yacine","veronique","julian","jose","mathieu","nicolas","gerard","willy","stephanie","btissame","sophie","mickael","paul","franck"));
		
		for (int i=0; i < namesLeftToGuess.size(); i++)
		{
		System.out.print(namesLeftToGuess.get(i));
		System.out.print((i+1 < namesLeftToGuess.size() ? ", " : ""));
		}
		
		System.out.println("veuillez entrer un prénom");
		userGuess = sc.nextLine();
		
		
		
		sc.close();
	}
	public static int nameFound(ArrayList<String> namesLeftToGuess, String userGuess) {
		int nameFound = 0;
		for (int i = namesLeftToGuess.size()-1; i >= 0; i--) {
			if ( userGuess.equals(namesLeftToGuess.get(i)))
			{
				namesLeftToGuess.remove(i);
				nameFound++;
			}
		}
		return nameFound;
	}
	public static int genererAleatoire(int min, int max) {
		Random rnd = new Random();
		return rnd.nextInt(max-min)+min;
	}
	
	public static char[] cryptedName (ArrayList<String> chosenName)
	{
		ArrayList<String> availableChosenName = new ArrayList<String>();
		availableChosenName.addAll(chosenName);
		int maxLength = maxLength(availableChosenName);
		char[] cryptedName = new char[maxLength];
		
		
		for (int i = 0; i < cryptedName.length; i++)
		{
			for (int j = availableChosenName.size()-1; j >= 0; j--) {
				if (availableChosenName.get(j).length() <= i)
					availableChosenName.remove(j);
			}
			do {
			try
			{
				int aleatoire = genererAleatoire(0,availableChosenName.size());
				cryptedName[i] = availableChosenName.get(aleatoire).charAt(i);
			}
			catch (Exception e)
			{
				System.out.println("Out of bound exception");
				i--;
			}
			} while (cryptedName.length < maxLength(availableChosenName));
		}
		return cryptedName;
	}
	
	public static int maxLength(ArrayList<String> arrayName)
	{
		int higherLength = 0;
		
		for (int i = 0; i < arrayName.size(); i++)
		{
			if (arrayName.get(i).length() > higherLength)
			{
				higherLength = arrayName.get(i).length();
			}
		}
		
		return higherLength;
	}
	
	
	
}