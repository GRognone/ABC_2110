import java.util.InputMismatchException;
import java.util.Scanner;

public class ExempleExercicesBoucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// utilisation de la boucle for

		/*int i;
for (i=1;i<=3;i++) {
	System.out.println("Claquez une fois dans les mains");
}
	}

}
		 */
		/*

		 //Utilisation de la boucle while


		String ilFaitBeau;
		System.out.println("Est ce qu'il fait beau? oui/non");
		Scanner sc = new Scanner(System.in);
		ilFaitBeau = sc.next();

		while (ilFaitBeau.equals("oui"))
		{
			//TRAITEMENT
			System.out.println("je me promène dans le jardin");
			System.out.println("Est ce qu'il fait toujours beau? oui/non");
			ilFaitBeau= sc.next();
		}
		System.out.println("Je rentre à la maison");

		sc.close();	
	}

}
		 */
		/*
String temperature;
System.out.println("Est ce ma temperature est inferieur a 38 degres ?oui/non");
Scanner sc = new Scanner(System.in);
temperature = sc.next();

while (temperature.equals("oui"))
{
	//TRAITEMENT
	System.out.println("je me promène dans le jardin");
	System.out.println("Est ce ma temperature est toujours inferieure a 38 degres? oui/non");
	temperature= sc.next();
}
System.out.println("Je vais voir le medecin");

sc.close();	
}

}
		 */

		float temperature;
				System.out.println("Quelle est ma temperarture?");
		Scanner sc = new Scanner(System.in);
		temperature = sc.nextFloat();
	try {
		System.out.println();
	}catch(InputMismatchException e) {
	}
		do {
			System.out.println("Quelle est ma temperature?");
			temperature = sc.nextFloat();
			
		}
		while (temperature<=35 || temperature>=45 );
		
		while (temperature<=38)
		{
			System.out.println("Je me balade sans contaminer de monde, quoi que...");
			System.out.println("Ma tempereture est-elle toujours la  meme?");
			temperature=sc.nextFloat();
		}
		System.out.println(" Comme je suis genereux je partage mon covid avec tout le monde !!!");
		 
		sc.close();

	}

}
