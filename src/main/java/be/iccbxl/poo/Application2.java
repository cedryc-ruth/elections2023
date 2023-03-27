package be.iccbxl.poo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		ArrayList<ListeElectorale> listes = new ArrayList<>();
		int nbSieges = 0;
		int nbListes = 0;
		
		//=== Lecture des données ===========================
		Scanner s = new Scanner(System.in);
		
		//Demander à l'uitilisateur combien de liste
		System.out.println("Veuillez entrer le nombre de listes en compétition");
		nbListes = lireEntier(s);
		
		//Demander combien de sièges
		System.out.println("Veuillez entrer le nombre de siège à pourvoir");
		nbSieges = lireEntier(s);
		
		//Pour chaque liste, demander
		//- le nom, le nombre de voix obtenues
		
		System.out.println("Veuillez entrer chaque liste électorale");
		for(int i=0;i<nbListes;i++) {
			int id = 0;
			String nom = null;
			int voix = 0;
			
			System.out.println("Id de la liste");
			id = lireEntier(s);
			
			System.out.println("Nom de la liste");
			nom = lireString(s);
			
			System.out.println("Nombre de voix obtenues");
			voix = lireEntier(s);
			
			listes.add(new ListeElectorale(id, nom, voix));
		}
		
		//=== Traitement des données ===========================
		//Calcul du seuil électoral
		
		/*
		l6.setElimine(true);
		l7.setElimine(true);
		*/
		//=== Affichage du résultat ===========================
		Iterator<ListeElectorale> it = listes.iterator();
		
		while(it.hasNext()) {
			ListeElectorale le = it.next();
			
			if(!le.isElimine()) {
				System.out.println(le);
			}
		}
	}

	private static int lireEntier(Scanner s) {
		int nb = 0;
		
		do {
			try {
				nb = s.nextInt();
				if(nb <= 0) {
					System.out.println("Veuillez entrer un nombre positif et non nul!");
				}
			} catch(InputMismatchException e) {
				System.out.println("Veuillez entrer un entier positif et non nul!");
			}
		} while(nb <= 0);
		
		s.nextLine();
		
		return nb;
	}

	private static String lireString(Scanner s) {
		String str = null;
		
		do {
			str = s.nextLine();
			
			if(str.trim().length()==0) {
				System.out.println("Veuillez entrer une chaîne nom vide!");
			}
		} while(str.trim().length()== 0);
		
		return str;
	}

}
