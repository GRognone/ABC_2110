import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		Robot robotParDefaut = new Robot();			 // Creation d'un robot par defaut avec parametres pre - programme
		Robot robotParDefaut2	 = new Robot();	 	// 										"					"
		Robot robotNono= new Robot("1a252",true,"roue",true,0,0,0);
		boolean ilfaitbeauAujourdhui=true;
		boolean lerobotvabien = robotNono.caVa(ilfaitbeauAujourdhui);
		ilfaitbeauAujourdhui=false;
		boolean lerobotvabien2 = robotNono.caVa(ilfaitbeauAujourdhui);
		boolean areussi = robotNono.demarrer();
		boolean areussiPour3= robotParDefaut2.demarrer();
		sc.close();
	}
}
