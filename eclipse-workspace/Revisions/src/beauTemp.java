import java.util.Scanner;

public class beauTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);

		String beautemps;
		String bicyclette;
		String reparation;
		String bovary;
		String bibliotheque;

		System.out.println("S'il fait beau demain, j'irai faire une balade à bicyclette");

		do {
			System.out.println("Fera-t'il beau demain? oui/non");
			beautemps= sc.next().toLowerCase();
		}while (!beautemps.equals("oui")&& !beautemps.equals("non"));

		if (beautemps.equals("non")) {
			System.out.println("Il ne fera pas beau, je consacrerai ma journée à la lecture.");
			System.out.println("J'aimerais relire 'Madame Bovary',j'espère retrouver ce livre, il doit être dans la bibliothèque du salon.");

			do {
				System.out.println("Le livre 'Madame Bovary est-il dans le salon? oui/non");
				bovary=sc.next().toLowerCase();
			}while (!bovary.equals("oui")&&!bovary.equals("non"));

			if (bovary.equals("non")) {
				System.out.println("je ne le retrouve pas, je vais à la bibliothèque municipale.");
				do {
					System.out.println("Le livre 'Madame Bovary' est-il disponible? oui/non");
					bibliotheque = sc.next().toLowerCase();
				}while(!bibliotheque.equals("oui")&&!bibliotheque.equals("non"));


				if(bibliotheque.equals("non")) {
					System.out.println("Le livre 'Madame Bovary' n'est pas disponible, j'emprunte un bouquin policier. Je rentre ensuite directement à la maison, je m'installe confortablement dans un fauteuil et je me plonge dans la lecture.");
				}
				else {
					System.out.println("Je rentre directement à la maison, je m'installe confortablement dans un fauteuil et je me plonge dans la lecture.");
				}
			}
			else {
				System.out.println("je m'installe confortablement dans un fauteuil et je me plonge dans la lecture.");
			}
		}
		else {
			System.out.println("j'irai faire une balade à bicyclette.");
			do {
				System.out.println("Je n'ai pas utilisé ma bicyclette depuis plusieurs mois, est-elle en parfait état de fonctionnement? oui/non");
				bicyclette=sc.next();
			}while(!bicyclette.equals("oui")&&!bicyclette.equals("non"));
			if(bicyclette.equals("non")) {
				System.out.println("je passerai chez le garagiste avant la balade");
				do {
					System.out.println("La reparation peut elle être immédiate? oui/non");
					reparation=sc.next();
				}while(!reparation.equals("oui")&&!reparation.equals("non"));
				if (reparation.equals("non")){
					System.out.println("je devrai renoncer à la balade en bicyclette. Comme je veux de toute façon profiter du beau temps, si mon vélo n'est pas utilisable, j'irai à pied jusqu'à l'étang pour cueillir les joncs.");
				}
				else {
					System.out.println("J'irais faire une balade à bicyclette.");
				}
			}
			else {
				System.out.println("J'irais faire une balade a bicyclette");
			}
		}
		sc.close();
	}
}	