import java.util.Scanner;

public class InversionCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float nombrea ;
float nombreb ;
float temp;
Scanner sc = new Scanner(System.in);

System.out.println("veuillez-sasir un nombre que l'on appelera a svp");
nombrea=sc.nextFloat();
System.out.println("le nombre a est "+ nombrea);

System.out.println("veuillez-sasir un nombre que l'on appelera b svp");
nombreb=sc.nextFloat();
System.out.println("le nombre b est "+nombreb);

temp=nombrea;
nombrea=nombreb;
nombreb=temp;

System.out.println("Procedons a un tour de magie");
System.out.println("le nombre a est "+nombrea);
System.out.println("le nombre b est "+nombreb);

sc.close();
	}
}