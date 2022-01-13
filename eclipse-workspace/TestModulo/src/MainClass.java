import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisisez le 1er nombre ");
		n1 = sc.nextInt();
		System.out.println("Saisissezle 2eme nombre");
		n2= sc.nextInt();
		System.out.println(n1+" modulo " + n2 + " = " + (n1%n2));
		sc.close();
	}
}
