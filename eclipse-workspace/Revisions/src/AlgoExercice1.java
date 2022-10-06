import java.util.Scanner;

public class AlgoExercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

float a;
float b;
float moyenne;

System.out.println("Veuillez saisir un premier nombre svp");
a=sc.nextInt();
System.out.println("Veuillez saisir un dexième nombre svp");
b=sc.nextInt();

moyenne=(a+b)/2;
System.out.println("La moyenne des 2 nombres est de "+moyenne);
sc.close();


	}

}
