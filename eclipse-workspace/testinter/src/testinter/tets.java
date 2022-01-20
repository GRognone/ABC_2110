package testinter;

import java.util.Scanner;

public class tets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
		 
		        try {
		            // le maximum
		            int max = 0;
		 
		            // sert a lire depuis le clavier
		            Scanner sc = new Scanner(System.in);
		 
		            // La lecture du maximum
		            System.out.println("Donner un Maximum : \n");
		            max = sc.nextInt();
		 
		            System.out.println("Voilà les nombres parfait : ");
		            for (int j = 1; j <= max; j++) {
		                if (estParfait(j)) {
		                    System.out.println(j);
		                }
		                ;
		            }
		 
		        }
		 
		        catch (Exception e) {
		            System.out.println(e);
		        }
		 
		    }
		 
		    public static boolean estParfait(int nombre) {
		        // Somme des facteurs du nombre.
		        int somme = 0;
		 
		        // Déterminer les facteurs du nombre.
		        for (int i = 1; i <= nombre / 2; i++)
		            if (nombre % i == 0)
		                somme += i;
		 
		        return (nombre == somme);
		    }
		 
		
	}


