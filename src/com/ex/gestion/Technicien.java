package com.ex.gestion;

public class Technicien extends Employe {

	private final static double FACTEUR_UNITE = 5.0;
	private int unites;
	
	public Technicien(String prenom, String nom, int age, String dateEntree, int unites) {
		super(prenom, nom, age, dateEntree);
		 this.unites = unites;
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return (unites * FACTEUR_UNITE);
	}
	
	public String getTitre() {
		return "Le technicien ";
	}

}
