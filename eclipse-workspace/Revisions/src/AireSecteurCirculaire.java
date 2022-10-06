import java.util.Scanner;

public class AireSecteurCirculaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//l'aire du secteur circulaire = Pi R2 a / 360 


Scanner sc=new Scanner(System.in);
float rayon;
float angle;
double aire;
System.out.println("veuillez saisir le rayon svp");
rayon=sc.nextFloat();
System.out.println("veuillez saisir l'angle svp");
angle=sc.nextFloat();

aire=(Math.PI*Math.pow(rayon, 2)*angle)/360;
System.out.println("l'aire du secteur circulaire est de "+aire);
sc.close();

	}

}
