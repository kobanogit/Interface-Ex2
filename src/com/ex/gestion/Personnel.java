package com.ex.gestion;

import java.util.ArrayList;
import java.util.Collection;

public class Personnel {
	private Collection<Employe> staff;
	private int nbreEmploye;
	private final static int MAXEMPLOYE = 200; 
	
	public Personnel() {
		staff = new ArrayList<Employe>();
		nbreEmploye = 0;
	}
	
	public void ajouterEmploye(Employe e) {
		++ nbreEmploye;
		if(nbreEmploye <= MAXEMPLOYE) {
			staff.add(e);
		}else {
			System.out.println("Pas plus de " + MAXEMPLOYE + " employés");
		}
	}
	
	public void afficherSalaires() {
		for (Employe emp: staff ){
			System.out.println(emp.getNom() + " gagne " 
					+ emp.calculerSalaire() + "francs");
		}
	}
	
	public double salaireMoyen() {
		double somme = 0; 
		for(Employe emp: staff) {
			somme += emp.calculerSalaire();
		}
		return somme / nbreEmploye;
	}
	
/* Version Array : Employe[]

	private Employe[] staff;
	private int nbreEmploye;
	private final static int MAXEMPLOYE = 200; 
	
	public Personnel() {
		staff = new Employe[MAXEMPLOYE];
		nbreEmploye = 0;
	}
	
	public void ajouterEmploye(Employe e) {
		++ nbreEmploye;
		if(nbreEmploye <= MAXEMPLOYE) {
			staff[nbreEmploye - 1 ] = e;
		}else {
			System.out.println("Pas plus de " + MAXEMPLOYE + " employés");
		}
	}
	
//	public void afficherSalaires() {
//		for (Employe emp: staff ){
//			System.out.println(emp.getNom() + " gagne " 
//					+ emp.calculerSalaire() + "francs");
//		}
//	}
    public void afficherSalaires() {
        for (int i = 0; i < nbreEmploye; i++) {
            System.out.println(staff[i].getNom() + " gagne "
                    + staff[i].calculerSalaire() + " francs.");
        }
    }
	
	public double salaireMoyen() {
		double somme = 0; 
//		for(Employe emp: staff) {
		for(int i = 0 ; i < nbreEmploye; i++) {
			somme += staff[i].calculerSalaire();
		}
		return somme / nbreEmploye;
	}
 
*/
}
