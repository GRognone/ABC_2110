import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int saisie;
		Scanner sc = new Scanner(System.in);
		saisie = sc.nextInt();
		switch(saisie) {
			case 1:
				System.out.println("tu es tres petit");
				break;
			case 2:
				System.out.println("tu es petit");
				break;
			case 3:
				System.out.println("tu es moyen");
				break;
			case 4:
				System.out.println("tu es grand");
				break;
			case 5:
				System.out.println("tu es tres grand");
				break;
			case 6:
				System.out.println("tu es gigantesque");
				break;
			default:
				System.out.println("tu es inconnu");
				break;
		}
		sc.close();
	}
}
