import java.util.Scanner;

public class jeuDesCrayons {

	static String joueur1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String user="";
		String player1 = "";
		String player2 = "";
		String computer;
		String computerName;
		int numberOfTurn=0;
		boolean iA= true;
		int crayon=13;
		int saisieCrayon;


		player1=namePlayer(player1);
		System.out.println("Bienvenue " +player1);
		player2=namePlayer(player2);
		System.out.println("Bienvenue " +player2);

		do {
			System.out.println(player1+" souhaitez-vous jouer contre l'ordinateur? oui/non?");
			computer= sc.next().toLowerCase();
		}
		while
			(!computer.equals("oui")&& !computer.equals("non"));

		if (computer.equals("oui")) {
			computerName=player2;
			iA=true;
			System.out.println("le nom de l'ordinateur est "+computerName);
		}
		
		// Si ma méthode playerTurn == 0, alors c'est au joueur 1 de jouer.
		// Sinon c'est au joueur 2
		if (playerTurn(numberOfTurn)==0) {
			user=player1;
		}
		else
			user=player2;
		System.out.println("Il y a "+crayon+" crayons , chaque joueur peut en retirer de 1 à 3 maximum à chaque tour, le joueur qui retire le dernier crayon à perdu.\nA vous de jouer "+user+".");

		do {
			//jooueur qui joue
			System.out.println("Combien de crayons souhaitez-vous retirer?");
			saisieCrayon=sc.nextInt();
		}
		while 
			(saisieCrayon<1 && saisieCrayon>3);
		
		crayon-=saisieCrayon;

		sc.close();
	}

	public static String namePlayer (String userInput) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Veuillez entrer votre nom svp");
		userInput= sc.next();
		return userInput;
	}
	public static int playerTurn(int numberOfTurn) {
		return  numberOfTurn%2;
	}
}